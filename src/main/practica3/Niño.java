package practica3;

/**
 * Clase Niño, hereda de la clase Persona.
 * @author Josep Castell, Agustín Tudurí
 */

public class Niño extends Persona {
  private String colegio;
  private Juguete juguete;

  /**
   * Crea un objeto Niño con los valores por defecto.
   */
  public Niño(){}

  /**
   * Crea un objeto Niño recibiendo por parámetro todos sus atributos y los de su clase madre.
   * @param nombre Nombre del niño.
   * @param dni DNI del niño.
   * @param edad Edad del niño.
   * @param colegio Colegio del niño.
   */
  public Niño(String nombre, String dni, int edad, String colegio){
    super(nombre, dni, edad);   // Usamos super para acceder al constructor de la superclase
    this.colegio = colegio;
  }

  /**
   * Devuelve el colegio del niño.
   * @return
   */
  public String getColegio(){
    return this.colegio;
  }

  /**
   * Asigna como nuevo colegio al que le pasan por parámetro.
   * @param colegio Nuevo colegio.
   */
  public void setColegio(String colegio){
    this.colegio = colegio;
  }
  
  /**
   * Devuelve el juguete del niño.
   * @return Juguete.
   */
  public Juguete getJuguete(){
    return this.juguete;
  }

  /**
   * Asigna al niño el juguete que le pasan por parámetro. 
   * @param juguete Nuevo juguete del niño.
   */
  public void comprarJuguete(Juguete juguete){
    this.juguete = juguete;
  }

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