// Indicamos el nombre del paquete
package Practica3;

// Creamos la clase abstracta Mascota
public abstract class Mascota implements Sonido {
    private String nombre;
    private int edad;

    // Creamos los constructores; vacío y con todos los atributos
    public Mascota (){};
    
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Creamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        String info="El nombre de la mascota es "+nombre+" y su edad es de"+edad+" años";
        return info;
    }
    
    
}
  

