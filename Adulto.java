// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase Adulto, subclase de Persona
public class Adulto extends Persona {
  String NSS;
  String direccion;

  // Creamos los constructores; vacío y con todos los atributos
  public Adulto(){}

  public Adulto(String nombre, String dni, int edad, String NSS, String direccion){
    super(nombre, dni, edad);   // Usamos super para acceder al constructor de la superclase
    this.NSS = NSS;
    this.direccion = direccion;
  }

  // Creamos los getters y setters de la subclase
  public String getNSS() {
    return NSS;
  }

  public void setNSS(String NSS) {
    this.NSS = NSS;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  // Sobreescribimos el método toString()
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
