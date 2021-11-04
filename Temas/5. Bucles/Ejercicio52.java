/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.
  Ejemplo 1:
    Introduzca un número: 609831
    El número resultado es 98316
  Ejemplo 2:
    Introduzca un número: 78201345
    El número resultado es 82013457
  Ejemplo 3:
    Introduzca un número: 24
    El número resultado es 42
  Ejemplo 4:
    Introduzca un número: 8
    El número resultado es 8
*/
public class Ejercicio52 {
  public static void main(String[] args) {
    long num;
    int nCifras = 0;
    int primerNumero;

    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());

    for (long i = num; i > 0; i /= 10) nCifras++;

    primerNumero = (int) (num / Math.pow(10, nCifras - 1)); 
    
    num = (num - (primerNumero * (int) Math.pow(10, nCifras - 1))) * 10 + primerNumero;

    System.out.println("El número resultante es " + num);
  }
}
