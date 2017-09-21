package video33poo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		// Vamos a Construir en un solo fichero todas las clases PRACTICA NO RECOMENDABLE DE CARA A LA MODULARIZACION//
		
		/* Empleado empleado1 = new Empleado("Jesús Ruiz", 30000, 2015, 3, 14);
		Empleado empleado2 = new Empleado("Elisa Solana", 54400, 2007, 0, 10);
		Empleado empleado3 = new Empleado("Ana López", 22300, 1995, 6, 5);
		Empleado empleado4 = new Empleado("Maria Martín", 51230, 2001, 9, 24);
		
		empleado1.subirSueldo(15);
		empleado2.subirSueldo(20);
		empleado3.subirSueldo(12);
		empleado4.subirSueldo(3);
		
		System.out.println("Nombre: " + empleado1.dimeNombre() + " Sueldo: " + empleado1.dimeSueldo() + " Fecha de Alta: " + empleado1.dimeFechaContrato());
		System.out.println("Nombre: " + empleado2.dimeNombre() + " Sueldo: " + empleado2.dimeSueldo() + " Fecha de Alta: " + empleado2.dimeFechaContrato());
		System.out.println("Nombre: " + empleado3.dimeNombre() + " Sueldo: " + empleado3.dimeSueldo() + " Fecha de Alta: " + empleado3.dimeFechaContrato());
		System.out.println("Nombre: " + empleado4.dimeNombre() + " Sueldo: " + empleado4.dimeSueldo() + " Fecha de Alta: " + empleado4.dimeFechaContrato());*/
		
		Empleado [] misEmpleados = new Empleado [4];
		
		misEmpleados[0] = new Empleado("Jesús Ruiz", 30000, 2015, 3, 14);
		misEmpleados[1] = new Empleado("Elisa Solana", 54400, 2007, 0, 10);
		misEmpleados[2] = new Empleado("Ana López", 22300, 1995, 6, 5);
		misEmpleados[3] = new Empleado("Maria Martín", 51230, 2001, 9, 24);
		
		//-------LO HACEMOS CON UN BUCLE FOR NORMAL-----//
		
		/*for (int i =0; i < 4;i++){
			
			misEmpleados[i].subirSueldo(5);
		}
		
		for (int i = 0; i < 4; i++){
			System.out.println("Nombre: " + misEmpleados[i].dimeNombre() + " Sueldo " + misEmpleados[i].dimeSueldo() + "Fecha de Alta" + misEmpleados[i].dimeFechaContrato() + "\n");
		} */
		
		//---LO HACEMOS CON UN BUCLE FOR EACH---//
		
		for(Empleado empleados : misEmpleados){
			
			empleados.subirSueldo(5);
			
			System.out.println("Nombre: " + empleados.dimeNombre() + " Sueldo " + empleados.dimeSueldo() + "Fecha de Alta" + empleados.dimeFechaContrato() + "\n");
		}
		
	}

}

class Empleado {

	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String aNombre, double aSueldo, int aAnio, int aMes, int aDia) {

		nombre = aNombre;
		sueldo = aSueldo;
		GregorianCalendar calendario = new GregorianCalendar(aAnio, aMes-1, aDia); //Ponemos el Mes -1 porque para java Enero es 0
		
		altaContrato = calendario.getTime();
	
	}
	
	public String dimeNombre(){ //GETTER
		
		return nombre;
	}
	
	public double dimeSueldo(){ //GETTER
		
		return sueldo;
	}
	
	public Date dimeFechaContrato(){ //GETTER
		
		return altaContrato;
	}
	
	public void subirSueldo (double porcentaje){ //SETTER
		
		double aumentoSueldo = sueldo * porcentaje/100;
		
		sueldo += aumentoSueldo;
	}
}
