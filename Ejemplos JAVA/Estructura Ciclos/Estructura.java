import java.util.Scanner;

public class Estructura{
	public static void main(String[] args) {
		
		// Variable de Entrada por teclado.
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese numero de Tabla: ");
		int numero = entrada.nextInt();

		System.out.print(" => Ingrese cantidad Multiplos: ");
		int multiplos = entrada.nextInt();

		// Ciclo while
		int contador = 1;
		while( contador <= multiplos ){
			int resultado = numero * contador;
			System.out.println(numero+" x "+contador+" = "+resultado);
			contador = contador + 1;
		}

		// Ciclo for (el más usado)
        //Se divide en 3, 1. declaración de variable (int i = 0)
        //2. Condicion del ciclo, hasta donde va (i<=multiplos)
        //3. Suma de la variable i para que se sume en 1 (i++)
		for(int i=0; i<=multiplos; i++ ){
			int resultado = numero * i;
			System.out.println(numero+" x "+i+" = "+resultado);
		}


		// Ciclo do while
		int contador = 1;
		do{
			int resultado = numero * contador;
			System.out.println(numero+" x "+contador+" = "+resultado);
			contador = contador + 1;
		}while(contador<=multiplos);

	}
}