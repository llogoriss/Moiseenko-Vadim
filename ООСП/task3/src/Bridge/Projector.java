package Bridge;

public class Projector implements Display{
  @Override
  public void show(String video) {
    System.out.println("Displaying video on Projector: " + video);
  }
}
