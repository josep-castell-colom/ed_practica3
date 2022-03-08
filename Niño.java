// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase Niño, subclase de Persona
public class Niño extends Persona {
  private String colegio;
  private Juguete juguete;

  // Creamos los constructores; vacío y con todos los atributos (excepto juguete, pues lo añadiremos con un método)
  public Niño(){}

  public Niño(String nombre, String dni, int edad, String colegio){
    super(nombre, dni, edad);   // Usamos super para acceder al constructor de la superclase
    this.colegio = colegio;
  }

  // Creamos los getters y setters de la subclase
  public String getColegio(){
    return this.colegio;
  }

  public void setColegio(String colegio){
    this.colegio = colegio;
  }
  
  public Juguete getJuguete(){
    return this.juguete;
  }

  // Método que pasa el objeto juguete al niño
  public void comprarJuguete(Juguete juguete){
    this.juguete = juguete;
  }

  // Sobreescribimos el método toString()
  @Override
  public String toString(){
    return
    "NOMBRE: " + this.getNombre() + 
    "\nDNI: " + this.getDni() + 
    "\nEDAD: " + this.getEdad() +
    "\nCOLEGIO: " + this.colegio +
    "\nJUGUETE: " + this.juguete;
  }
}