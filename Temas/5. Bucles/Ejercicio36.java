/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.

Ejemplo 1:
  Por favor, introduzca un número entero positivo: 678
  El 678 no es capicúa.
Ejemplo 2:
  Por favor, introduzca un número entero positivo: 2019102
  El 2019102 es capicúa.
*/
public class Ejercicio36 {
  public static void main(String[] args) {
    long num, numMod;
    boolean esCapicua = true;
    int nCifras = 0;
    int base1;
    int primeraCifra, ultimaCifra;


    System.out.print("Introduzca el número: ");
    num = Long.parseLong(System.console().readLine());
    numMod = num;

    for (long i = num; i > 0; i /= 10) {
      nCifras++;
    }

    int i = nCifras - 1;

    while (esCapicua && i >= 0) {
      base1 = (int) Math.pow(10, i);
      primeraCifra = (int) (numMod / base1);
      ultimaCifra = (int) (numMod % 10);

      numMod -= primeraCifra * base1;
      numMod -= ultimaCifra;
      numMod /= 10;

      if (primeraCifra != ultimaCifra) esCapicua = false;

      i -= 2;
    }

    System.out.println(num + (esCapicua ? " " : " no ") + "es capicúa.");
  }
}


/*

      base1 = (int) Math.pow(10, i);
      primeraCifra = (int) (num / base1);
      base2 = (int) Math.pow(10, nCifras - i);
      ultimaCifra = (int) (num % base2);

      num -= primeraCifra * base1 + ultimaCifra * base2;
      */
