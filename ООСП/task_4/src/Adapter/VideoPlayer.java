package Adapter;

public class VideoPlayer implements Video{

  @Override
  public void play() {
    System.out.println("Воспроизведение видео");
  }
}
