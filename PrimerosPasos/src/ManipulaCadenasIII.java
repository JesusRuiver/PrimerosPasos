
public class ManipulaCadenasIII {

	public static void main(String[] args) {
		
		String alumno1, alumno2;
		
		alumno1 = "Jes�s";
		
		alumno2 = "jes�s";
		
		System.out.println(alumno1.equals(alumno2)); //Compara cadenas que sean exactemente iguales
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //Compara cadenas pero ignora mayusculas de minusculas

	}

}
