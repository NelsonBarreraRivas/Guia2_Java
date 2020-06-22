import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese primer número: ");
		int n1= sc.nextInt();
		System.out.print("Ingrese segundo número: ");
		int n2= sc.nextInt();
		
		String mensaje="";
		
		if(n1==n2)
			mensaje="Los números son iguales";
		else if (n1>n2)
				mensaje="El primer número es mayor";
		else 
			mensaje="El segundo número es mayor";
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("La respuesta: "+mensaje);
		

	}

}
