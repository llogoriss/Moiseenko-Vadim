package Factory.Furnitures;

import Factory.Furniture;

public class Chair extends Furniture {
  public Chair(String name) {
    super(name);
  }

  @Override
  public String describe() {
    return name + " - это стул";
  }
}
