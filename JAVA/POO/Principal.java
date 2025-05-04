public class Principal {
    public static void main(String[] args) {
        
        // Llamar la función sumar enviando los parámetros
        // System.out.println(sumar(5, 10)); 

        // Crear la instancia de la clase Perro
        Animal animal1 = new Animal("Firulais", "Labrador", 5, 20.5);

        Animal animal2 = new Animal("Mateo", "Golden", 10, 30.5);

        // Mostrar los atributos del objeto animal (Getters)
        System.out.println("Nombre del animal 1: " + animal1.getNombre());
        System.out.println("Nombre del animal 2: " + animal2.getNombre());
        System.out.println("Raza del animal 1: " + animal1.getRaza());
        System.out.println("Raza del animal 2: " + animal2.getRaza());

        // Modificar los atributos del objeto animal (Setters)
        animal1.setNombre("Toby");
        animal1.setRaza("Bulldog");
        System.out.println("Nombre del animal 1: " + animal1.getNombre());
        System.out.println("Raza del animal 1: " + animal1.getRaza());

        animal1.hacerSonido("Guau Guau");
        animal2.hacerSonido("miau miau");

        animal1.accion("comer");

    }


    // Función para sumar dos números devolviendo el resultado
    public static int sumarDevolviendo(int a, int b) {
        int suma = a + b;
        return  suma;
    }


    // Función para sumar dos números sin devolver el resultado pero mostrando el resultado
    public static void sumarSinDevolver(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }
}
