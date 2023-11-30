package Bridge;

public class Monitor implements Display{
  @Override
  public void show(String video) {
    System.out.println("Displaying video on Monitor: " + video);
  }
}
