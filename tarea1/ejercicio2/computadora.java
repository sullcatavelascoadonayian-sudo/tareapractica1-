public class computadora {
    // Atributos privados según el diagrama UML
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;
    // Constructor 1: por defecto (sin parámetros)
    public computadora() {
        this.marca = "Sin marca";
        this.procesador = "Sin procesador";
        this.ram = 0;
        this.almacenamiento = 0;
    }
    // Constructor 2: parametrizado (recibe todos los datos)
    public computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    // Getter para obtener la RAM
    public int getRam() {
        return this.ram;
    }
    // b) Método para determinar si la RAM es igual a X
    public boolean tieneRamIgualA(int x) {
        return this.ram == x;
    }
    // Método auxiliar para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("------------------------------------");
    }
    // c) Método para comparar 2 computadoras y mostrar la de mayor almacenamiento
    public static void mostrarMayorAlmacenamiento(computadora c1,computadora c2) {
        System.out.println("--- COMPUTADORA CON MAYOR ALMACENAMIENTO ---");
        if (c1.almacenamiento > c2.almacenamiento) {
            c1.mostrarDatos();
        } else if (c2.almacenamiento > c1.almacenamiento) {
            c2.mostrarDatos();
        } else {
            System.out.println("Ambas computadoras tienen la misma capacidad de almacenamiento.");
        }
    }
    public static void main(String[] args) {
        // a) Instanciar 2 objetos de diferente forma
        computadora pc1 = new computadora(); // Forma 1: Usando constructor por defecto
        computadora pc2 = new computadora("Asus", "Intel i7", 16, 1024); // Forma 2: Usando constructor parametrizado
        // Asignamos datos a pc1 para probar los incisos b y c
        pc1.marca = "Lenovo";
        pc1.procesador = "Ryzen 5";
        pc1.ram = 8;
        pc1.almacenamiento = 512;

        // b) Determinar si la cantidad de memoria RAM es igual a X
        int x = 8;
        System.out.println("¿La RAM de pc1 es igual a " + x + " GB? " + pc1.tieneRamIgualA(x));
        System.out.println("¿La RAM de pc2 es igual a " + x + " GB? " + pc2.tieneRamIgualA(x));
        System.out.println();

        // c) Mostrar la computadora con mayor almacenamiento
        mostrarMayorAlmacenamiento(pc1, pc2);
    }
}