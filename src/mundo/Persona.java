package mundo;

public class Persona {

	//Declara un atributo de tipo String para el nombre de la persona
	private String nombre;
	
	//Declara un atributo de tipo int para la edad
	private int edad;
	
	//Decalara un atributo de tipo double para la altura
	private double altura;
	
	//Constructor
	public Persona(String pNombre, int pEdad, double pAltura) {
		
		nombre = pNombre;
		edad= pEdad;
		altura = pAltura;
		
	}
	
	
	public void cambiarNombre(String pNombre ) {
		nombre = pNombre;
	}
	
	//Implementa el metodo para cambiarle la edad 
	public void cambiarEdad( int pAltura) {
		altura= pAltura;	
	}
	
	//Implementa el metodo para cambiarle la altura 
	public void cambiarAltura( int pEdad) {
		edad= pEdad;	
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public int obtenerEdad() {
		return edad;
	}
	
	public double obtenerAltura() {
		return altura;
	}
	
	
}
