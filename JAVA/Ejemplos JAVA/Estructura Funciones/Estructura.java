import java.util.Scanner;

public class Estructura {
    public static void main(String[] args) {
        // Variable para leer el teclado
        Scanner teclado = new Scanner(System.in);

        // Variables para pruebas
        int num1, num2;
        String nombre;

        // Solicitar los datos al usuario
        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next(); // Para leer una palabra simple

        // Llamar a las funciones
        int sumaResultado = sumar(num1, num2);
        int restaResultado = restar(num1, num2);
        mostrarMensaje(nombre);

        // Mostrar resultados
        System.out.println("La suma es: " + sumaResultado);
        System.out.println("La resta es: " + restaResultado);
    }

    // Función que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función que resta dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función que muestra un mensaje personalizado
    public static void mostrarMensaje(String nombre) {
        System.out.println("Hola, " + nombre + "! Bienvenido al programa.");
    }
}
