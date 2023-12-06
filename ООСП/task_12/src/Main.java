import Composite.*;

public class Main {
  public static void main(String[] args) {
      MenuCategory pastaCategory = new MenuCategory("Паста");
      MenuCategory pizzaCategory = new MenuCategory("Пицца");

      MenuComponent spaghetti = new MenuItem("Спагетти", 400);
      MenuComponent lasagna = new MenuItem("Ласагна", 300);
      MenuComponent margheritaPizza = new MenuItem("Маргарита Пицца", 800);
      MenuComponent pepperoniPizza = new MenuItem("Пепперони Пицца", 700);

      pastaCategory.add(spaghetti);
      pastaCategory.add(lasagna);
      pizzaCategory.add(margheritaPizza);
      pizzaCategory.add(pepperoniPizza);

      MenuCategory mainMenu = new MenuCategory("Главное меню");

      mainMenu.add(pastaCategory);
      mainMenu.add(pizzaCategory);

      mainMenu.display();
  }
}