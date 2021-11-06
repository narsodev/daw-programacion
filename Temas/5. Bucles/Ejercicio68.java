/* Escribe un programa que pida un número por teclado y que luego lo “disloque”
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
  Ejemplo 1:
    Por favor, introduzca un número: 9402
    Dislocando el 9402 sale el 8513.
  Ejemplo 2:
    Por favor, introduzca un número: 870958422
    Dislocando el 870958422 sale el 961849533.
  Ejemplo 3:
    Por favor, introduzca un número: 137
    Dislocando el 137 sale el 26
*/
public class Ejercicio68 {
  public static void main(String[] args) {
    long num;
    long numDislocado = 0;
    int digito;
    int base = 1;

    System.out.print("Introduzca el número: ");
    num = Long.parseLong(System.console().readLine());

    for (long i = num; i > 0; i /= 10) {
      digito = (int) (i % 10);
      numDislocado += base * (digito + (digito % 2 == 0 ? 1 : - 1));
      base *= 10;
    }

    System.out.printf("Dislocando el %d sale el %d.", num, numDislocado);
  }
}
