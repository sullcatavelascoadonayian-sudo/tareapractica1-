/*
 * Clase Bus.
 *
 * @author Tu Nombre
 * @version 1.0 11/02/2026
 *
 */
public class Bus {
    private String placa;
    private int capacidadAsientos;
    private int pasajerosActuales;
    private double costoPasaje;
    private double totalRecaudado;
    public Bus(String placa, int capacidadAsientos) {
        this.placa = placa;
        this.capacidadAsientos = capacidadAsientos;
        this.pasajerosActuales = 0;
        this.costoPasaje = 1.50; 
        this.totalRecaudado = 0.0;
    }
    /* a)actualizar los datos del bus */
    public void subirPasajeros(int x) {
        int asientosDisponibles = this.capacidadAsientos - this.pasajerosActuales;
        if (x <= 0) {
            System.out.println("ERROR: La cantidad de pasajeros debe ser mayor a 0.");
        } else if (x > asientosDisponibles) {
            System.out.println("ERROR: No hay suficientes asientos. Solo quedan " + asientosDisponibles + " disponibles.");
        } else {
            this.pasajerosActuales += x;
            System.out.println("Subieron " + x + " pasajeros con exito.");
            cobrarPasaje(x); 
        }
    }
    /* b) cobrar pasaje a los pasajeros */
    public void cobrarPasaje(int cantidad) {
        double cobro = cantidad * this.costoPasaje;
        this.totalRecaudado += cobro;
        System.out.println("Se cobro Bs. " + cobro + " por " + cantidad + " pasajes.");
    }
    /* c)cuántos asientos quedan disponibles */
    public int asientosDisponibles() {
        return this.capacidadAsientos - this.pasajerosActuales;
    }
    public String toString() {
        return "Bus Placa: " + this.placa + 
               " | Pasajeros a bordo: " + this.pasajerosActuales + "/" + this.capacidadAsientos + 
               " | Asientos libres: " + asientosDisponibles() + 
               " | Recaudado: Bs. " + this.totalRecaudado;
    }
    /** d) Metodo Principal para probar los incisos */
    public static void main(String[] args) {
        Bus miBus = new Bus("1234-ABC", 30);
        System.out.println("--- ESTADO INICIAL DEL BUS ---");
        System.out.println(miBus.toString());
        System.out.println();
        System.out.println("--- SUBIENDO PASAJEROS ---");
        miBus.subirPasajeros(10);
        System.out.println("Asientos disponibles: " + miBus.asientosDisponibles());
        System.out.println();
        System.out.println("--- INTENTO DE SUBIR MAS DE LA CAPACIDAD ---");
        miBus.subirPasajeros(25);
        System.out.println();
        System.out.println("--- SUBIENDO SEGUNDO GRUPO ---");
        miBus.subirPasajeros(15);
        System.out.println("Asientos disponibles: " + miBus.asientosDisponibles());
        System.out.println();
        System.out.println("--- ESTADO FINAL DEL BUS ---");
        System.out.println(miBus.toString());
    }
}
