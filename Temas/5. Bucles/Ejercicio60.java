/* Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
  Ejemplo 1:
    Introduzca la altura de los calcetines: 7
    ***    ***
    ***    ***
    ***    ***
    ***    ***
    ***    ***
    ****** ******
    ****** ******
*/
public class Ejercicio60 {
  public static void main(String[] args) {
    int altura;

    do {
      System.out.print("Introduzca la altura de los calcetines: ");
      altura = Integer.parseInt(System.console().readLine());

      if (altura < 4) System.out.println("La altura debe ser mayor o igual a 4");
    } while (altura < 4);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < 14; j++) {
        if (j < 3 || j >= 8 && j < 11 || (i == altura - 1 || i == altura - 2) && j != 6 && j != 7) {
          System.out.print("*");
        } else System.out.print(" ");
      }
      System.out.println();
    }
  }
}

