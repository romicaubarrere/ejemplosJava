//programa para sumar enteros

package principal;

import java.util.Scanner;

public class SumaDeEnteros {

	public static void main(String[] args) { //el metodo main empieza la ejecucion de la aplicacion en java
		
		//crea objeto scanner para obtener la entrada de la ventana de comandos 
		
		Scanner entrada = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int suma;
		
		System.out.print("Escriba el primer entero: "); //indicador
		numero1 = entrada.nextInt (); // lee el primer numero del usuario
		
		System.out.print("Escriba el segundo entero: "); //indicador
		numero2 = entrada.nextInt (); // lee el segundo numero del usuario
		
		suma = numero1 + numero2; // suma los numeros, depsues almacena el total en suma
		
		System.out.printf( "La suma es %d%n", suma); //muestra la suma
		
		
	}// fin del metodo main

} // fin de la clase suma
