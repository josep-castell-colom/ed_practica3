package Practica3.Practica3;
import java.sql.Date;

/**
 * La clase Barco implementa la interfaz Sonido y necesita un objeto de tipo Motor.
 */
public class Barco {
  private String nombre;
  private Date fechaConstruccion;
  private int numCamarotes;
  private Motor motor;

  /**
   * Crea un objeto barco con todos sus atributos por defecto.
   */
  public Barco(){}

  /**
   * Crea un objeto barco al que le pasan todos sus atributos por parámetro; incluídos los del motor, que también se creará.
   * @param nombre Nombre del barco.
   * @param fecha Fecha de construcción del barco.
   * @param num Número de camarotes que posee el barco.
   * @param fabricante Fabricante del motor.
   * @param potencia Potencia del motor.
   * @param codigo Código del motor.
   */
  public Barco(String nombre, Date fecha, int num, String fabricante, String potencia, int codigo){
    this.nombre = nombre;
    this.fechaConstruccion = fecha;
    this.numCamarotes = num;
    this.motor = new Motor(fabricante, potencia, codigo);
  }

  /**
   * Devuelve el nombre del barco.
   * @return Nombre del barco.
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * Asigna al barco el nombre que le pasan por parámetro.
   * @param nombre Nuevo nombre para el barco.
   */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /**
   * Devuelve la fecha de construcción del barco.
   * @return Fecha de construcción del barco.
   */
  public Date getFechaConstruccion() {
    return fechaConstruccion;
  }

  /**
   * Asigna al barco la fecha de construcción que le pasan por parámetro.
   * @param fechaConstruccion Nueva fecha de construcción.
   */
  public void setFechaConstruccion(Date fechaConstruccion) {
    this.fechaConstruccion = fechaConstruccion;
  }

  /**
   * Devuelve el número de camarotes.
   * @return Numero de camarotes del barco.
   */
  public int getNumCamarotes() {
    return numCamarotes;
  }

  /**
   * Asigna al barco el número de camarotes que le pasan por parámetro.
   * @param numCamarotes Nuevo número de camarotes para el barco.
   */
  public void setNumCamarotes(int numCamarotes) {
    this.numCamarotes = numCamarotes;
  }

  /**
   * Devuelve el Motor del barco.
   * @return Motor del barco.
   */
  public Motor getMotor() {
    return motor;
  }

  /**
   * Asigna al barco el nuevo motor que le pasan por parámetro.
   * @param motor Nuevo motor para el barco.
   */
  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  @Override
  public String toString(){
    return
    "NOMBRE: " + nombre + 
    "\nFECHA DE CONSTRUCCIÓN: " + fechaConstruccion +
    "\nNº DE CAMAROTES: " + numCamarotes +
    "\nMOTOR: " + motor;
  }
}
