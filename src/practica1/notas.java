
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
	double uf1, uf2, uf3, notRecup;
	double not1, not2, not3, notfinal, NR;
	
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
                
                System.out.print("Ingrese su nota de recuperación si la hubiese, "
                        + "sino ponga un numero aleatorio del 1 al 10: ");
		
                notRecup= entrada.nextDouble();
	}
	
	/**
         * El segundo método comprueba si los valores recogidos son correctos o incorrectos.
         * Para ello usamos un if else.
         */
	
	public void comprobacion(){
		
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
                
                if (notRecup>10) {
			System.out.println(" nota de recuperación mal introducida");
			
		}else {
			System.out.println(" nota recuperación es correcta");
		}
		
			
		
		
	}
	/**
         * El tercer método ayuda a calcular los porcentajes de los valores introducidos inicialmente.
         * Las 3 primeras variables es un calculo de porcentaje independiende a cada nota.
         * La última variable es la suma final y nota definitiva.
         */
	
	public void Calcularnotas() {
		not1= uf1*0.25;
		not2 = uf2 * 0.30;
		not3 = uf3 * 0.45;
                
                NR = notRecup;
		
		notfinal = not1 + not2+ not3;
		
		
	}
        /**
         * El cuarto método imprime los valores introducidos inicialmente y el calculo de valores posteriores.
         * Así como la nota final.
         */
	public void MostrarNotas() {
		
		System.out.println(" Las notas introducidas son:");
		System.out.println(" La nota1 = " + uf1);
		System.out.println(" La nota2 = " + uf2);
		System.out.println(" La nota3 = " + uf3);
		
		System.out.println(" La media 1 = "+ not1);
		System.out.println(" La media 2 = "+ not2);
		System.out.println(" La media 3 = "+ not3);
		
		System.out.println(" La nota final es = "+ notfinal);
                
		
	}
        /**
         * Este último método indica si la nota final esta aprobada o suspensa, o ha habido un error.
         */
	public void aprobado() {
			
			if(notfinal<5 && notfinal>=0) {
				System.out.println("Has suspendido");
                                if (NR<5 && NR>=0){
                                    System.out.println("Lo lamento, has vuelto a suspender");
                                }
                                else{
                                    if (NR>=5 && NR<=10 ) {
                                    System.out.println("Pero en el examen de recuperación has sacado un"
                                            + NR + "así que estas aprobado!!");
				}else {
					System.out.println(" Vaya! hay un error en tus notas");
				}
                                }
			}else {
				if (notfinal>=5 && notfinal<=10 ) {
				System.out.println("Has aprobado!!");
				}else {
					System.out.println(" Vaya! hay un error en tus notas");
				}
			}
		}

}



