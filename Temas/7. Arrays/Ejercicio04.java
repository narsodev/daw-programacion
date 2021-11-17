/* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas. */
public class Ejercicio04 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    int num;

    for (int i = 0; i < 20; i++) {
      num = (int) (Math.random() * 101);
      numero[i] = num;
      cuadrado[i] = num * num;
      cubo[i] = num * num * num;
      System.out.printf("%d %6d %8d\n", num, cuadrado[i], cubo[i]);
    }

  }  
}
