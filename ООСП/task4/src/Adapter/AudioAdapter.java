package Adapter;

public class AudioAdapter implements Video{

  private Audio audio;

  public AudioAdapter audioAdapter(Audio audio) {
    this.audio = audio;
    return null;
  }

  @Override
  public void play() {
    audio.play();
  }
}
