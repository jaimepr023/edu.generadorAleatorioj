package edu.generadorrandom.servicios;

import java.util.Scanner;

/**
 * implementacion que implementa la interfaz de pedir num 
 * @author jpr-17/11/23
 */
public class pedirNumeroImplementacion implements pedirNumeroInterfaz{

	
	public int pediNum(Scanner num) {

		int num1= num.nextInt();
		return num1;
	}

}
