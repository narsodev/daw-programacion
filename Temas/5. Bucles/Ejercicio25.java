/* Realiza un programa que pida un número por teclado y
que luego muestre ese número al revés. */
public class Ejercicio25 {
  public static void main(String[] args) {
    int num;
    int numAlReves = 0;

    System.out.print("Introduzca el número: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i = num; i > 0; i /= 10) {
      numAlReves *= 10;
      numAlReves += i % 10;
    }

    System.out.printf("El número %d al revés es: %d\n", num, numAlReves);
  }  
}
