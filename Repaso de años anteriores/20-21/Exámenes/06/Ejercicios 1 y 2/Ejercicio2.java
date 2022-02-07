import Objetos.Complejo;

public class Ejercicio2 {
  public static void main(String[] args) {
    Complejo a = new Complejo(0, 0);
    Complejo b = new Complejo(-1, 5);
    Complejo c = new Complejo(4.2f, -3.68f);
    Complejo d = new Complejo(-11.11f, -22.22f);
    Complejo e = new Complejo(30, 0);

    Complejo c1 = a.suma(b);
    Complejo c2 = c.suma(d);
    Complejo c3 = c.multiplica(10);
    Complejo c4 = c.multiplica(d);
    Complejo c5 = d.multiplica(e);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
  }
}
