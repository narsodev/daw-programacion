package Objetos;

public class Persona {
  private final String colorAzul = "\u001B[34m";
  private final String colorReset = "\u001B[0m";

  private String nombre;
  private String correoElectronico;

  public Persona (String nombre, String correoElectronico) {
    this.nombre = nombre;
    this.correoElectronico = correoElectronico;
  }

  public String toString () {
    return String.format("Nombre: %s\nCorreo electrónico: %s%s%s",
      this.nombre,
      this.colorAzul,
      this.correoElectronico,
      this.colorReset
    );
  }
}
