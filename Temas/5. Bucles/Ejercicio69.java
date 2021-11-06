/* Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.
  Ejemplo 1:
    Introduzca la altura de la pirámide maya: 5
        ******
       **    **
      **********
     ****    ****
    **************
*/
public class Ejercicio69 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura de la pirámide maya: ");
    altura = Integer.parseInt(System.console().readLine());

    int limite;

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura + 5 + i; j++) {
        limite = altura - i - 1;
        System.out.print(j < limite || j > limite + i && i % 2 != 0 && j < limite + i + 5 ? " " : "*");
      }
      System.out.println();
    }
  }
}
