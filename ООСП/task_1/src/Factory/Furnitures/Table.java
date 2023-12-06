package Factory.Furnitures;

import Factory.Furniture;

public class Table extends Furniture {
  public Table(String name) {
    super(name);
  }

  @Override
  public String describe() {
    return name + " - это стол";
  }
}
