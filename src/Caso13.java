import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("N�mero 1 : ");
		int numero1=sc.nextInt();
		System.out.println("N�mero 2 : ");
		int numero2=sc.nextInt();
		System.out.println("Operaci�n [1-6]: ");
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
			mensaje="Multiplicaci�n";
			break;
		case 4:
			if(numero2!=0) {
				operaciones= numero1 / numero2;
				mensaje="Divisi�n";
			}
			else
				mensaje="No es posible hallar la divisi�n";
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
		System.out.println("N�mero 1....: "+numero1);
		System.out.println("N�mero 2....: "+numero2);
		System.out.println("Operaci�n...: "+mensaje);
		System.out.println("Resultado...: "+operaciones);

	}

}
