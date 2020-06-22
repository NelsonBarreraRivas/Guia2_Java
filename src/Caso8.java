import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese nota: ");
		int nota= sc.nextInt();
		String mensaje="";
		
		if (nota<=7)
			mensaje="Sin palabras";
		else if (nota<=10)
			mensaje="Malo";
		else if (nota<=14)
			mensaje="Regular";
		else if (nota<=17)
			mensaje="notable";
		else 
			mensaje="Excelente";
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Nota ingresada: "+nota);
		System.out.println("Estado obtenido: "+mensaje);
	}

}
