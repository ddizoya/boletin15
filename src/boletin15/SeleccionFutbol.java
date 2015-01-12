/**
 * Boletín 15.
 *
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 * @version 2.1
 */
public class SeleccionFutbol {

    /**
     * Atributos.
     */
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Constructor vacío. 
     */
    public SeleccionFutbol() {

    }

    /**
     * Constructor con 4 parámetros. 
     * @param id Identificación de la perosna.
     * @param nombre Nombre de la persona. 
     * @param apellido Apellido de la persona. 
     * @param edad Edad de la persona. 
     */
    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     *  
     * @return Getter del atributo id. 
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id Setter del atributo id. 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre Setter del atributo nombre. 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return  Getter del atributo apellido. 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido Setter para el atributo apellido. 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return Getter del atributo edad.
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad Setter para el atributo edad. 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

  /**
   * 
   * @return Devuelve un String con id, nombre, apellido y edad. 
   * 
   */  
    @Override
    public String toString() {
        return (" ID: " + id + " Nombre: " + nombre + " Apellido: " + apellido + "Edad: " + edad);
    }
    /**
     * Método concentrarse sin parámetros. Imprime un mensaje sobre la concentración de la selección. 
     */
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Concentrarse la selección.");
    }
    /**
     * Método viajar sin parámetros. Imprime un mensaje de disponibilidad de viajar.  
     */
    public void viajar() {
        JOptionPane.showMessageDialog(null, "Viaja la selección.");
    }

}
