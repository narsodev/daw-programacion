package Objetos;

public class Rectangulo {
  private static int rectangulosCreados = 0;

  private int anchura;
  private int altura;

  public Rectangulo (int anchura, int altura) {
    rectangulosCreados++;
    this.anchura = anchura;
    this.altura = altura;
  }

  public static int getRectangulosCreados () {
    return rectangulosCreados;
  }

  public String toString() {
    String string = "";

    for (int i = 0; i < this.anchura; i++) string += "*";
    string += "\n";

    for (int i = 0; i < this.altura - 2; i++) {
      for (int j = 0; j < this.anchura; j++) {
        string += "*";
      }
      string += "\n";
    }

    for (int i = 0; i < anchura; i++) string += "*";
    string += "\n";

    return string;
  }
}
