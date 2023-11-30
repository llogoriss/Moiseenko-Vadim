import Adapter.Audio;
import Adapter.VideoPlayer;

public class Main {
  public static void main(String[] args) {
    VideoPlayer videoPlayer = new VideoPlayer();
    videoPlayer.play();

    Audio audio = new Audio();
    audio.play();
  }
}