package programa.figuras.recuperacion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaCaracter = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Programa de Figuras, seleccione opción:");
			System.out.println("1. Imagen triangulo");
			System.out.println("2. Salir");
			opcion = entradaCaracter.nextInt();
			
			switch(opcion) {
			case 1:
				int dimension = 0;
				do {
					System.out.println("Ingrese dimensión del triangulo:");
					dimension = entradaCaracter.nextInt();
					if (dimension <=0) {
						System.out.println("Dimension no valida, ingrese otra");
					}
				} while (dimension<=0);
				
				for (int fila = 1; fila < dimension; fila++) {
					for(int columna = 1; columna < fila; columna++) {
						System.out.println("* ");
					}
					System.out.println("");
				}
			break;
			}
		}while (opcion != 2);
	}

}
