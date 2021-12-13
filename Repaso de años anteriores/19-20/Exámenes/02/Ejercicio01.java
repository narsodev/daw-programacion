public class Ejercicio01 {
  public static void main(String[] args) {
    int altura;
    int margen;
    boolean error;

    do {
      System.out.print("Indica altura (>=3): ");
      altura = Integer.parseInt(System.console().readLine());

      error = altura < 3;
      if (error) System.out.print("Incorrecto. ");
    } while (error);

    do {
      System.out.print("Indica margen (>=1): ");
      margen = Integer.parseInt(System.console().readLine());

      error = margen < 1;
      if (error) System.out.print("Incorrecto. ");
    } while (error);

    for (int i = 0; i < altura; i++) {
      for (int j = 0 ; j < altura * 2 - 1; j++) {
        boolean pintar = j >= altura - i - 1 && j < altura + i;

        boolean esTrianguloInterior = i >= margen && i <= altura - margen - 1;
        if (esTrianguloInterior) pintar = pintar &&
          (j < altura - i - 1 + margen || j >= altura + i - margen); 
        System.out.print(pintar ? "*" : " ");
      } 
      System.out.println();
    }
  }
}
