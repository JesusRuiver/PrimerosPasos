
public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] miMatriz = new int [5];
		
		miMatriz [0] = 5;
		miMatriz [1] = 38;
		miMatriz [2] = -15;
		miMatriz [3] = 92;
		miMatriz [4] = 71;
		
		//System.out.println(miMatriz [0]);
		*/
		
		int [] miMatriz = {5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78};
		
		System.out.println("Los elementos de la matriz son " + miMatriz.length);
		
		for ( int i = 0; i < miMatriz.length; i++){
			
			System.out.println("Valor del índice " + i + " = " + miMatriz[i]);
		}

	}

}
