package uy.edu.utec.ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int varNum = 56;
		int varNum2 = 64;
		int varNum3 = 70; // false y false o verdadero = verdadero
		boolean varBool = varNum > varNum2 && varNum2 >= varNum3 || varNum + 23 != varNum2;
		boolean varBool2 = varBool && true && false; // falso
		boolean varBool3 = varBool2 == varBool; // falso
		
		System.out.println(varNum);
		System.out.println(varNum2);
		System.out.println(varNum3);
		System.out.println(varBool);
		System.out.println(varBool2);
		System.out.println(varBool3);

	}

}
