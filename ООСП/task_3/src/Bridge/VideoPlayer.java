package Bridge;

public abstract class VideoPlayer {
  protected Display display;

  public VideoPlayer(Display display) {
    this.display = display;
  }
  public abstract void play();
}
