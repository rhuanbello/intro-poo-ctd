package Aula05.Mesa01;

public class UsuarioJogo {
  private String name;
  private String nickName;
  private int score;
  private int level;

  public UsuarioJogo(String name, String nickName) {
    this.name = name;
    this.nickName = nickName;
    this.score = 0;
    this.level = 1;
  }

  public void increaseScore() {
    this.score++;
    showStatus("score");

  }
  public void increaseLevel() {
    this.level++;
    showStatus("level");
  }

  private void showStatus (String type) {
    switch (type) {
      case "score":
        System.out.println(this.name + " Tem um score de " + this.score + "pontos");
        break;
      case "level":
        System.out.println(this.name + " Está no nível " + this.level);
        break;
    }
  }

  public void increaseBonus(int score) {
    this.score += score;
    System.out.println(this.score);
  }

  public String getName() {
    return name;
  }

  public String getNickName() {
    return nickName;
  }

  public int getScore() {
    return score;
  }

  public int getLevel() {
    return level;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
}
