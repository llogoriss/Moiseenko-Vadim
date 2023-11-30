package Factory.Furnitures;

import Factory.Furniture;

public class Cabinet extends Furniture {
  public Cabinet(String name) {
    super(name);
  }

  @Override
  public String describe() {
    return name + " - это шкаф";
  }
}
