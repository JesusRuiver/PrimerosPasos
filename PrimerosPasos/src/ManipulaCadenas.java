
public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Elisa Solana Jimenez";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println(("Mi nombre tiene " + nombre.length() + " letras."));
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		System.out.println("La tercera letra de mi nombre es " + nombre.charAt(2));
		
		//-----Vamos averiguar cual es la ultima letra para cualquier nombre ----//
		
		int ultimaLetra;
		
		ultimaLetra = nombre.length(); //Almacenamos el numero de cararcteres que tiene el nombre
		
		System.out.println("La ultima letra es la " + nombre.charAt(ultimaLetra-1)); //Devuelve la ultima letra del nombre que introduzcamos
		

	}

}
