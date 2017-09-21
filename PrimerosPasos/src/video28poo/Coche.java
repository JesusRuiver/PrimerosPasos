package video28poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero;
	private boolean climatizador;
	

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;

	}
	
	
	public int getRuedas(){ //GETTER
		
		return ruedas;
	}

	public int getLargo() {
		
		return largo; //GETTER: Este es un getter contruido como los he contruido YO hasta ahora.
	}
	
	public String dimeLargo(){
		
		return "El largo del coche es de " + largo + " cm"; //GETTER: Este es un getter que hace mas cosas explicado en el video 29
	}
	
	public String dimeDatosGenerales(){//GETTER
		
		return "La plataforma del vehiculo tinen " + ruedas + " ruedas" + ". Mide " + largo/1000 + " metros con un ancho de " +
				ancho + " cm y un peso de plataforma " + pesoPlataforma + " Kg";
	}
	
	public void estableceColor(String aColor){ //SETTER: Esto es un metodo setter
		
		color = aColor.toLowerCase();
	}

	public String dimeColor() { //GETTER
		
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) {

		// Utilizamos this. para hacer referencia a la variable de clase NO al
		// parametro que le pasamos asi distinguimos uno de otro si tuviesen el
		// mismo nombre

		if (asientosCuero.equalsIgnoreCase("Si")) {

			this.asientosCuero = true;
			
		} else {
			
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos(){ //GETTER
		
		if (asientosCuero == true){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}

	}

	public void configuraClimatizador(String climatizador) { //SETTER

		if (climatizador.equalsIgnoreCase("Si")) {

			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dimeClimatizador() { //GETTER

		if (climatizador == true) {
			return "El coche incorpora climeatizador";
		} else {
			return "El coche incorpora aire acondicionado";
		}
	}
	
	public String dimePesoCoche(){ // es un GETTER Y SETTER practica no recomendable a la hora de programar
		
		int pesoCarroceria = 500; //variable local
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if (asientosCuero = true){
			pesoTotal = pesoTotal+50;
		}
		
		if (climatizador = true){
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso del coche " + pesoTotal;
	}
	
	public int precioCoche() { // GETTER
		int precioFinal = 10000;

		if (asientosCuero = true) {
			precioFinal += 2000;
		}

		if (climatizador = true) {
			precioFinal += 1500;
		}

		return precioFinal;
	}

}
