package Observer;

import java.util.ArrayList;
import java.util.List;

public class HealthObserver implements Observer<Person>{

  private final List<Person> healthSubscribers;

  public HealthObserver() {
    healthSubscribers = new ArrayList<>();
  }

  @Override
  public void register(Person person) {
    healthSubscribers.add(person);
  }

  @Override
  public void notifySub(int subId, String notification) {
    Person sub;
    for(Person healthSubscriber : healthSubscribers) {
      if(healthSubscriber.id == subId){
        sub = healthSubscriber;
        sub.getNotification(sub.name + " " + notification);
        break;
      }
    }
  }

  public void updateHealthState(int id, String newHealthState) {
    notifySub(id, newHealthState);
  }
}
