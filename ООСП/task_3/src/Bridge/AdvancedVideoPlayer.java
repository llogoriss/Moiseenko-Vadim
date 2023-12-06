package Bridge;

public class AdvancedVideoPlayer extends VideoPlayer{
  private final VideoSource videoSource;

  public AdvancedVideoPlayer(Display display, VideoSource videoSource) {
    super(display);
    this.videoSource = videoSource;
  }

  @Override
  public void play() {
    videoSource.playVideo();
    display.show("playing video");
  }
}
