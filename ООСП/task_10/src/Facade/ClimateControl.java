package Facade;

public class ClimatControle {
  public void setTemperature(int temperature) {
    System.out.println("Установлена температура: " + temperature + "°C");
  }

  public void turnOnAC() {
    System.out.println("Кондиционер включен");
  }

  public void turnOffAC() {
    System.out.println("Кондиционер выключен");
  }
}
