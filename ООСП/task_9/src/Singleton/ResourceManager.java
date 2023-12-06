package Singleton;

import java.util.HashMap;

public class ResourseManager {
  private static ResourceManager instance;
  private Map<String, Resource> resourceCache;

  private ResourseManager() {
    resourceCache = new HashMap<>();
  }

  public static synchronized ResourceManager getInstance() {
    if (instance == null) {
      instance = new ResourceManager();
    }
    return instance;
  }

  public Resource getResource(String key, String type) {
    Resource resource = resourceCache.get(key);

    if (resource == null) {
      switch (type) {
        case "image":
          resource = new ImageResource(key);
          break;
        case "sound":
          resource = new SoundResource(key);
          break;
        // Добавьте другие типы ресурсов по необходимости
      }

      resourceCache.put(key, resource);
      resource.load();
    }

    return resource;
  }
}
