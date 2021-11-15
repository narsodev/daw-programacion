/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
  Ejemplo 1:
    diamante diamante limón
    Bien, ha recuperado su moneda
  Ejemplo 2:
    herradura campana diamante
    Lo siento, ha perdido
  Ejemplo 3:
    corazón corazón corazón
    Enhorabuena, ha ganado 10 monedas
*/
public class Ejercicio16 {
  public static void main(String[] args) {
    int num1, num2;
    int numGenerado = 0;
    String figura;

    num1 = (int) (Math.random() * 5);
    num2 = (int) (Math.random() * 5);

    for (int i = 0; i < 3; i++) {
      numGenerado = (int) (Math.random() * 5);

      if (i == 0) num1 = numGenerado;
      if (i == 1) num2 = numGenerado;

      switch (numGenerado) {
        case 0:
          figura = "corazón";
          break;
        case 1:
          figura = "diamante";
          break;
        case 2:
          figura = "herradura";
          break;
        case 3:
          figura = "campana";
          break;
        case 4:
          figura = "limón";
          break;
        default:
          figura = "";
      }

      System.out.print(figura + " ");
    }

    System.out.println();

    if (num1 == num2 && num1 == numGenerado) System.out.println("Enhorabuena, ha ganado 10 monedas");
    else if (num1 == num2 || num1 == numGenerado || num2 == numGenerado) System.out.println("Bien, ha recuperado su moneda");
    else System.out.println("Lo siento, ha perdido");
  }
}
