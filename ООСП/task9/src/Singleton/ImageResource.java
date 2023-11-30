package Singleton;

public class ImageResource implements Resource {
  private final String filename;

  public ImageResource(String filename) {
    this.filename = filename;
  }

  @Override
  public void load() {
    System.out.println("Загрузка изображения: " + filename);
  }

  @Override
  public void play() {
    System.out.println("Воспроизведение изображения: " + filename);
  }
}
