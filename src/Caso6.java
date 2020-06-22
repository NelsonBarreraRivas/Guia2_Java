import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese sueldo: ");
		float sueldo=sc.nextFloat();
		float impuesto=0;
		
		if(sueldo>2800) {
			impuesto= sueldo * 0.05f;
			
		}else {
			impuesto= sueldo * 0.02f;
		}
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Impuesto calculado:"+impuesto);
	}

}
