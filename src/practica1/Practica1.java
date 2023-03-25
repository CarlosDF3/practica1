
package practica1;
import java.util.Scanner;

/**
 * Representa la clase principal de nuestra aplicación de notas.
 * @author Carlos Duran Fernandez
 */
public class Practica1 {
    

    /**
     * Es nuestra clase principal con sus correspiendintes llamadas a los métodos de la clase notas.
     * @param args 
     */
    public static void main(String[] args) {
     
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.MostrarNotas();
		
		fc.aprobado();
    }
}
