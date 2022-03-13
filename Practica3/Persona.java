package Practica3.Practica3;

/**
 * Persona es una clase abstracta que será extendida por Adulto y Niño
 * @author Josep Castell, Agustín Tudurí
 */

public abstract class Persona {
  private String nombre;
  private String dni;
  private int edad;
  
  /**
   * Crea una persona sin recibir ningún parámetro.
   */
  public Persona(){}

  /**
   * Crea una persona recibiendo todos sus parámetros.
   * @param nombre Nombre de la persona.
   * @param dni Documento de identidad de la persona.
   * @param edad Edad de la persona.
   */
  public Persona(String nombre, String dni, int edad){
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  /**
   * Devuelve el nombre de la persona.
   * @return Nombre de la persona.
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Asigna el nombre que se le pasa por parámetro.
   * @param nombre Nuevo nombre de la persona.
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devuelve el DNI de la persona.
   * @return dni  DNI de la persona.
   */
  public String getDni() {
    return dni;
  }

  /**
   * Asigna el DNI que se le pasa por parámetro.
   * @param dni Nuevo DNI de la persona.
   */
  public void setDni(String dni) {
    this.dni = dni;
  }

  /**
   * Devuelve la edad de la persona.
   * @return Edad de la persona.
   */
  public int getEdad() {
    return edad;
  }
  
  /**
   * Asigna la edad que se le pasa por parámetro.
   * @param edad Nueva edad de la persona.
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString(){
    return 
    "NOMBRE: " + this.nombre +
    "\nDNI: " + this.dni +
    "\nEDAD: " + this.edad;
  }
  
}
