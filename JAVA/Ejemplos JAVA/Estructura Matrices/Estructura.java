import java.util.Scanner;

public class Estructura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declarar un arreglo bidimensional de 3x3
        int[][] arreglo = new int[4][4];

        // Llenar un arreglo bidimensional manualmente
        arreglo[0][0] = 123;
        arreglo[0][1] = 456;
        arreglo[0][2] = 789;

        
        arreglo[1][0] = 987;
        arreglo[1][1] = 654;
        arreglo[1][2] = 321;
        arreglo[2][0] = 111;
        arreglo[2][1] = 222;
        arreglo[2][2] = 333;

        // Llenar un arreglo bidimensional con ciclo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                arreglo[i][j] = entrada.nextInt();
            }
        }

        // Recorrer un arreglo bidimensional
        System.out.println("Contenido del arreglo bidimensional:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("arreglo[" + i + "][" + j + "] = " + arreglo[i][j]);
            }
        }

        // Buscar un valor en un arreglo bidimensional
        System.out.print("Ingrese el valor a buscar: ");
        int buscar = entrada.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arreglo[i][j] == buscar) {
                    encontrado = true;
                    System.out.println("El valor " + buscar + " se encuentra en la posición [" + i + "][" + j + "] del arreglo.");
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El valor " + buscar + " no se encuentra en el arreglo.");
        }
    }
}
