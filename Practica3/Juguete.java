package Practica3.Practica3;

/**
 * Un juguete podrá o no ser atributo de la clase Niño.
 */
public class Juguete {
  private String nombre;
  private int precio;
  private int edadRecomendada;
  
  /**
   * Crea un juguete con todos sus atributos por defecto.
   */
  public Juguete(){}
  
  /**
   * Crea un juguete al que le pasan por parámetro todos sus atributos.
   * @param nombre Nombre del juguete.
   * @param precio Precio del juguete.
   * @param edadRecomendada Edad recomendada para usar el juguete.
   */
  public Juguete(String nombre, int precio, int edadRecomendada){
    this.nombre = nombre;
    this.precio = precio;
    this.edadRecomendada = edadRecomendada;
  }

  /**
   * Devuelve el nombre del juguete.
   * @return Nombre del juguete.
   */ 
  public String getNombre() {
    return nombre;
  }

  /**
   * Asigna al juguete el nombre que le pasan por parámetro.
   * @param nombre Nuevo nombre para el juguete.
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devuelve el precio del juguete.
   * @return Precio del juguete.
   */
  public int getPrecio() {
    return precio;
  }

  /**
   * Asigna al juguete el precio que le pasan por parámetro.
   * @param precio Nuevo precio para el juguete.
   */
  public void setPrecio(int precio) {
    this.precio = precio;
  }

  /**
   * Devuelve la edad recomendada para el juguete.
   * @return Edad recomendada.
   */
  public int getEdadRecomendada() {
    return edadRecomendada;
  }

  /**
   * Asigna al jueguete la edad recomendada que le pasan por parámetro.
   * @param edadRecomendada Nueva edad recomendada.
   */
  public void setEdadRecomendada(int edadRecomendada) {
    this.edadRecomendada = edadRecomendada;
  }

  @Override
  public String toString() {
    return
    "\nNOMBRE: " + this.nombre + 
    "\nPRECIO: " + this.precio + "€" + 
    "\nEDAD RECOMENDADA: " + this.edadRecomendada;
  }
}
