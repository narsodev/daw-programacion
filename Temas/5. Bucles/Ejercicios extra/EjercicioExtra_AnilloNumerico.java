public class EjercicioExtra_AnilloNumerico {
  public static void main(String[] args) {
    int size, mitad, minimo, numeroPintado;

    System.out.print("Introduzca el tamaño máximo que podrá tener el anillo (impar): ");
    size = (int) (Math.random() * Integer.parseInt(System.console().readLine()));
    
    size += size % 2 == 0 ? 1 : 0;

    System.out.println("\nEl tamaño generado aleatoriamente es: " + size);

    System.out.println();

    mitad = size / 2 + 1;

    for (int i = 0; i < size; i++) {
      numeroPintado = mitad;

      for (int j = 1; j <= size; j++) {
        System.out.print(numeroPintado % 10 + " ");

        if (i + 1 > mitad) minimo = i - mitad + 2;
        else minimo = mitad - i;

        if (numeroPintado > minimo && j < mitad) numeroPintado--;
        else if (i + 1 > mitad) {
          if (j >= size - (mitad - minimo)) numeroPintado++;
        } else if (j >= size - i) numeroPintado++;
      }

      System.out.println();
    }
  }
}
