// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase Perro, subclase de Mascota
public class Perro extends Mascota{
  private String raza;
  
  // Creamos los constructores; vacío y con todos los atributos
  public Perro(){};
  
  public Perro(String raza, String nombre, int edad){
      super(nombre, edad);   // Usamos super para acceder al constructor de la superclase
      this.raza =raza;    
  }

  // Creamos los getters y setters de la subclase
  public String getRaza() {
      return raza;
  }

  public void setRaza(String raza) {
      this.raza = raza;
  }
  
  // Sobreescribimos el método toString()
  @Override 
  public String toString(){
      String info="El nombre del perro es " + this.getNombre() + " y su edad es de" + this.getEdad() + " años. La raza del perro es " + raza;
      return info;
  }

  // Sobreescribimos el método sonido() implementado de la interfaz Sonido
  @Override
  public void sonido(){
      System.out.println("Guau guau");
  }
}
