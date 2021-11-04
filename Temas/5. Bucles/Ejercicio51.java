/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
  Ejemplo 1:
    Introduzca un número entero (mayor que cero): 51803458
    Después de haber sido comido por el gusano numérico se queda en 51345
  Ejemplo 2:
    Introduzca un número entero (mayor que cero): 29614
    El gusano numérico no se ha comido ningún dígito.
*/
public class Ejercicio51 {
  public static void main(String[] args) {
    long num;
    long resultado = 0;
    int digito;
    long base = 1;

    System.out.print("Introduzca un número entero (mayor que cero): ");
    num = Integer.parseInt(System.console().readLine());

    for (long i = num; i > 0; i /= 10) {
      digito = (int) (i % 10);
      if (digito != 0 && digito != 8) {
        resultado += digito * base;
        base *= 10;
      }
    }

    if (num == resultado) System.out.println("El gusano numérico no se ha comido ningún dígito");
    else System.out.println("Después de haber sido comido por el gusano numérico se queda en " + resultado);
  }
}
