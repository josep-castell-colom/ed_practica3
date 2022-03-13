package Practica3.Practica3;

/**
 * La clase Adulto extiende la clase Persona.
 */
public class Adulto extends Persona {
  private String NSS;
  private String direccion;

  /**
   * Crea un adulto con todos sus atributos por defecto.
   */
  public Adulto(){}

  /**
   * Crea un adulto al que le pasan todos sus atributos por parámetro, incluídos los de su clase madre.
   * @param nombre Nombre del adulto.
   * @param dni DNI del adulto.
   * @param edad Edad del adulto.
   * @param NSS NSS del adulto.
   * @param direccion Dirección del adulto.
   */
  public Adulto(String nombre, String dni, int edad, String NSS, String direccion){
    super(nombre, dni, edad);   // Usamos super para acceder al constructor de la superclase
    this.NSS = NSS;
    this.direccion = direccion;
  }

  /**
   * Devuelve el NSS del adulto.
   * @return NSS del adulto.
   */
  public String getNSS() {
    return NSS;
  }

  /**
   * Asigna al adulto el NSS que le pasan por parámetro.
   * @param NSS Nuevo NSS para el adulto.
   */
  public void setNSS(String NSS) {
    this.NSS = NSS;
  }

  /**
   * Devuelve la dirección del adulto.
   * @return Dirección del adulto.
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * Asigna al adulto la dirección que le pasan por parámetro.
   * @param direccion Nueva dirección para el adulto.
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString(){
    return 
    "NOMBRE: " + this.getNombre() +
    "\nDNI: " + this.getDni() +
    "\nEDAD: " + this.getEdad() + 
    "\nNSS: " + this.NSS + 
    "\nDIRECCIÓN: " + this.direccion;
  }
}
