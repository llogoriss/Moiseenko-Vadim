package Observer;

public class Person {
  public String name;
  public int id;

  public Person(String name, int id, HealthObserver observer) {
    this.name = name;
    this.id = id;
    observer.register(this);
  }

  public void getNotification(String notification){
    System.out.println(notification);
  }
}
