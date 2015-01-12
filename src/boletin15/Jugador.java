/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 * @version 2.1
 */
public class Jugador extends SeleccionFutbol {

    private String demarcacion;
    private int dorsal;

    /**
     * Constructor vacío. 
     */
    public Jugador() {

    }

    /**
     *
     * @param id 
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Jugador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);

    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param demarcacion
     * @param dorsal
     */
    public Jugador(int id, String nombre, String apellido, int edad, String demarcacion, int dorsal) {
        super(id, nombre, apellido, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;

    }
    
    
    /**
     *
     * @return Getter del atributo demarcacion.
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     *
     * @param demarcacion Setter del atributo demarcacion. 
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     *
     * @return Getter del atributo dorsal. 
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     *
     * @param dorsal Setter del atributo dorsal. 
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    @Override
    public void viajar(){
        JOptionPane.showMessageDialog(null, "Viaja el jugador.");
    }
    
    
    @Override
    public String toString() {
        return " Dorsal: " + dorsal +" Demarcación: " + demarcacion;
    }
    
    /**
     * Método jugarPartido. Imprime si el jugador está jugando un partido. 
     */
    public void jugarPartido(){
        JOptionPane.showMessageDialog(null, "Juega partido.");
    }
    
    /**
     * Método entrenar. Indica si el jugador está entrenando en esos instantes. 
     */
    public void entrenar(){
        JOptionPane.showConfirmDialog(null, "Entrena.");
    }
}
