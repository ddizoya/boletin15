/**
 * Boletín 15. Programación; herencia.
 */
package boletin15;

/**
 *
 * @author ddizoya
 * @version 2.1
 */
public class Aplicacion {

    /**
     * Método main. En este método testeamos el funcionamiento de nuestro programa. 
     * @param args String obligatorio del main.  
     */
    public static void main(String[] args) {
       Jugador xog1 = new Jugador(10023,"Juan","Diaz",15);
       Adiestrador adiestra1 = new Adiestrador(10045,"Marta","Ortega",26);
       Masajista masaj1 = new Masajista(1212,"Pedro","Gallego",34);
       SeleccionFutbol obj = new Jugador(23452,"María","Jiménez",45);
       
       xog1.concentrarse(); //Esto demuestra que un objeto de una subclase puede instanciar un método de la superclase.
       adiestra1.concentrarse();
       masaj1.concentrarse();
       obj.concentrarse();
       
       xog1.viajar();
       adiestra1.viajar();
       masaj1.viajar();
       obj.viajar();
       
       
       
       //obj.entrenar();     --> Da error.  Un objeto de superclase no puede llamar a un método de la subclase.
       
    }
    
}
