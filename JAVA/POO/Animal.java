public class Animal {
    // Atributos
    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    // Constructor  (Recibe los parámetros y asigna los valores a los atributos)
    public Animal(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters
    // Permiten acceder a los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    // Permiten modificar los atributos de la clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para hacer un sonido
    // Este método recibe un parámetro de tipo String y lo imprime en consola
    public void hacerSonido(String sonido) {
        System.out.println(this.nombre+" está diciendo: "+sonido);
    }

    // Método para realizar una acción
    // Este método recibe un parámetro de tipo String y lo imprime en consola
    // Dependiendo del valor del parámetro, se imprime un mensaje diferente
    public void accion(String accion) {
        if (accion.equalsIgnoreCase("comer")) {
            System.out.println(this.nombre+" Está Yam yam");
        } else if (accion.equalsIgnoreCase("dormir")) {
            System.out.println(this.nombre+" Está Zzzz");
        } else {
            System.out.println("Acción no reconocida");
        }
    }
}