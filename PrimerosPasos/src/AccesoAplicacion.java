import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Elisa Solana";

		String pass = ""; //Es una cadena vacia y a su vez esta cadena es diferente a la clave

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contraseņa, por favor");

			if (clave.equals(pass) == false) {

				System.out.println("Contraseņa Incorrecta");
			}

		}

		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
