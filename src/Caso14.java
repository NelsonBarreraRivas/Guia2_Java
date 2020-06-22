import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int monto=0;
		float descuento=0,total=0;
		String mensaje="";
		System.out.print("Nombre del Alumno: ");
		String nombre= sc.nextLine();
		
		System.out.println("Descripcion :");
		System.out.println("Desarrallo de Software [DS]");
		System.out.println("Redes y Conectividad [RC]");
		System.out.println("Diseño  Grafico [DG]");
		
		System.out.print("Carrera :");
		String carrera= sc.nextLine();
	
		System.out.print("Turno [M, T, N] :");
		String turno= sc.nextLine();
		
		switch (carrera) {
		case "DS":
			monto=1500;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")){
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		case "RC":
			monto=1400;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")) {
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		case "DG":
			monto=1300;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")) {
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		default:
			monto=0;
			mensaje="Opcion incorrecta";
		
		
		}
		
		total=monto-descuento;
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Nombre del alumno : "+nombre);
		System.out.println("Monto de la Carrera : "+monto);
		System.out.println("Nombre de Turno : "+mensaje);
		System.out.println("Descuento : "+descuento);
		System.out.println("Total a pagar : "+total);
		System.out.println("Toatl a pagar en $Dolares : "+total*3.33);

	}

}
