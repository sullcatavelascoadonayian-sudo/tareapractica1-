public class auto {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String color; // Se agrega para el inciso b
    // Constructor para inicializar el vehículo
    public auto(String marca, String modelo, int anio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = "Sin color"; // Color por defecto
    }
    // a) Método para mostrar el kilometraje en kilómetros y metros
    public void mostrarKilometraje() {
        int metros = this.kilometraje * 1000;
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + color + ")");
        System.out.println("Kilometraje: " + kilometraje + " km (" + metros + " metros)");
        System.out.println("------------------------------------");
    }
    // b) Método para cambiar el color del auto
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }
    // c) Método main donde creamos dos autos y probamos los métodos
    public static void main(String[] args) {
        auto auto1 = new auto("Toyota", "Corolla", 2020, 150);
        auto auto2 = new auto("Nissan", "Sentra", 2018, 85);
        auto1.cambiarColor("Rojo");
        auto2.cambiarColor("Negro");
        auto1.mostrarKilometraje();
        auto2.mostrarKilometraje();
    }
}