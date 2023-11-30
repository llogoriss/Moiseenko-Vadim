package Composite;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
  private final String name;
  private final List<MenuComponent> menuItems;

  public MenuCategory(String name) {
    this.name = name;
    this.menuItems = new ArrayList<>();
  }

  public void add(MenuComponent menuComponent) {
    menuItems.add(menuComponent);
  }

  @Override
  public void display() {
    System.out.println(name);
    for (MenuComponent menuComponent : menuItems) {
      menuComponent.display();
    }
  }
}
