/* Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. */
public class Ejercicio34 {
  public static void main(String[] args) {
    long num1, num2;
    int cifra1, cifra2;
    int nCifras = 0;
    long pares = 0;
    long impares = 0;

    System.out.print("Introduzca el número 1: ");
    num1 = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca el número 2: ");
    num2 = Long.parseLong(System.console().readLine());

    for (long i = num1; i > 0; i /= 10) {
      nCifras++;
    }

    for (int i = nCifras - 1; i >= 0; i--) {
      int base = (int) Math.pow(10, i);

      cifra1 = (int) (num1 / base);
      num1 -= cifra1 * base;

      cifra2 = (int) (num2 / base);
      num2 -= cifra2 * base;

      if (cifra1 % 2 == 0) {
        pares *= 10;
        pares += cifra1;
      } else {
        impares *= 10;
        impares += cifra1;
      }
      
      if (cifra2 % 2 == 0) {
        pares *= 10;
        pares += cifra2;
      } else {
        impares *= 10;
        impares += cifra2;
      }
    }

    System.out.println("Pares: " + pares);
    System.out.println("Impares: " + impares);
  }
}
