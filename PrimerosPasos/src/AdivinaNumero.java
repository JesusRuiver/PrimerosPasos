import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random() * 100);

		/*
		 * System.out.println(aleatorio); //Multiplicando por 100 conseguimos
		 * que el numero este entre 0 y 100 //Ahora convertiremos un double que
		 * es random a enteri
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		int numero = 0;

		int intentos = 0;

		do {

			intentos++;

			System.out.println("Introduce un número, por favor");

			numero = entrada.nextInt();

			if (aleatorio < numero) {

				System.out.println("Mas Bajo");
			} else if (aleatorio > numero) {

				System.out.println("Mas Alto");
			}

		} while (numero != aleatorio);

		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");

	}

}
