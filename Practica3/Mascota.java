package Practica3.Practica3;

import Practica3.Sonido.Sonido;

/**
 * Clase Mascota, de la que parten Perro y Gato e implementa la interfaz Sonido.
 */
public abstract class Mascota implements Sonido {
    private String nombre;
    private int edad;

    /**
     * Crea una Mascota con todos los parámetros por defecto.
     */
    public Mascota (){};
    
    /**
     * Crea una Mascota pasándole por parámetro todos sus atributos.
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota.
     */
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Devuelve el nombre de la mascota.
     * @return Nombre de la mascota.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna a la mascota el nombre que le pasan por parámetro.
     * @param nombre Nuevo nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de la mascota.
     * @return Edad de la mascota.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Asigna a la mascota la edad que le pasan por parámetro.
     * @param edad Nueva edad de la mascota.
     */
    public void setEdad(int edad) {
        this.edad = edad;
        
    }
    
    @Override 
    public String toString(){
        String info="El nombre de la mascota es "+nombre+" y su edad es de"+edad+" años";
        return info;
    }
}
  

