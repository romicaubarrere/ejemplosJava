package uy.edu.utec.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		boolean varBool = false;
		boolean varBool2 = (varBool || varBool == true && ! varBool); //falso o verdadero y verdadero
		boolean varBool3 = !varBool2 && varBool != false; // verdadero y falso
		boolean varBool4 = !varBool && !varBool2 || !varBool; //verdadero y verdadero o verdadero

		System.out.println(varBool);
		System.out.println(varBool2);
		System.out.println(varBool3);
		System.out.println(varBool4);
	}

}
