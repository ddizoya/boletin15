/*
 * Clase masajista. 
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int anosExperiencia;

    /**
     * Constructor vacío. 
     */
    public Masajista() {

    }

    /**
     * Constructor con 4 parámetros. 
     * @param id Identificación del masajista. 
     * @param nombre Nombre del masajista.  
     * @param apellido Apellido del masajista.  
     * @param edad Edad del masajista. 
     */
    public Masajista(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }

    /**
     * constructor con 6 parámetros. 
     * @param id Identificación del masajista. 
     * @param nombre Nombre del masajista.  
     * @param apellido Apellido del masajista.  
     * @param edad Edad del masajista. 
     * @param titulacion Titulación del masajista. 
     * @param anosExperiencia Años de experiencia del masajista. 
     */
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anosExperiencia) {
        super(id, nombre, apellido, edad);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;

    }  

    /**
     *
     * @return Getter del atributo titulacion. 
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     *
     * @param titulacion Setter del atributo titulacion. 
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     *
     * @return Getter del atributo anosExperiencia. 
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /**
     *
     * @param anosExperiencia Setter del atributo anosExperiencia. 
     */
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    @Override
    public String toString(){
        return " Años de experiencia: " + this.anosExperiencia +" Titulacion: " + this.titulacion;
    }  
    @Override
    public void viajar(){
        JOptionPane.showMessageDialog(null, "Viaja el masajista.");
    } 

    /**
     * Método darMasajes sin parámetros. Indica si el masajista es apto para dar un masaje. 
     */
    public void darMasajes(){
        JOptionPane.showMessageDialog(null, "Masajista apto para masaje.");
    }
}
