/* Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
  Ejemplo 1:
  Introduzca el número total de nombres de reyes: 7
  Vaya introduciendo los nombres de los reyes y pulsando INTRO.
  Felipe
  Carlos
  Carlos
  Fernando
  Carlos
  Carlos
  Felipe

  Los reyes introducidos son:
  Felipe 1º
  Carlos 1º
  Carlos 2º
  Fernando 1º
  Carlos 3º
  Carlos 4º
  Felipe 2º
*/
public class Ejercicio20 {
  public static void main(String[] args) {
    int cantidadReyes;  
    String[] reyes;

    System.out.print("Introduzca el número total de nombres de reyes: ");
    cantidadReyes = Integer.parseInt(System.console().readLine());

    reyes = new String[cantidadReyes];

    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    for (int i = 0; i < cantidadReyes; i++) reyes[i] = System.console().readLine();

    System.out.println("Los reyes introducidos son:");

    for (int i = 0; i < cantidadReyes; i++) {
      int contadorReyes = 0;
      String rey = reyes[i];
      for (int j = 0; j <= i; j++) {
        if (rey.equals(reyes[j])) contadorReyes++;
      }
      System.out.printf("%s %dº\n", rey, contadorReyes);
    }
  }
}
