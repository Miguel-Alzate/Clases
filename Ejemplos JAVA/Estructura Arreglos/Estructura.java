import java.util.Scanner;
public class Estructura{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Declarar un arreglo unidimensional
        int arreglo [] = new int [5];

        //Llenar un arreglo unidimensional manualmente
        arreglo[0] = 12345;
        arreglo[1] = 56789;
        arreglo[2] = 98765;
        arreglo[3] = 65987;
        arreglo[4] = 23451;

        //Lenar un arreglo unidimensional con ciclo
        for(int i = 0; i < 5; i++){
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        //Recorrer un arreglo unidimensional
        for(int i = 0; i < 5; i++){
            System.out.println(arreglo[i]);
        }

        //Buscar un valor en un arreglo unidimensional
        System.out.print("Ingrese el valor a buscar: ");
        int buscar = entrada.nextInt();
        boolean encontrado = false;
        for(int i = 0; i < 5; i++){
            if(arreglo[i] == buscar || encontrado == false){
                encontrado = true;
                i
                break;

            }
        }
        if(encontrado){
            System.out.println("El valor " + buscar + " se encuentra en el arreglo.");
        }else{
            System.out.println("El valor " + buscar + " no se encuentra en el arreglo.");
        }
     
    }
}