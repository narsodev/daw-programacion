import Objetos.Gestisimal;
import Objetos.Articulo;

class Ejercicio05 {
  public static void main(String[] args) {
    Gestisimal controlador = new Gestisimal();
    int opcion;

    do {
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");

      System.out.print("\nOpción: ");

      opcion = Integer.parseInt(System.console().readLine());

      System.out.println();

      switch (opcion) {
        case 1:
          System.out.println(controlador);
          break;
        case 2:
          Articulo nuevoArticulo;

          System.out.println("Código de artículo: ");
          String codigo = System.console().readLine();
          System.out.println("Descripción: ");
          String descripcion = System.console().readLine();
          System.out.println("Precio de compra: ");
          double precioCompra = Double.parseDouble(System.console().readLine());
          System.out.println("Precio de venta: ");
          double precioVenta = Double.parseDouble(System.console().readLine());
          System.out.println("Stock: ");
          int stock = Integer.parseInt(System.console().readLine());

          nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

          boolean dadoDeAlta = controlador.darDeAlta(nuevoArticulo);
          if (dadoDeAlta) System.out.println("Artículo dado de alta.");
          else System.out.println("El código de artículo debe ser único.");

          break;
        case 3:
          System.out.print("Introduzca el código del artículo a dar de baja: ");
          String codigoArticuloEliminar = System.console().readLine();

          boolean dadoDeBaja = controlador.darDeBaja(codigoArticuloEliminar);

          if (dadoDeBaja) System.out.println("Artículo dado de baja.");
          else System.out.println("Artículo no encontrado.");

          break;
        // case 4:
        //   System.out.print("Introduzca el código del artículo a modificar: ");
        //   String codigoArticuloModificar = System.console().readLine();

        //   System.out.println("Descripción: ");
        //   String nuevaDescripcion = System.console().readLine();
        //   System.out.println("Precio de compra: ");
        //   double nuevoPrecioCompra = Double.parseDouble(System.console().readLine());
        //   System.out.println("Precio de venta: ");
        //   double nuevoPrecioVenta = Double.parseDouble(System.console().readLine());
        //   System.out.println("Stock: ");
        //   int nuevoStock = Integer.parseInt(System.console().readLine());

        //   controlador.Modificacion(codigoArticuloModificar, nuevaDescripcion, nuevoArticulo, nuevoPrecioCompra, nuevoPrecioVenta, nuevoStock);
          

      }

      System.out.println();

    } while (opcion != 7);
  }
}