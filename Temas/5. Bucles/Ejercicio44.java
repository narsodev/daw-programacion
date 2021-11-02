/* Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
  Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición donde quiere insertar: 3
    Introduzca el dígito que quiere insertar: 5
    El número resultante es 4056783.
*/
public class Ejercicio44 {
  public static void main(String[] args) {
    int num, posicion, digitoInsertar;
    int base, aux;
    int nCifras = 0;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la posición donde quiere insertar: ");
    posicion = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el dígito que quiere insertar: ");
    digitoInsertar = Integer.parseInt(System.console().readLine());

    for (int i = num; i > 0; i /= 10) nCifras++;

    base = (int) Math.pow(10, nCifras - posicion + 1);
    aux = num / base;
    num = num + (aux * base) * (-1 + 10) + digitoInsertar * base;

    System.out.println("El número resultante es " + num);

  }
}
