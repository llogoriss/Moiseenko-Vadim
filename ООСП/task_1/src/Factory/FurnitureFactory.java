package Factory;

import Factory.Furnitures.Cabinet;
import Factory.Furnitures.Chair;
import Factory.Furnitures.Table;

public class FurnitureFactory {
  public Furniture createFurniture(String name, String type) {
    Furniture furniture = null;

    switch (type) {
      case "chair":
        furniture = new Chair(name);
        break;
      case "table":
        furniture = new Table(name);
        break;
      case "cabinet":
        furniture = new Cabinet(name);
        break;
      default:
        System.out.println("Неизвестный тип мебели");
    }

    return furniture;
  }}
