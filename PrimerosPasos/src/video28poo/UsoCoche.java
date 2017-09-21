package video28poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault = new Coche(); // Instaciar una Clase. Es un Ejemplar de Clase o Instacia de Clase.

		//System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas \n" + "Este coche tiene un largo de " + Renault.getLargo() + " cm");
		
		//System.out.println (Renault.dimeLargo());
		
		Coche miCoche = new Coche();
			
		miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		miCoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
		
		System.out.println(miCoche.dimeDatosGenerales());
		
		System.out.println(miCoche.dimeColor());
		
		System.out.println(miCoche.dimeAsientos());
		
		miCoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(miCoche.dimeClimatizador());
		
		System.out.println(miCoche.dimePesoCoche());
		
		System.out.println("El precio fina del coche es " + miCoche.precioCoche());
	}

}
