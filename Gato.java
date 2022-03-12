package Practica3;

/**
 * La clase Gato es hija de la clase Mascota.
 */
public class Gato extends Mascota{
    private String raza;
    
    /**
     * Crea un gato con todos sus atributos por defecto.
     */
    public Gato(){};
    
    /**
     * Crea un gato al que le pasan todos sus atributos por parámetro, incluso los de su clase madre.
     * @param raza Raza del gato.
     * @param nombre Nombre del gato.
     * @param edad Edad del gato.
     */
    public Gato(String raza, String nombre, int edad){
       super(nombre, edad);   // Usamos super para acceder al constructor de la superclase
       this.raza =raza;
   }

    /**
     * Devuelve la raza del gato.
     * @return Raza del gato.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Asigna al gato la raza que le pasan por parámetro.
     * @param raza Nueva raza del gato.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override 
    public String toString(){
      String info="El nombre del gato es "+ this.getNombre() +" y su edad es de "+ this.getEdad() + " años. La raza del gato es "+raza;
      return info;
    }

}
