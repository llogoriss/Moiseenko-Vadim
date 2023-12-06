package Factory;

abstract public class Furniture {
  protected String name;

  public Furniture(String name) {
    this.name = name;
  }

  public abstract String describe();
}
