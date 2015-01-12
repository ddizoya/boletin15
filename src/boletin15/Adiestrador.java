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
 */
public class Adiestrador extends SeleccionFutbol{
    private String idFederacion;

    /**
     * Constructor vacío. 
     */
    public Adiestrador(){
        
    }

    /**
     * constructor con 4 parámetros. 
     * @param id Identificación del adiestrador. 
     * @param nombre Nombre del adiestrador. 
     * @param apellido Apellido del adiestrador. 
     * @param edad Edad del adiestrador. 
     */
    public Adiestrador (int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);

    }

    /**
     * constructor con 5 parametros. 
     * @param id Identificación del adiestrador. 
     * @param nombre Nombre del adiestrador. 
     * @param apellido Apellido del adiestrador. 
     * @param edad Edad del adiestrador. 
     * @param idFederacion Identificación de la federación a la que pertenece el adiestrador. 
     */
    public Adiestrador (int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;

}

    /**
     *
     * @return Getter del atributo idFederacion.
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     *
     * @param idFederacion Setter del atributo idFederacion. 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
 public void viajar(){
     JOptionPane.showMessageDialog(null, "Viaja el adiestrador.");
 }

    /**
     * Método dirigirPartido. Indica si el adiestrador está apto para dirigir un partido. 
     */
    public void dirigirPartido(){
     JOptionPane.showMessageDialog(null, "Capacitado para dirigir un partido.");
 }

    /**
     * Método dirigirAdiestramiento. Indica si está capacitado para el adiestramiento el entrenador. 
     */
    public void dirigirAdiestramiento(){
     JOptionPane.showMessageDialog(null, "Capacitado para dirigir un adiestramiento.");
 }
 
    @Override
 public String toString(){
     return " ID de la Federación: " + this.idFederacion;
 }

}