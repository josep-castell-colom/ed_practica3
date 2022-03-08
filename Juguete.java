// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase Juguete
public class Juguete {
  private String nombre;
  private int precio;
  private int edadRecomendada;
  
  // Creamos los constructores; vacío y con todos los atributos
  public Juguete(){}
  
  public Juguete(String nombre, int precio, int edadRecomendada){
    this.nombre = nombre;
    this.precio = precio;
    this.edadRecomendada = edadRecomendada;
  }

  // Creamos los getters y setters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getPrecio() {
    return precio;
  }
  public void setPrecio(int precio) {
    this.precio = precio;
  }
  public int getEdadRecomendada() {
    return edadRecomendada;
  }
  public void setEdadRecomendada(int edadRecomendada) {
    this.edadRecomendada = edadRecomendada;
  }

  // Sobreescribimos el método toString()
  @Override
  public String toString() {
    return
    "\nNOMBRE: " + this.nombre + 
    "\nPRECIO: " + this.precio + "€" + 
    "\nEDAD RECOMENDADA: " + this.edadRecomendada;
  }
}
