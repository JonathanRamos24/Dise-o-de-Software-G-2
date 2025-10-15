
//literal #C
public class Pago {
    public void realizarCobro(double monto){
        //cargar el monto de compra al medio de pago
    }

    public void calcularImpuestosFactura(){
        //calcula los impuestos asociados a la compra
    }

    public void generarFactura(){
        //generar una nueva factura
    }
}
//En este seccion de codigo podemos identificar una violacion al princiipio de responsabilidad unica SRP

//ya que la clase Pago tiene mas de una razon para cambiar, ya que se encarga de realizar cobros, calcular impuestos y generar facturas.

//Para cumplir con el principio SRP, podemos dividir esta clase en tres clases separadas,para que cada una pueda tener una unica responsabilidad.

// Clase responsable del pago
public class Pago {
    public void realizarCobro(double monto){
        // cargar el monto de compra al medio de pago
    }
}
// Clase responsable de los impuestos
public class Impuesto {
    public double calcularImpuestos(double monto){
        // lógica para calcular impuestos
    }
}
// Clase responsable de la generación de facturas
public class Factura {
    public void generarFactura(){
        // generar una nueva factura
    }
}


//
//Vamos a analizar la otra parte del codigo 
//
public class PagoPayPal extends Pago {
    private boolean loggedIn; // conexión a cuenta PayPal

    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn) {
            return;
        }
        // cargar el monto de compra al medio de pago
    }
}
//En este caso, la clase PagoPayPal, es heredada de la clase Pago, pero tiene una responsabilidad adicional que es manejar la conexión a la cuenta PayPal.
//Por lo tanto, esto viola el principio de sustitución de Liskov (LSP), ya que PagoPayPal no puede ser sustituida por Pago sin alterar el comportamiento de la clase padre.
//Para poder cumplir con el principio LSP, podemos eliminar condiciones que alteren el comportamiento esperado de la clase base. y asegurarnos de que todas las clases derivadas puedan ser utilizadas de manera intercambiable sin afectar la funcionalidad del sistema.


// Interfaz que define el contrato de cualquier medio de pago
public interface MedioPago {
    void realizarCobro(double monto);
}

// Clase responsable de la conexión a PayPal 
public class SesionPayPal {
    private boolean loggedIn;

    public void iniciarSesion() {
        loggedIn = true;
    }

    public void cerrarSesion() {
        loggedIn = false;
    }

    public boolean estaLogeado() {
        return loggedIn;
    }
}

// Clase responsable del pago vía PayPal 
public class PagoPayPal implements MedioPago {
    private final SesionPayPal sesion;

    public PagoPayPal(SesionPayPal sesion) {
        this.sesion = sesion;
    }

    @Override
    public void realizarCobro(double monto) {
        // Supone que la sesión ya fue verificada
        System.out.println("Cobro realizado con PayPal por $" + monto);
    }
}
//De esta manera, hemos separado la responsabilidad de manejar la sesión de PayPal en una clase independiente (SesionPayPal), y la clase PagoPayPal ahora solo se encarga de realizar el cobro, cumpliendo así con el principio de sustitución de Liskov (LSP).






