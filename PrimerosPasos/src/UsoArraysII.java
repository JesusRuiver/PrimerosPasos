import javax.swing.JOptionPane;

public class UsoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises = new String [8];
		
		/*paises [0] = "Espa�a";
		paises [1] = "Mexico";
		paises [2] = "Colombia";
		paises [3] = "Peru";
		paises [4] = "Chile";
		paises [5] = "Argentina";
		paises [6] = "Ecuador";
		paises [7] = "Venezuela";*/
		
		/*for (int i = 0; i < paises.length; i++){
			
			System.out.println(("Pa�s " + (i+1) + " " + paises[i]));
		}*/
		
		//String [] paises = {"Espa�a", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		for (int i=0; i<8;i++){
			
			paises[i] = JOptionPane.showInputDialog("Introduce pa�s " + (i+1));
		}
		
		for (String elemento : paises){
			
			System.out.println("Pa�s: " + elemento);
		}
		
	}

}
