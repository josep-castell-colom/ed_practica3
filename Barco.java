// Indicamos el nombre del paquete
package Practica3;
// Importamos parte del paquete java.sql para utilizar Date
import java.sql.Date;

// Creamos la clase Barco, la cual implementa la interfaz Sonido
public class Barco implements Sonido {
  private String nombre;
  private Date fechaConstruccion;
  private int numCamarotes;
  private Motor motor;

  // Creamos los constructores; vacío y con todos los atributos
  public Barco(){}

  public Barco(String nombre, Date fecha, int num, String fabricante, String potencia, int codigo){
    this.nombre = nombre;
    this.fechaConstruccion = fecha;
    this.numCamarotes = num;
    // Creamos un nuevo motor dentro del constructor de barco para definir una relación de composición
    this.motor = new Motor(fabricante, potencia, codigo);
  }

  // Creamos los getters y setters
  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public Date getFechaConstruccion() {
    return fechaConstruccion;
  }

  public void setFechaConstruccion(Date fechaConstruccion) {
    this.fechaConstruccion = fechaConstruccion;
  }

  public int getNumCamarotes() {
    return numCamarotes;
  }

  public void setNumCamarotes(int numCamarotes) {
    this.numCamarotes = numCamarotes;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  // Sobreescribimos el método toString()
  @Override
  public String toString(){
    return
    "NOMBRE: " + nombre + 
    "\nFECHA DE CONSTRUCCIÓN: " + fechaConstruccion +
    "\nNº DE CAMAROTES: " + numCamarotes +
    "\nMOTOR: " + motor;
  }

  // Sobreescribimos el método sonido() implementado de la interfaz Sonido
  @Override
  public void sonido(){
    System.out.println("Brrrrrrrrrrrrrrrrrrrr......");
  }
  
}
