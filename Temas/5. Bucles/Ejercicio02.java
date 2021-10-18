// Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
public class Ejercicio02 {
  public static void main(String[] args) {
    int i = 5;
    while (i <= 100) {
      if (i != 0 && i % 5 == 0) System.out.println(i);
      i++;
    }
  }
}
