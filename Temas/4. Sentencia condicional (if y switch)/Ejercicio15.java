/* Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha. */

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    char caracter;
    int dir;

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el carácter con el que desea dibujar la pirámide: ");
    caracter = s.nextLine().charAt(0);
    System.out.println();
    
    System.out.println("¿Hacia qué dirección desea que apunte el vértice?");
    System.out.println("  1. Arriba.");
    System.out.println("  2. Derecha.");
    System.out.println("  3. Abajo.");
    System.out.println("  4. Izquierda.");

    System.out.println();
    System.out.print("Opción: ");
    dir = s.nextInt();
    
    s.close();

    System.out.println();
    
    switch (dir) {
      case 1:
        System.out.printf("%7c\n", caracter);
        System.out.printf("%5s%c%c%c\n", "", caracter, caracter, caracter);
        System.out.printf("%4s%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%3s%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%2s%c%c%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%1s%c%c%c%c%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        break;

      case 2:
        System.out.printf("%c\n", caracter);
        System.out.printf("%c%c%c\n", caracter, caracter, caracter);
        System.out.printf("%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%c%c%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%c%c%c\n", caracter, caracter, caracter);
        System.out.printf("%c\n", caracter);
        break;

      case 3:
        System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%1s%c%c%c%c%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%2s%c%c%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%3s%c%c%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%4s%c%c%c%c%c\n", "", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%5s%c%c%c\n", "", caracter, caracter, caracter);
        System.out.printf("%7c\n", caracter);
        break;

      case 4:
        System.out.printf("%7c\n", caracter);
        System.out.printf("%5c%c%c\n", caracter, caracter, caracter);
        System.out.printf("%3c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%c%c%c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%3c%c%c%c%c\n", caracter, caracter, caracter, caracter, caracter);
        System.out.printf("%5c%c%c\n", caracter, caracter, caracter);
        System.out.printf("%7c\n", caracter);
        break;
    }
    System.out.println();
  }
}
