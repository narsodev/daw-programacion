// Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class Ejercicio22 {
  public static void main(String[] args) {
    boolean primo;

    for (int i = 2; i <= 100; i++) {
      primo = true;

      for (int j = 2; j < i / 2; j++) {
        if (i % j == 0) primo = false;
      }

      if (primo) System.out.println(i);
    }
  }
}
