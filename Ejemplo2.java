package semana3Clase2;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		String a="hola";
		String b="mundo";
		
		String ayb=concatenar(a,b);
		
		System.out.println(ayb);

	}
	
	public static String concatenar(String par1, String par2) {
		return par1+" "+par2;
	}

}
