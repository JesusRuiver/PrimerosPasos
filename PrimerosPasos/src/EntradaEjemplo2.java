import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edadUsuario = Integer.parseInt(edad); // Pasamos la edad String a int con parseInt
		
		//edadUsuario ++; Suma 1 a la edad ususario

		System.out.print ("Hola " + nombreUsuario + ". El a�o que viene tendr�s " + (edadUsuario+1) + " a�os");
	}
	

}
