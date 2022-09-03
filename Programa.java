package semana3Clases;
// En este programa vamos a utilizar las Clases
//

public class Programa {

	public static void main(String[] args) {
		
		Estudiante e1;
		e1 = new Estudiante();
		
		String nombreE1 = e1.getNombre();
		
		Estudiante e2;
		e2= new Estudiante("cod15","Ana",43254555,1995);
		String nombreE2 = e2.getNombre();
		int cedulaE2 = e2.cedula;
		int edad=e2.calcularEdad(2020);
		
		System.out.println(nombreE2+" tiene "+edad+" años");
		System.out.println("El nombre de e1 es "+nombreE1);
		
		

	}

}
