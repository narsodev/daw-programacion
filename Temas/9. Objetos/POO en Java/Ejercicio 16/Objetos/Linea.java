package Objetos;

public class Linea {
  private Punto punto1;
  private Punto punto2;

  public Linea (Punto punto1, Punto punto2) {
    this.punto1 = punto1;
    this.punto2 = punto2;
  }

  public String toString () {
    String stringPunto1 = punto1.getX()  + ", " + punto1.getY();
    String stringPunto2 = punto2.getX()  + ", " + punto2.getY();

    return String.format("Línea formada por los puntos (%s) y (%s)", stringPunto1, stringPunto2);
  }
}
