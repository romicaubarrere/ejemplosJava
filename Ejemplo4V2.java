package semana3Clase2;

public class Ejemplo4V2 {

	public static void main(String[] args) {
    int[] vector = {45,6,12,88,96,103,75,0,23};
		
    
         
    
		int numero=75;
		boolean encontre;
		encontre=estaPresente(numero,vector);
		
		boolean enc2 = estaPresente(6, new int[] {1});
		boolean enc3 = estaPresente(6, new int[] {3,5,6});
		
		int[] array3 = new int[3];
		boolean esta3 = estaPresente(0,array3);
		
		int num4=4;
		int[] array4= new int[] {5,10,35,67,88};
		boolean esta4 = estaPresente(num4, array4);
		
		
		
		
		
		System.out.println("¿Encontre al numero? "+encontre);
		System.out.println("Variable enc2 "+enc2);
		System.out.println("Variable enc3 "+enc3);
		System.out.println("Variable esta3 "+esta3);
		System.out.println("Variable esta4 "+esta4);
		

	}
	public static boolean estaPresente(int num, int[]array) {
		 boolean esta=false;
		 for (int i=0; i<array.length;i++) {
				if (array[i]==num) {
					esta=true;
				}
			}
		 return esta;
	}

	
}
