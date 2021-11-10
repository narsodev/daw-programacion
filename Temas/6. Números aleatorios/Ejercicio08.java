/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. */
public class Ejercicio08 {
  public static void main(String[] args) {
    String resultado;
    int columnas = 3;

    for (int i = 1; i <= 15; i++) {
      System.out.print(i + ":\t");

      if (i == 15) columnas = 1;

      for (int j = 0; j < columnas; j++) {
        resultado = String.valueOf((int) (Math.random() * 6));
        switch (resultado) {
          case "0", "1", "2":
            resultado = "1";
            break;
          case "3", "4":
            resultado = "2";
            break;
          default:
            resultado = "x";
            break;
        }
        System.out.print(resultado + "\t");
      }

      System.out.println();
    }
  }  
}
