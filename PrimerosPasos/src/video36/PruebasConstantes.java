package video36;

public class PruebasConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado trabajador1 = new Empleado ("Paco");
		Empleado trabajador2 = new Empleado ("Ana");
		Empleado trabajador3 = new Empleado ("Antonio");
		Empleado trabajador4 = new Empleado ("Juan");
		
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("Maria");
		
		System.out.println(trabajador1.dimeDatos());
		
		//Empleado.id++;
		
		System.out.println(trabajador2.dimeDatos());
		
		//Empleado.id++;
		
		System.out.println(trabajador3.dimeDatos());
		
		System.out.println(trabajador4.dimeDatos());

	}

}

class Empleado{
	
	private final String nombre; //Introducimos el final para declara una constante
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleado(String aNombre){
		
		nombre = aNombre;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	
	}
	
	public void cambiaSeccion(String aSeccion){ //SETTER
		
		this.seccion = aSeccion;
	}
	
	/*public void cambiaNombre (String nuevoNombre){ //SETTER---No tiene sentido porder cambia el nombre deberia ser inalterable = constante
		
		nombre = nuevoNombre;
	}*/
	
	public String dimeDatos(){
		
		return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id = " + id;
	}
	
}
