import Momento.*;

public class Main {
  public static void main(String[] args) {
    PlayerSettings playerSettings = new PlayerSettings("Player1", 1, true);
    System.out.println("Начальные настройки: " + playerSettings.getPlayerName() +
        ", Уровень " + playerSettings.getLevel() +
        ", Звук " + (playerSettings.isSoundEnabled() ? "включен" : "выключен"));

    PlayerSettingsCareTaker careTaker = new PlayerSettingsCareTaker();

    careTaker.setMemento(playerSettings.createMemento());

    playerSettings.setPlayerName("Player2");
    playerSettings.setLevel(5);
    playerSettings.setSoundEnabled(false);
    System.out.println("Измененные настройки: " + playerSettings.getPlayerName() +
        ", Уровень " + playerSettings.getLevel() +
        ", Звук " + (playerSettings.isSoundEnabled() ? "включен" : "выключен"));

    playerSettings.restoreFromMemento(careTaker.getMemento());
    System.out.println("Восстановленные настройки: " + playerSettings.getPlayerName() +
        ", Уровень " + playerSettings.getLevel() +
        ", Звук " + (playerSettings.isSoundEnabled() ? "включен" : "выключен"));
  }
}