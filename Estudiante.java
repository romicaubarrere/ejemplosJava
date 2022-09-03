package semana3Clases;

import java.util.Calendar;
import java.util.Date;

public class Estudiante {
	public String codigo;
	private String nombre;
	public int cedula;
	public int nacimientoYear;
	// En este ejemplo nuestra clase tiene 2 constructores
	// Creando el constructor
	public Estudiante() {
		this.codigo="";
		this.nombre="";
		this.cedula=0;
		this.nacimientoYear=0;
	}
	// Otro constructor
	public Estudiante(String codigo,String nombre,int cedula,int nacimientoYear) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.cedula=cedula;
		this.nacimientoYear=nacimientoYear;
	}
   
	public int  calcularEdad(int anio) {
		return anio-this.nacimientoYear;
	}
	
	// Java soporta Overloading de metodos
	// Son metodos de igual nombre pero con distintos parametros
	
	public int calcularEdad() {
		Calendar cal = Calendar.getInstance();
		// Se utiliza Calendar para trabajar con fechas
		// Obtengo el año actual a traves de Calendar
		int year = cal.get(Calendar.YEAR);
		return year-this.nacimientoYear;
	}	
   // Otro metodo usando el Overloading
   public int calcularEdad(Date date) {
	   Calendar cal = Calendar.getInstance();
	   // Setea en Calendar que la fecha es la pasada por parametro
	   cal.setTime(date);
	   // En Year queda almacenado el año de la fecha pasada por paramentro
	   int year = cal.get(Calendar.YEAR);
	   
	   return year-this.nacimientoYear;
   }
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCedula() {
	return cedula;
}
public void setCedula(int cedula) {
	this.cedula = cedula;
}
public int getNacimientoYear() {
	return nacimientoYear;
}
public void setNacimientoYear(int nacimientoYear) {
	this.nacimientoYear = nacimientoYear;
}  
   
	
}
