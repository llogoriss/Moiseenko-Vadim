package Singleton;

public class SoundResourse implements Resourse {
  private String filename;

  public void SoundResource(String filename) {
    this.filename = filename;
  }

  @Override
  public void load() {
    System.out.println("Загрузка звука: " + filename);
  }

  @Override
  public void play() {
    System.out.println("Воспроизведение звука: " + filename);
  }
}
