public class Condiciones{
    public static void main(String[] args) {
        // Variable para leer el teclado		
		Scanner teclado = new Scanner(System.in);

        int edad = 0;
        int numero = 0;

        System.out.println("Ingresa tu edad: ");
		edad = teclado.nextInt();

        // Estructura básica de un if con else
        if(edad >= 18){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }

        System.out.println("Ingresa un numero: ");
		numero = teclado.nextInt();


        // Estructura con else if para evaluar varias condiciones
        // Se puede hacer todos los else if que se requerian
        // No es necesario que un if tenga un else o termine con else
        
        if(numero >= 1){
            System.out.println("Tu número es mayor o igual uno.");
        }else if (numero > 100){
            System.out.println("Tu número es mayor o igual a cien.");
        }else{
            System.out.println("Tu número es negativo.");
        }


        
    }
}