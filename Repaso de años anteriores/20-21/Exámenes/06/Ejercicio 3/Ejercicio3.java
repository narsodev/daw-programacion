import Objetos.Apuesta;

public class Ejercicio3 {
  public static void main(String[] args) {
    

    Apuesta a1 = new Apuesta(5, 6, 8, 23, 24, 33);
    Apuesta a2 = new Apuesta(7, 12, 18, 21, 27, 38);
    Apuesta a3 = new Apuesta();

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

    for (int i = 0; i < 10; i++) {
      System.out.println(new Apuesta());
    }
  }
}