// Escribe un programa que muestre tu horario de clase
public class Ejercicio4 {
  public static void main(String[] args) {
              System.out.printf("%13s ┏━━━━━━┳━━━━━━┳━━━━━━┳━━━━━━┳━━━━━━┓\n", "");
              System.out.printf("%13s ┃ %-4s ┃ %-4s ┃ %-4s ┃ %-4s ┃ %-4s ┃\n", "", "L", "M", "X", "J", "V");
    System.out.println("┏━━━━━━━━━━━━━╋━━━━━━╇━━━━━━╇━━━━━━╇━━━━━━╇━━━━━━┫");
     System.out.printf("┃ %s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "08:15-09:15", "LM", "ED", "LM", "ED", "FOL");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "09:15-10:15", "LM", "BBDD", "LM", "ED", "FOL");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "10:15-11:15", "PROG", "BBDD", "PROG", "PROG", "FOL");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "11:15-11:45", "R", "R", "R", "R", "R");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "11:45-12:45", "PROG", "PROG", "PROG", "PROG", "SI");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "12:45-13:45", "BBDD", "PROG", "BBDD", "SI", "SI");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┫");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "13:45-14:45", "BBDD", "SI", "BBDD", "SI", "SI");
    System.out.println("┗━━━━━━━━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┛");
  }
}
