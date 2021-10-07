/* Escribe un programa que pinte por pantalla alguna escena - el campo, la
habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
- un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
caracteres como *, +, <, #, @, etc. o incluso caracteres Unicode. ¡Échale
imaginación! */
public class Ejercicio9 {
  public static void main(String[] args) {
    // █ ░ ▒ ▓ ■ □ ▢ ▤ ▥ ▦ ▧ ▨ ◧ ◨ ◩ ◪ ◫ ◰ ◱ ◲ ◳ ⊞ ⊟ ⊠ ⊡
    System.out.printf("%-8s████████\n", "");
    System.out.printf("%-7s██\n", "");
    System.out.printf("%-6s█\n", "");
    System.out.printf("%-6s█\n", "");
    System.out.printf("%-5s██\n", "");
  }
}
