/* Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
Ejemplo:
  Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca
  un número primo:
    6
    8
    15
    12
    23
    Ha introducido 4 números no primos.
    Máximo: 15
    Mínimo: 6
    Media: 10.25
*/
public class Ejercicio49 {
  public static void main(String[] args) {
    int num;
    int cantidadNumeros = 0;
    int max = 0;
    int min = Integer.MAX_VALUE;
    double media = 0;
    boolean esPrimo;

    System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
    
    int i;
    do {
      esPrimo = true;
      num = Integer.parseInt(System.console().readLine());
      
      if (num == 1) esPrimo = false;
      else {
        i = 2;
        do {
          if (num % i == 0) esPrimo = false;
          else i++;
        } while (esPrimo && i <= Math.sqrt(num));
      }

      if (!esPrimo) {
        cantidadNumeros++;
        if (num > max) max = num;
        if (num < min) min = num;
        media += num;
      }
    } while (!esPrimo);

    media /= cantidadNumeros;

    System.out.printf("Ha introducido %d números no primos.\n", cantidadNumeros);
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.printf("Media: %.2f\n", media);
  }
}
