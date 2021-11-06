/* Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
Ejemplo 1:
Introduzca la altura de la primera pirámide: 7
Introduzca la altura de la segunda pirámide: 3
      *
     ***
    *****
   *******
  *********     *
 ***********   ***
************* *****
*/
public class Ejercicio63 {
  public static void main(String[] args) {
    int altura1, altura2;
    int fila1 = 0;
    int fila2 = 0;
    int alturaMayor;
    
    System.out.print("Introduzca la altura de la primera pirámide: ");
    altura1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura de la segunda pirámide: ");
    altura2 = Integer.parseInt(System.console().readLine());

    alturaMayor = altura1 >= altura2 ? altura1 : altura2;
    
    for (int i = 1; i <= alturaMayor; i++) {
      if (alturaMayor - i < altura1) fila1++;
      for (int j = 1; j <= altura1 * 2; j++) {
        if (j > altura1 - fila1 && j < altura1 + fila1) System.out.print("*");
        else System.out.print(" ");
      }

      if (alturaMayor - i < altura2) fila2++;
      for (int j = 1; j < altura2 * 2; j++) {
        if (j > altura2 - fila2 && j < altura2 + fila2) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
