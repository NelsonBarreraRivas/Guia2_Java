import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float bono=0,descuento=0,meta=0;
		String empleado="";
		System.out.println("Nombre de Empleado: ");
		empleado = sc.nextLine();
		System.out.println("Horas Trabajadas: ");
		float horasT=sc.nextFloat();
		System.out.println("Tarifa por horas: ");
		float tarifa= sc.nextFloat();
		System.out.println("Minutos de tardanza: ");
		float min=sc.nextFloat();
		
		float importe= horasT * tarifa;
		meta=100*horasT/70;
		if(horasT>60 && min>15) {
			bono = importe*0.13f;
			descuento= importe * 0.03f;
		}
		else {
			bono = importe*0.04f;
		}
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Trabajador: "+empleado);
		System.out.println("Horas Trabajadas: "+horasT);
		System.out.println("Importe: "+importe);
		System.out.println("Bono: "+bono);
		System.out.println("Descuento: "+descuento);
		System.out.println("Meta alcanzada: "+meta+"%");
	}

}
