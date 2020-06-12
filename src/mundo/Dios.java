package mundo;

public class Dios {

	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Daniel", 20, 1.7);
		Persona persona2 = new Persona("Julian", 10, 1.5);

		System.out.println("Personas creadas");
		System.out.println("Nombre: "+persona1.obtenerNombre()+"  Edad: "+persona1.obtenerEdad()+" Altura: "+persona1.obtenerAltura());
		System.out.println("Nombre: "+persona2.obtenerNombre()+"  Edad: "+persona2.obtenerEdad()+" Altura: "+persona2.obtenerAltura());

		// TODO Auto-generated method stub

	}

}
