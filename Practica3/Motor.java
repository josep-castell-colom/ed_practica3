package Practica3.Practica3;

import Practica3.Sonido.Sonido;

/**
 * Un motor es una pieza indispensable para la clase Barco.
 */
public class Motor implements Sonido {
  private String fabricante;
  private String potencia;
  private int codigo;

  /**
   * Crea un motor con todos sus atributos por defecto.
   */
  public Motor(){}
  
  /**
   * Crea un motor pasándole por parámetro todos sus atributos.
   * @param fabricante Fabricante del motor.
   * @param potencia Potencia del motor.
   * @param codigo Código del motor.
   */
  public Motor(String fabricante, String potencia, int codigo) {
    this.fabricante = fabricante;
    this.potencia = potencia;
    this.codigo = codigo;
  }
  
  /**
   * Devuelve el fabricante del motor.
   * @return Fabricante.
   */
  public String getFabricante() {
    return fabricante;
  }

  /**
   * Asigna como nuevo fabricante al que le pasan por parámetro.
   * @param fabricante Nuevo fabricante.
   */
  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  /**
   * Devuelve la potencia del motor.
   * @return Potencia.
   */
  public String getPotencia() {
    return potencia;
  }

  /**
   * Asigna al motor la potencia que le pasan por parámetro.
   * @param potencia Nueva potencia del motor.
   */
  public void setPotencia(String potencia) {
    this.potencia = potencia;
  }

  /**
   * Devuelve el código del motor.
   * @return Código.
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * Asigna al motor el código que le pasan por parámetro.
   * @param codigo Nuevo código del motor.
   */
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString(){
    String info = 
    "FABRICANTE: " + this.fabricante +
    "POTENCIA: " + this.potencia +
    "CÓDIGO: " + this.codigo;

    return info;
  }

  /**
   * Implementa el método sonido() de la interfaz Sonido con el sonido del motor.
   */
  @Override
  public void sonido(){
    System.out.println("Bbrrrrr....");
  }
}
