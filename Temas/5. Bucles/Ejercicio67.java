/* Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
  Ejemplo 1:
    Introduzca el número de escalones: 4
    Introduzca la altura de cada escalón: 2
    ****
    ****
    ********
    ********
    ************
    ************
    ****************
    ****************
*/
public class Ejercicio67 {
  public static void main(String[] args) {
    int numEscalones;
    int alturaEscalon;

    System.out.print("Introduzca el número de escalones: ");
    numEscalones = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la altura de cada escalón: ");
    alturaEscalon = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <= numEscalones; i++) {
      for (int j = 0; j < alturaEscalon; j++) {
        for (int k = 0; k < 4 * i; k++) System.out.print("*");
        System.out.println();
      }
    }
  }
}
