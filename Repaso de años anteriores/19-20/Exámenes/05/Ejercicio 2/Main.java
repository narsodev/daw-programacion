import Objetos.Baraja;

public class Main {
  public static void main(String[] args) {
    Baraja miBaraja = new Baraja();

    System.out.println("Baraja recién creada:");
    System.out.print(miBaraja);
    
    miBaraja.barajar();
    
    System.out.println("Tras barajar:");
    System.out.print(miBaraja);
    
    System.out.println("Sacamos la última carta:");
    System.out.println(miBaraja.dameCarta());
    
    System.out.println("Miramos la décima carta:");
    System.out.println(miBaraja.miraCarta(10));

    System.out.println("Volvemos a barajar:");
    miBaraja.barajar();
    System.out.print(miBaraja);

    System.out.println("Tamaño de la baraja:");
    System.out.println(miBaraja.tamanio());
  }
}
