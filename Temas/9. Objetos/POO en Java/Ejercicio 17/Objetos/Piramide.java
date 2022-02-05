package Objetos;

public class Piramide {
  private static int piramidesCreadas = 0;

  private int altura;

  public Piramide (int altura) {
    this.altura = altura;
    piramidesCreadas++;
  }

  public static int getPiramidesCreadas () {
    return piramidesCreadas;
  }

  public String toString() {
    String string = "";

    for (int i = 0; i < this.altura; i++) {
      for (int j = 0; j < this.altura + i; j++) {
        string += j < this.altura - i - 1 ? " " : "*"; 
      }
      string += "\n";
    }

    return string;
  }
}
