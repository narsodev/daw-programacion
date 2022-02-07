package Objetos;

public class Empresa implements Cliente {
  private String nombre;
  private String cif;
  private String telefono;

  public Empresa (String cif, String nombre, String telefono) {
    this.cif = cif;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public void compra (Vendedor vendedor, Articulo articuloComprado) {
    vendedor.addArticuloVendido(articuloComprado);
  }

  public String toString () {
    return String.format("CIF: %s\nNombre: %s\nTeléfono: %s",
      this.cif,
      this.nombre,
      this.telefono
    );
  }
}
