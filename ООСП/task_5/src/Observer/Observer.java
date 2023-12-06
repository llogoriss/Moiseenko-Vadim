package Observer;

public interface Observer <T> {
  void register(T subscriber);
  void notifySub(int id, String notification);
}
