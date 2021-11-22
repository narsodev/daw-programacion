/* Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla. */
public class Ejercicio17 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int[] resultado = new int[10];

    int numIntroducido;

    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 101);
      System.out.printf("%d ", num); 
      nums[i] = num;
    }

    int posicion = -1;
    do {
      int i = 0;

      System.out.print("\nIntroduzca un número del array: ");
      numIntroducido = Integer.parseInt(System.console().readLine());

      do {
        if (nums[i] == numIntroducido) posicion = i;
        else i++;
      } while (posicion == -1 && i < 10);

      if (posicion == -1) System.out.print("Valor no encotrando.");
    } while (posicion == -1);

    if (posicion == 9) {
      resultado[0] = numIntroducido;
      for (int i = 1; i < 10; i++) resultado[i] = nums[i - 1];
    } else {
      for (int i = 0; i < 10 - posicion; i++) resultado[i] = nums[posicion + i];
      for (int i = 0; i < posicion; i++) resultado[9 - i] = nums[posicion - 1 - i];
    }
    for (int num: resultado) System.out.printf("%d ", num);
  }
}
