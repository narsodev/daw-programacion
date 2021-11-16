public class Ejercicio26 {
  public static void main(String[] args) {
    int anchura, altura;
    int anchuraAleatoria, alturaAleatoria;

    System.out.print("Introduzca la anchura de la tableta: ");
    anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la altura de la tableta: ");
    altura = Integer.parseInt(System.console().readLine());

    alturaAleatoria = (int) (Math.random() * altura);

    if (alturaAleatoria != 0 && alturaAleatoria != altura - 1) {
      anchuraAleatoria = ((int) (Math.random() * 2)) == 0 ? 0 : anchura - 1;
    } else anchuraAleatoria = (int) (Math.random() * anchura);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        System.out.print(i == alturaAleatoria && j == anchuraAleatoria ? " " : "*");
      }
      System.out.println();
    }
  }
}