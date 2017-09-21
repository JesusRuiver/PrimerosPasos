import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1: //Averiguaremos el area de un cuadrado
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); //Convertimos a int el valos cadena que se 
																						   //introduce en la ventana JOptionPane
			System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
			
			break;
		
		case 2: // Averiguamos el area del rectangulo

			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El área del rectangulo es " + (base * altura));

			break;
			
		case 3: // Averiaguamos el area del triangulo

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El área del triangulo es " + ((base * altura) / 2));

			break;

		case 4: // Averiguamos area del circulo

			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

			System.out.print("El área del circulo es ");
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

			break;

		default:

			System.out.println("La opción no es correcta");
		}

	}

}
