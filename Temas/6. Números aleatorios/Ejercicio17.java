/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
  Por favor, introduzca la altura de la pecera (como mínimo 4): 4
  Ahora introduzca la anchura (como mínimo 4): 7
  * * * * * * *
  *           *
  *       &   *
  * * * * * * *
*/
public class Ejercicio17 {
  public static void main(String[] args) {
    int x, y;
    int altura, anchura;

    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    altura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    anchura = Integer.parseInt(System.console().readLine());

    x = (int) (Math.random() * (anchura - 2)) + 1;  
    y = (int) (Math.random() * (altura - 2)) + 1; 

    System.out.println();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        if (j == 0 || j + 1 == anchura || i == 0 || i + 1 == altura) System.out.print("* ");
        else if (i == y && j == x) System.out.print("& ");
        else System.out.print("  ");
      }
      System.out.println();
    }
  }
}
