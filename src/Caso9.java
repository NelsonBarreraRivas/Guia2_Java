import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nombre de alumno: ");
		String nombre="";
		nombre=sc.nextLine();
		
		System.out.println("Ingrese primera nota: ");
		int nota1=sc.nextInt();
		System.out.println("Ingrese segunda nota: ");
		int nota2=sc.nextInt();
		System.out.println("Número de asistencias: ");
		float asistencia=sc.nextFloat();
		
		float promedio=nota1*0.3f+nota2*0.7f;
		float porcentaje=asistencia*100/12;
		
		String estado="";
		estado=sc.nextLine();
		
		if (promedio>=13 & porcentaje>=70)
			estado="Aprobado";
		else
			estado="Desaprobado";
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Nombre del Alumno(a): "+nombre);
		System.out.println("Promedio: "+promedio);
		System.out.println("Asistencia: "+porcentaje);
		System.out.println("Estado: "+estado);
		
		
		
		
		
		

	}

}
