/* 
Realice un programa que convierta a 5 divisas una cantidad dada:
  euro
  dolar
  libra
  yen
  yuan

El programa solicitará al usuario la divisa de entrada,
así como la cantidad de dinero en dicha divisa.

Una vez realice los cálculos oportunos, el programa mostrará la
equivalencia de la cantidad de dinero introducida en las 5 divisas
indicadas.
*/

import java.util.Scanner;

public class EjercicioExtra01 {
  public static void main(String[] args) {
    final double FACTOR_DOLAR = 1.1624292;
    final double FACTOR_LIBRA = 0.84397037;
    final double FACTOR_YEN = 133.04763;
    final double FACTOR_YUAN = 7.4347745;

    String divisa;
    double euro;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la divisa (euro, dolar, libra, yen, yuan). Por defecto es euro: ");
    divisa = s.nextLine();

    System.out.print("Introduzca la cantidad: ");
    // Utilizo euro para leer la cantidad, ya que realizo una conversión intermedia a euros.
    euro = s.nextDouble();

    s.close();

    switch (divisa) {
      case "dolar":
        euro /= FACTOR_DOLAR;
        break;
      
      case "libra":
        euro /= FACTOR_LIBRA;
        break;
      
      case "yen":
        euro /= FACTOR_YEN;
        break;
      
      case "yuan":
        euro /= FACTOR_YUAN;
        break;

      default:
    }
    
    System.out.printf("Euros: %.2f €\n", euro);
    System.out.printf("Dolares: %.2f $\n", (euro * FACTOR_DOLAR));
    System.out.printf("Libras: %.2f £\n", (euro * FACTOR_LIBRA));
    System.out.printf("Yenes: %.2f ¥ japonés\n", (euro * FACTOR_YEN));
    System.out.printf("Yuanes: %.2f ¥ chino\n", (euro * FACTOR_YUAN));
  }  
}
