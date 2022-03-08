// Indicamos el nombre del paquete
package Practica3;


// Creamos la clase abstracta Persona
public abstract class Persona {
  private String nombre;
  private String dni;
  private int edad;
  

  // Creamos los constructores; vacío y con todos los atributos
  public Persona(){}

  public Persona(String nombre, String dni, int edad){
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  // Creamos los getters y setters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDni() {
    return dni;
  }
  public void setDni(String dni) {
    this.dni = dni;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }

  // Sobreescribimos el método toString()
  @Override
  public String toString(){
    return 
    "NOMBRE: " + this.nombre +
    "\nDNI: " + this.dni +
    "\nEDAD: " + this.edad;
  }
  
}
