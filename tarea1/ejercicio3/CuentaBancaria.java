/**
 * Clase CuentaBancaria.
 *
 * @author Tu Nombre
 * @version 1.0 11/02/2026
 *
 */
public class CuentaBancaria {
    private String titular;
    private String nroCuenta;
    private double saldo;
    public CuentaBancaria(String titular, String nroCuenta, double saldoInicial) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldoInicial;
    }
    /* a) y c) Método para depositar dinero */
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR: El monto a depositar debe ser mayor a 0.");
        } else {
            this.saldo += monto;
            System.out.println("Deposito realizado con exito. Nuevo saldo: $" + this.saldo);
        }
    }
    /* a) y b) Método para retirar dinero */
    public void retirar(double monto) {
        if (monto > this.saldo) {
            System.out.println("ERROR: Fondos insuficientes. No puede retirar mas dinero del que tiene.");
        } else if (monto <= 0) {
            System.out.println("ERROR: El monto a retirar debe ser mayor a 0.");
        } else {
            this.saldo -= monto;
            System.out.println("Retiro realizado con exito. Nuevo saldo: $" + this.saldo);
        }
    }
    /* d) Devuelve una cadena con todos los datos de la cuenta */
    public String toString() {
        return "Titular: " + this.titular + 
               " | Nro. Cuenta: " + this.nroCuenta + 
               " | Saldo: $" + this.saldo;
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "100-200-300", 500.0);
        System.out.println("--- DATOS DE LA CUENTA ---");
        System.out.println(cuenta.toString());
        System.out.println();
        System.out.println("--- PRUEBAS DE DEPOSITO ---");
        cuenta.depositar(-50); 
        cuenta.depositar(0);  
        cuenta.depositar(200); 
        System.out.println();
        System.out.println("--- PRUEBAS DE RETIRO ---");
        cuenta.retirar(1000);  
        cuenta.retirar(300);   
        System.out.println();
        // d) Mostrar datos finales
        System.out.println("--- DATOS FINALES DE LA CUENTA ---");
        System.out.println(cuenta.toString());
    }
}
