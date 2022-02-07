package Objetos;

public class Articulo {
  private String codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  public Articulo (String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  public void modificar (String descripcion, double precioCompra, double precioVenta, int stock) {
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  public String getCodigo () {
    return this.codigo;
  }

  public String toString () {
    String cadenaTexto = "Artículo " + this.codigo + ":\n";
    cadenaTexto += "\tDescripción: " + this.descripcion + "\n";
    cadenaTexto += "\tPrecio de compra: " + this.precioCompra + "\n";
    cadenaTexto += "\tPrecio de venta: " + this.precioVenta + "\n";
    cadenaTexto += "\tStock: " + this.stock;

    return cadenaTexto;
  }
}
