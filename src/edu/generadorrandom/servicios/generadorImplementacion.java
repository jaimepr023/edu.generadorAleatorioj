package edu.generadorrandom.servicios;

/**
 * Implementacion que implementa la interfaz 
 * @author jpr-17/11/23
 */
public class generadorImplementacion implements generadorInterfaz{

	/**
	 * Metodo de generar un numero aleatorio
	 * @author jpr-17/11/23
	 */
	public int generador() {
		
		System.out.println("Ahora se genera un numero aleatoriamente");
		int aux = (int)(Math.random()*100);
		return aux;
		
	}
	
	
	
}
