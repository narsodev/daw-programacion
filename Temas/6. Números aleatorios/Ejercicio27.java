/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
  Ejemplo 1:
    Turno del jugador (introduzca piedra, papel o tijera): papel
    Turno del ordenador: papel
    Empate
  Ejemplo 2:
    Turno del jugador (introduzca piedra, papel o tijera): papel
    Turno del ordenador: tijera
    Gana el ordenador
  Ejemplo 3:
    Turno del jugador (introduzca piedra, papel o tijera): piedra
    Turno del ordenador: tijera
    Gana el jugador
*/
public class Ejercicio27 {
  public static void main(String[] args) {
    String entrada, opcionAleatoria;
    String resultado = "";
    boolean error;

    switch ((int) (Math.random() * 3)) {
      case 0:
        opcionAleatoria = "piedra";
        break;
      case 1:
        opcionAleatoria = "papel";
        break;
      case 2:
        opcionAleatoria = "tijera";
        break;
      default:
        opcionAleatoria = "";
    }

    do {
      System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
      entrada = System.console().readLine();

      error = false;

      if (entrada.equals(opcionAleatoria)) resultado = "Empate"; 
      else switch (entrada) {
        case "piedra":
          resultado = opcionAleatoria.equals("papel") ? "Gana el ordenador" : "Gana el jugador";
          break;
        case "papel":
          resultado = opcionAleatoria.equals("tijera") ? "Gana el ordenador" : "Gana el jugador";
          break;
        case "tijera":
          resultado = opcionAleatoria.equals("piedra") ? "Gana el ordenador" : "Gana el jugador";
          break;
        default:
          error = true;
      }

      if (error) System.out.print("Valor incorrecto. ");
    } while (error);
    
    System.out.println("Turno del ordenador: " + opcionAleatoria);
    System.out.println(resultado);
    
  }
}
