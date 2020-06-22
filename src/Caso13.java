import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Número 1 : ");
		int numero1=sc.nextInt();
		System.out.println("Número 2 : ");
		int numero2=sc.nextInt();
		System.out.println("Operación [1-6]: ");
		int operacion=sc.nextInt();
		float operaciones=0;
		String mensaje="";
		
		switch (operacion) {
		case 1:
			operaciones= numero1 + numero2;
			mensaje="Suma";
			break;
		case 2:
			operaciones= numero1 - numero2;
			mensaje="Resta";
			break;
		case 3:
			operaciones= numero1 * numero2;
			mensaje="Multiplicación";
			break;
		case 4:
			if(numero2!=0) {
				operaciones= numero1 / numero2;
				mensaje="División";
			}
			else
				mensaje="No es posible hallar la división";
			break;	
		case 5:
			if(numero2!=0) {
				operaciones= numero1 % numero2;
				mensaje="Resto Entero";
			}
			else
				mensaje="No es posible hallar el resto entero";
			break;
		case 6:
			operaciones= (numero1 + numero2) * 0.5f;
			mensaje="Promedio";
			break;
		
		default:
			mensaje="Desconocido valor  0";
	}
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Número 1....: "+numero1);
		System.out.println("Número 2....: "+numero2);
		System.out.println("Operación...: "+mensaje);
		System.out.println("Resultado...: "+operaciones);

	}

}
