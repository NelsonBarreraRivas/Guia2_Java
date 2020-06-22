import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Cliente: ");
		String cliente=sc.nextLine();
		
		System.out.print("Producto [TB, LT, MN, IM]: ");
		String producto= sc.nextLine();
		
		System.out.print("Cantidad: ");
		int cantidad= sc.nextInt();
		
		sc.nextLine();

		System.out.print("Forma de pago [C1, C2]: ");
		String forma=sc.nextLine();
		
		int precio= 0;
		float importe=0,desincre=0,total=0;
		String mensaje="";
		
		switch (producto) {
			case "TB":
				precio=350;
				if (forma.equals("C1")) {
					importe= precio*cantidad;
					desincre=importe*0.05f;
					mensaje="Descuento";
					total= importe - desincre;
				}
				else if(forma.equals("C2")) {
					importe= precio*cantidad;
					desincre=importe*0.12f;
					mensaje="Incremento";
					total= importe - desincre;
				}
				break;
			case "LT":
				precio=2300;
				if (forma.equals("C1")) {
					importe= precio*cantidad;
					desincre=importe*0.05f;
					mensaje="Descuento";
					total= importe - desincre;
				}
				else if(forma.equals("C2")) {
					importe= precio*cantidad;
					desincre=importe*0.12f;
					mensaje="Incremento";
					total= importe - desincre;
				}
				break;
			case "MN":
				precio=850;
				if (forma.equals("C1")) {
					importe= precio*cantidad;
					desincre=importe*0.05f;
					mensaje="Descuento";
					total= importe - desincre;
				}
				else if(forma.equals("C2")) {
					importe= precio*cantidad;
					desincre=importe*0.12f;
					mensaje="Incremento";
					total= importe - desincre;
				}
				break;
				
			case "IM":
				precio=680;
				if (forma.equals("C1")) {
					importe= precio*cantidad;
					desincre=importe*0.05f;
					mensaje="Descuento";
					total= importe - desincre;
				}
				else if(forma.equals("C2")) {
					importe= precio*cantidad;
					desincre=importe*0.12f;
					mensaje="Incremento";
					total= importe + desincre;
				}
				break;
		default:
			precio=0;
		}
		
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Nombre del cliente: "+cliente);
		System.out.println("Producto: "+producto);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cantidad);
		System.out.println("Importe: "+importe);
		System.out.println("Forma de pago: "+forma);
		System.out.println(mensaje+ ": " +desincre);
		System.out.println("Total a pagar: "+total);
			
		

	}

}
