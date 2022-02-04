import paquetes.Utils;
public class Ejercicio15 {
  public static void main(String[] args) {
    long primoActual = 0;

    do {
      primoActual = Utils.siguientePrimo(primoActual);
      if (primoActual < 1000) System.out.print(primoActual + " ");  
    } while (primoActual < 1000);
  }
}