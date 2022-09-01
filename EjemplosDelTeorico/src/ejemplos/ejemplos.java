package ejemplos;

public class ejemplos {

	public static void main(String[] args) {
		/*
		int numero1 = 50;
		int numero2 = 35;
		
		if (numero1>=numero2) {
			// en este momento de la ejecucion, se dara cuando se cumpla la condicion numero1>=numero2
			
			System.out.println("La condicion es verdadera!");
		
		
		int var1 = 50; 
		int var2 = 50;
		
		String resultado = " ";
		
		if (var1 + var2== 105) {
			
		resultado = "cambio el valor de la varibale resultado";
				
		}
		
		System.out.println(resultado);
		
		
		
		int var1 = 50;
		int var2 = 50;
		
		boolean variableBoolean = var1 <= var2;
		
		double resultado = 12.8;
		
		if (variableBoolean) {
			
			int variableDentroDeIf = 20;
			
			if (variableDentroDeIf != 67) {
				
				System.out.println("Estamos dentro del segundo if");
				
			}
		}
		
		System.out.println(resultado);
		
		
		 
		int var1 = 50;
		int var2 = 50; 
		
		String resultado = "aun no entre al if";
		
		if (var1 == var2) {
			resultado = "cambio el valor de la variable, porque dio true";
		} else {
			resultado = "cambio el valor de la variable, pero ahora dio falso";
		}
	
	boolean otroBooleano = var1 != var2;
	
	if (otroBooleano) {
		resultado = "cambiamos por tercera vez, pero llegamos a este codigo?";
	}
		
	System.out.println(resultado);
	
	
		
		String var1 = "hola";
		String var2 = "hola";
		String var3 = "chau";
		
		if (var1.equals(var2)){
			System.out.println("var 1 y var 2 son iguales");
		} if (var1.equals(var3)){
			System.out.println("var 1 y var 3 son iguales");
		}else {
			System.out.println("var 1 y var 3 son distintas");
		}
		
		
		
	int var = 19;
			
	double resultado = 0;
	
	switch (var) {
	case 5:
		
		int otraVar = 56;
		resultado = 34.22 + otraVar;
	break;
		
	case 15:
		
		resultado = 34.22;
	break;
	
	case 10:
		
		resultado = 34.22 + 56;
		System.out.println(resultado);
		
	break;
	
	default:
		
		System.out.println("No tiene ni valor 5, ni 15 ni 10");
	
	
	}
	
	*/
		
		// EJERCICIOS CONDICIONALES
		
		int varNum = 56;
		int varNum2 = 64;
		int varNum3 = 70;
		
		boolean varBool = varNum > varNum2 && varNum2 >= varNum3 || varNum +23 != varNum2;
		boolean varBool2 = varBool && true && false;
		boolean varBool3 = varBool2 ==varBool;
		
		if (varBool = true) {
			System.out.println("varBool es verdadera");
		} else {
			System.out.println("varBool es falsa");
		}
		
		if (varNum <10) {
			System.out.println("varNum es menos a 10");
		} else if (varNum <40){
			System.out.println("varNum es mayor a 10 y menor a 40");
		} else {
			System.out.println("varNum es mayor a 40");
		}
		
		if (varNum != 2 && varBool2 != true) {
			varNum2 = 80;
		}
		if(varBool3){
			System.out.println("en if anidado varBool3 es verdadera");
		}
		else{
			System.out.println("en if anidado varBool3 es falsa");
		}
	}

	
}
