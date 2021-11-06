/* Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
  Ejemplo 1:
    Por favor, introduzca la altura del árbol: 7
        *
        ^
       ^ ^
      ^   ^
     ^     ^
    ^^^^^^^^^
        Y
*/
public class Ejercicio59 {public static void main(String[] args) {
    int altura;
    
    do {
      System.out.print("Por favor, introduzca la altura del árbol: ");
      altura = Integer.parseInt(System.console().readLine());
      
      if (altura < 4) System.out.println("La altura debe ser mayor o igual a 4.");

    } while (altura < 4);

    altura -= 2;

    for (int i = 1; i < altura; i++) System.out.print(" ");
    System.out.println("*");
 
    for (int i = 0; i < altura; i++) {
      for (int j = 1; j <= altura + i; j++) {
        if (j == altura - i || j == altura + i || i == altura - 1) System.out.print("^");
        else System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 1; i < altura; i++) System.out.print(" ");
    System.out.println("Y"); 
  }
}
