package Bridge;

public class OnlineVideo implements VideoSource{
  @Override
  public void playVideo() {
    System.out.println("Playing online video");
  }
}
