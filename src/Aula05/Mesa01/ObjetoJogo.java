package Aula05.Mesa01;

public class ObjetoJogo {
  public static void main(String[] args) {
    UsuarioJogo characterOne = new UsuarioJogo("Rhuan", "rhuanbello");
    characterOne.getNickName();
    characterOne.getScore();
    characterOne.increaseBonus(10);
    characterOne.increaseLevel();
  }
}
