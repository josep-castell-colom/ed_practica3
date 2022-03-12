package Practica3;

// Creamos la clase Perro, subclase de Mascota
public class Perro extends Mascota{
  private String raza;
  
  /**
   * Crea un perro con los valores de los atributos por defecto.
   */
  public Perro(){};
  
  /**
   * Crea un perro pasándole sus atributos y los de su clase madre.
   * @param raza Raza del perro.
   * @param nombre Nombre del perro.
   * @param edad Edad del perro.
   */
  public Perro(String raza, String nombre, int edad){
      super(nombre, edad);
      this.raza =raza;    
  }

  /**
   * Devuelve la raza del perro.
   * @return Raza del perro.
   */
  public String getRaza() {
      return raza;
  }

  /**
   * Asigna la raza que se le pasa por parámetro.
   * @param raza Nueva raza del pero.
   */
  public void setRaza(String raza) {
      this.raza = raza;
  }
  
  @Override 
  public String toString(){
      String info="El nombre del perro es " + this.getNombre() + " y su edad es de" + this.getEdad() + " años. La raza del perro es " + raza;
      return info;
  }

}
