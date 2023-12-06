package Bridge;

public class Television implements Display{
  @Override
  public void show(String video) {
    System.out.println("Displaying video on Television: " + video);
  }
}
