package Objetos;

public class Apuesta {
  private static final String COLOR_RESET = "\u001B[0m";
  private static final String COLOR_ROJO = "\u001B[31m";

  private boolean aleatoria;
  private int[] numeros;

  public Apuesta () {
    numeros = new int[6];

    for (int i = 0; i < numeros.length; i++) {
      this.aleatoria = true;
      numeros[i] = (int) (Math.random() * 49) + 1;
    }
  }

  public Apuesta (int n1, int n2, int n3, int n4, int n5, int n6) {
    this.aleatoria = false;
    numeros = new int[] { n1, n2, n3, n4, n5, n6 };
  }

  public String toString () {
    String string = this.aleatoria ? COLOR_ROJO : "";

    for (int num: numeros) string += num + " ";

    if (this.aleatoria) string += COLOR_RESET;

    return string;
  }
}