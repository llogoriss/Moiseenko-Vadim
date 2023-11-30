package Momento;

public class PlayerSettings {
  private String playerName;
  private int level;
  private boolean soundEnabled;

  public PlayerSettings(String playerName, int level, boolean soundEnabled) {
    this.playerName = playerName;
    this.level = level;
    this.soundEnabled = soundEnabled;
  }

  public PlayerSettingsMemento createMemento() {
    return new PlayerSettingsMemento(playerName, level, soundEnabled);
  }

  public void restoreFromMemento(PlayerSettingsMemento memento) {
    this.playerName = memento.playerName();
    this.level = memento.level();
    this.soundEnabled = memento.soundEnabled();
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean isSoundEnabled() {
    return soundEnabled;
  }

  public void setSoundEnabled(boolean soundEnabled) {
    this.soundEnabled = soundEnabled;
  }
}
