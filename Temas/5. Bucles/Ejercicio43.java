/* Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).

  Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición a partir de la cual quiere partir el número: 5
    Los números partidos son el 4067 y el 83.
*/
public class Ejercicio43 {
  public static void main(String[] args) {
    int num;
    int posicionPartir;
    int nCifras = 0;
    int numPrimeraParte = 0;
    int cifra, base;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    posicionPartir = Integer.parseInt(System.console().readLine());

    for (int i = num; i > 0; i /= 10) nCifras++;

    for (int i = nCifras - 1; i > nCifras - posicionPartir; i--) {
      base = (int) Math.pow(10, i);
      cifra = num / base;

      numPrimeraParte *= 10;
      numPrimeraParte += cifra;
      
      num -= cifra * base;
    }

    System.out.printf("Los números partidos son el %d y el %d.\n", numPrimeraParte, num);
  }
}
