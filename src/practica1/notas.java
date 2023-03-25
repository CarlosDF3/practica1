
package practica1;

import java.util.Scanner;
/**
 * Representa un selector de notas y sus diferentes metodos para el calculo de operaciones.
 * @author Carlos Duran Fernandez
 */

public class notas {
	/**
         * Aquí declaramos nuestras variables.
         * Además creamos un nuevo objeto scanner para poder introducir los valores por consola.
         */
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	Scanner entrada = new Scanner(System.in);
	
	/**
         * El primer método es donde recogemos los valores de nuestras primeras 3 variables.
         */
	public void IngresaNotas() {
		
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/**
         * El segundo método comprueba si los valores recogidos son correctos o incorrectos.
         * Para ello usamos un if else.
         */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	/**
         * El tercer método ayuda a calcular los porcentajes de los valores introducidos inicialmente.
         * Las 3 primeras variables es un calculo de porcentaje independiende a cada nota.
         * La última variable es la suma final y nota definitiva.
         */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		
	}
        /**
         * El cuarto método imprime los valores introducidos inicialmente y el calculo de valores posteriores.
         * Así como la nota final.
         */
	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
        /**
         * Este último método indica si la nota final esta aprobada o suspensa, o ha habido un error.
         */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}

}



