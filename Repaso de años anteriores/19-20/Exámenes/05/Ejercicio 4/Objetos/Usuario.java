package Objetos;

public class Usuario extends Persona implements Cliente {
  private String telefono;

  public Usuario (String nombre, String correoElectronico, String telefono) {
    super(nombre, correoElectronico);
    this.telefono = telefono;
  }

  public void compra (Vendedor vendedor, Articulo articuloComprado) {
    vendedor.addArticuloVendido(articuloComprado);
  }

  public String toString() {
    return super.toString() + String.format("\nTeléfono: %s\n", this.telefono);
  }
}
