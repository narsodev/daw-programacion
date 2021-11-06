/* Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres
de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2.
  Ejemplo:
  ******
  *    *
  ******
  1. Agrandarlo
  2. Achicarlo
  3. Cambiar la orientación
  4. Salir
  Indique qué quiere hacer con el rectángulo: 2

  ****
  ****
*/
public class Ejercicio64 {
  public static void main(String[] args) {
    int ancho = 6;
    int alto = 3;

    int opcion;

    do {
      for (int i = 0; i < alto; i++) {
        for (int j = 0; j < ancho; j++) {
          if (i == 0 || j == 0 || j == ancho - 1 || i == alto - 1) System.out.print("* ");
          else System.out.print("  ");
        }
        System.out.println();
      }

      System.out.println("1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");

      System.out.print("Indique qué quiere hacer con el rectángulo: ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          ancho++;
          alto++;
          break;
        case 2:
          if (ancho > 2) ancho--;
          if (alto > 2) alto--;
          break;
        case 3:
          int aux = ancho;
          ancho = alto;
          alto = aux;
          break;
        case 4:
          break;
        default:
          System.out.println("Opción incorrecta.");
          break;
      }

      System.out.print("\n\n");
    } while (opcion != 4);
  }
}
