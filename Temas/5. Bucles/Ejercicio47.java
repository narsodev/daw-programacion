/* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
  Ejemplo 1:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 8
    La altura introducida no es correcta
  Ejemplo 2:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 3
    La altura introducida no es correcta
  Ejemplo 3:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 5
    MMMMMM
    M    M
    MMMMMM
    M    M
    MMMMMM
  Ejemplo 4:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 9
    MMMMMM
    M    M
    M    M
    M    M
    MMMMMM
    M    M
    M    M
    M    M
    MMMMMM
*/

public class Ejercicio47 {
  public static void main(String[] args) {
    int altura;
    boolean error = false;

    do {
      System.out.print("Introduzca la altura (número impar mayor o igual a 5): ");
      altura = Integer.parseInt(System.console().readLine());

      error = altura % 2 == 0 || altura < 5;

      if (error) System.out.println("La altura introducida no es correcta.");

    } while (error);

    for (int i = 0; i < 2; i++) {
      System.out.println("MMMMMM");
      for (int j = 0; j < (altura - 3) / 2; j++) System.out.println("M    M");
    }
    System.out.println("MMMMMM");
  }  
}
