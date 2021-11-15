/* Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
  Ejemplo 1:
    Por favor, introduzca un número entero positivo: 406783
    7
  Ejemplo 2:
    Por favor, introduzca un número entero positivo: 406783
    3
  Ejemplo 3:
    Por favor, introduzca un número entero positivo: 406783
    0
*/
public class Ejercicio24 {
  public static void main(String[] args) {
    int num;
    int nCifras = 0;
    int cifraAleatoria;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i = num; i > 0; i /= 10) nCifras++;

    cifraAleatoria = (int) (Math.random() * nCifras);

    System.out.println((num / (int) Math.pow(10, cifraAleatoria)) % 10);
  }
}
