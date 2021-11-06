/* Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
  Ejemplo 1:
    Introduzca la altura de la A (un número mayor o igual a 3): 7
    Introduzca la fila del palito horizontal (entre 2 y 6): 5
          *
         * *
        *   *
       *     *
      *********
     *         *
    *           *
*/
public class Ejercicio65 {
  public static void main(String[] args) {
    int altura;
    int alturaPalito;
    boolean error;

    do {
      System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
      altura = Integer.parseInt(System.console().readLine());
      
      error = altura < 3;

      if (error) System.out.println("Error.");

    } while (error);

    do {
      System.out.printf("Introduzca la fila del palito horizontal (entre 2 y %d): ", altura - 1);
      alturaPalito = Integer.parseInt(System.console().readLine());

      error = alturaPalito < 2 || alturaPalito >= altura;

      if (error) System.out.println("Error.");

    } while (error);

    for (int i = 0; i < altura; i++) {
      for (int j = 1; j <= altura + i; j++) {
        if (j == altura - i || j == altura + i || i == alturaPalito - 1 && j > altura - i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
