
public class ManipulaCadenasII {

	public static void main(String[] args) {
		
		String frase = "Hoy es un estupendo d�a para aprender a programar en Java";
		
		String fraseResumen = frase.substring(1, 3); //Introducimos el primer caracter que queremos y el ultimo es el que no queremos que aparezca
		
		System.out.println(fraseResumen); //Devuelve la posici�n 1 y la posici�n 2 y la 3 no la imprime
		
		String fraseResumen2 = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo...." + " y " + frase.substring(29, 57);
		
		System.out.println(fraseResumen2);

	}

}
