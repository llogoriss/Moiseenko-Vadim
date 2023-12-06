import Bridge.*;

public class Main {
  public static void main(String[] args) {
    Display tv = new Television();
    Display monitor = new Monitor();
    Display projector = new Projector();

    VideoSource onlineVideo = new OnlineVideo();
    VideoSource localVideo = new LocalVideo();

    VideoPlayer tvPlayer = new AdvancedVideoPlayer(tv, onlineVideo);
    VideoPlayer monitorPlayer = new AdvancedVideoPlayer(monitor, localVideo);
    VideoPlayer projectorPlayer = new AdvancedVideoPlayer(projector, onlineVideo);

    tvPlayer.play();
    monitorPlayer.play();
    projectorPlayer.play();
    }
  }