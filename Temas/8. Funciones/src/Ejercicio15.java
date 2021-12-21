// Muestra los números primos que hay entre 1 y 1000.
import paquetes.Ejercicios01_14;

public class Ejercicio15 {
  public static void main(String[] args) {
    int contador = 1;
    do {
      contador = (int) Ejercicios01_14.siguientePrimo(contador);
      if (contador <= 1000) System.out.print(contador + " ");
    } while (contador < 1000);
  }
}
