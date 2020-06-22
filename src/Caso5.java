import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Precio: ");
		float precio= sc.nextFloat();
		
		System.out.print("Cantidad: ");
		int cantidad=sc.nextInt();
		
		float parcial = precio*cantidad;
		float dscto=0;
		
		if (cantidad >8)
			dscto= 0.1f*parcial;
		float total= parcial-dscto;
		
		System.out.println("RESULTADO");
		System.out.println("==========");
		System.out.println("Parcial............:"+parcial);
		System.out.println("Descuento..........:"+dscto);
		System.out.println("Total..............:"+total);
		
	}

}
