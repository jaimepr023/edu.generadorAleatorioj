package edu.generadorrandom.controlador;

import java.util.Scanner;

import edu.generadorrandom.servicios.generadorImplementacion;
import edu.generadorrandom.servicios.generadorInterfaz;
import edu.generadorrandom.servicios.pedirNumeroImplementacion;
import edu.generadorrandom.servicios.pedirNumeroInterfaz;

/**
 * Clase inicial de nuestro programa
 * @author jpr-17/11/23
 */
public class inicioApp {
/**
 * Metodo inicial de nuestra app donde se encuentra el procedimiento 
 * @author jpr-17/11/23
 * @param args
 */
	public static void main(String[] args) {
		pedirNumeroInterfaz pn = new pedirNumeroImplementacion();
		generadorInterfaz gi = new generadorImplementacion();
		Scanner sc = new Scanner(System.in);
		
		
		int numeroGenerado= gi.generador();
		int numeroAdivinar;
		System.out.println("Adiviname el numero generado aleatoriamente 😊");
		int i=0;
		do {
			 numeroAdivinar = pn.pediNum(sc);
			 
			 if(numeroAdivinar==numeroGenerado) {
				 System.out.println("Felicidades has conseguido adivinar mi numero.");
			 }else if(numeroAdivinar>numeroGenerado){
				 System.out.println("No has adivinado el numero, es un numero menor.");
				 System.out.println("Vuelve a intentarlo.");
			 }else if(numeroAdivinar<numeroGenerado){
				 System.out.println("No has adivinado el numero, es un numero mayor.");
				 System.out.println("Vuelve a intentarlo.");
			 }
			 
			 i++;
		}while(numeroAdivinar!=numeroGenerado);
		System.out.println("HAs realizado "+ i + " intentos");
		

		
	}

}
