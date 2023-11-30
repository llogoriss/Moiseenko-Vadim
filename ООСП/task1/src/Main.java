import Factory.Furniture;
import Factory.FurnitureFactory;

public class Main {
  public static void main(String[] args) {
    FurnitureFactory factory = new FurnitureFactory();

    Furniture chair = factory.createFurniture("Офисный стул", "chair");
    Furniture table = factory.createFurniture("Кухонный стол", "table");
    Furniture cabinet = factory.createFurniture("Книжный шкаф", "cabinet");

    System.out.println(chair.describe());
    System.out.println(table.describe());
    System.out.println(cabinet.describe());
  }
}