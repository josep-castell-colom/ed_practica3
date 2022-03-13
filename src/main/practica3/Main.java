package practica3;

public class Main {
  public static void main(String[] args) {
    Niño nin = new Niño();
    Juguete oso = new Juguete("Oso", 5, 3);
    nin.comprarJuguete(oso);
    System.out.println(nin);

  }
}
