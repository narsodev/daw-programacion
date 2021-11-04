/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
  Ejemplo 1:
    Introduzca un número: 609831
    El número resultado es 160983
*/
public class Ejercicio55 {
  public static void main(String[] args) {
    long num;
    int ultimaCifra;
    int nCifras = 0;

    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());

    for (long i = num; i > 0; i /= 10) nCifras++;

    ultimaCifra = (int) (num % 10);
    num = num / 10 + (int) Math.pow(10, nCifras - 1) * ultimaCifra;

    System.out.println("El número resultante es " + num);
  }
}
