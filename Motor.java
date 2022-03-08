// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase Motor
public class Motor {
  String fabricante;
  String potencia;
  int codigo;

  // Creamos los constructores; vacío y con todos los atributos
  public Motor(){}
  
  public Motor(String fabricante, String potencia, int codigo) {
    this.fabricante = fabricante;
    this.potencia = potencia;
    this.codigo = codigo;
  }
  
  // Creamos los getters y setters
  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getPotencia() {
    return potencia;
  }

  public void setPotencia(String potencia) {
    this.potencia = potencia;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  // Sobreescribimos el método toString()
  @Override
  public String toString(){
    String info = 
    "FABRICANTE: " + this.fabricante +
    "POTENCIA: " + this.potencia +
    "CÓDIGO: " + this.codigo;

    return info;
  }
  
}
