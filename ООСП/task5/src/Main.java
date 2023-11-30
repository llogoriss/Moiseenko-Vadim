import Observer.*;
import Observer.Person;

public class Main {
  public static void main(String[] args) {
      HealthObserver healthObserver = new HealthObserver();

      Person Maxim = new Person("Максим",1, healthObserver);
      Person Vadim = new Person("Вадим", 2, healthObserver);

      healthObserver.updateHealthState(1, "Ваше здоровье ухудшилось");
  }
}