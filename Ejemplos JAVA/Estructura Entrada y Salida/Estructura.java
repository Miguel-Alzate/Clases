import java.util.Scanner;

public class Estructura {
	public static void main(String[] args) {
		// Variable para leer el teclado		
		Scanner teclado = new Scanner(System.in);

        // Variables de tipos complejos y especiales (byte, short, int, long, float, double, boolean)    
        char letra;
		byte turno;
		short loteria_risaralda;
		int saldo_bancario;
		long tarjeta_identidad;
		float nota;
		double pi;
		boolean bandera;
		String nombre;

        //Ejemplos de entrada de texto
		System.out.println("Ingrese turno: ");
		turno = teclado.nextByte();

		System.out.println("Ingrese loteria_risaralda: ");
		loteria_risaralda = teclado.nextShort();

		System.out.println("Ingrese saldo_bancario: ");
		saldo_bancario = teclado.nextInt();

		System.out.println("Ingrese tarjeta_identidad: ");
		tarjeta_identidad = teclado.nextLong();

		System.out.println("Ingrese nota: ");
		nota = teclado.nextFloat();

		System.out.println("Ingrese pi: ");
		pi = teclado.nextDouble();

		System.out.println("Ingrese bandera: ");
		bandera = teclado.nextBoolean();

		System.out.println("Ingrese nombre: ");
		nombre = teclado.nextLine(); //Tener en cuenta que no es nextString, es nextLine

        //Ejemplos de salida de texto
		System.out.println("turno: "+turno);
		System.out.println("loteria_risaralda: "+loteria_risaralda);
		System.out.println("saldo_bancario: "+saldo_bancario);
		System.out.println("tarjeta_identidad: "+tarjeta_identidad);
		System.out.println("Nota: "+nota);
		System.out.println("PI: "+pi);
		System.out.println("Bandera: "+bandera);
		
	}
}