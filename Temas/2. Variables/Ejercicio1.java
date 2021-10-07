/* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación. */
public class Ejercicio1 {
  public static void main(String[] args) {
    int x = 144;
    int e = 999;

    System.out.printf("\"X\" + \"E\": %d\n", (x + e));
    System.out.printf("\"X\" - \"E\": %d\n", (x - e));
    System.out.printf("\"E\" - \"X\": %d\n", (e - x));
    System.out.printf("\"X\" * \"E\": %d\n", (x * e));
    System.out.printf("\"X\" / \"E\": %.2f\n", ((double) x / e));
    System.out.printf("\"E\" / \"X\": %.2f\n", ((double) e / x));
  }
}
