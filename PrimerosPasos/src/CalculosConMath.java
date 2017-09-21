
public class CalculosConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz = Math.sqrt(9);

		System.out.println(raiz);

		double potencia = Math.pow(3, 3);

		System.out.println("El resultado de 3 elevado a 3 es de " + potencia);

		double num1 = 5.85;

		int resultado = (int) Math.round(num1); // Hacemos un cast para poder
												// almacenar un round que es un
												// long y lo convertimos a int

		System.out.println(resultado);
		

	}

}
