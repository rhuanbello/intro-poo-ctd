package Aula11;

public class Cachorro extends Animal {
  public Cachorro(String nome, Integer idade) {
    super(nome, idade);
  }

  @Override
  public String emitirSom(){
    return "Au!";
  }

  public void correr(){

  }
}
