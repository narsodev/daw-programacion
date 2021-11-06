/* Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
  Ejemplo 1:
    Introduzca la altura de la V (un número mayor o igual a 3): 7
    ***            ***
     ***          ***
      ***        ***
       ***      ***
        ***    ***
         ***  ***
          ******
*/
public class Ejercicio61 {
  public static void main(String[] args) {
    int altura;

    do {
      System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
      altura = Integer.parseInt(System.console().readLine());

      if (altura < 3) System.out.println("La altura debe ser mayor o igual a 3.");
    } while (altura < 3);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j <= altura * 2 - i + 3; j++) {
        if (j >= i && j < i + 3 || j > altura * 2 - i) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
