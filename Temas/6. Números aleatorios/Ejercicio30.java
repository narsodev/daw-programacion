public class Ejercicio30 {
  public static void main(String[] args) {
    int x1, y1, x2, y2, x3, y3;
    int altura, anchura;
    boolean error;
    
    do {
      System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
      altura = Integer.parseInt(System.console().readLine());
      
      error = altura < 4;
      if (error) System.out.print("Valor incorrecto. ");
    } while (error);
    
    do {
      System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
      anchura = Integer.parseInt(System.console().readLine());
      
      error = anchura < 4;
      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    x1 = (int) (Math.random() * (anchura - 2)) + 1;  
    y1 = (int) (Math.random() * (altura - 2)) + 1;  
    
    do {
      x2 = (int) (Math.random() * (anchura - 2)) + 1;  
      y2 = (int) (Math.random() * (altura - 2)) + 1;  
    } while (x1 == x2 && y1 == y2);

    do {
      x3 = (int) (Math.random() * (anchura - 2)) + 1;  
      y3 = (int) (Math.random() * (altura - 2)) + 1;  
    } while (x1 == x3 && y1 == y3 || x2 == x3 || y2 == y3);  

    System.out.println();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        if (j == 0 || j + 1 == anchura || i == 0 || i + 1 == altura) System.out.print("* ");
        else if (i == y1 && j == x1) System.out.print("& ");
        else if (i == y2 && j == x2) System.out.print("$ ");
        else if (i == y3 && j == x3) System.out.print("@ ");
        else System.out.print("  ");
      }
      System.out.println();
    }
  }
}
