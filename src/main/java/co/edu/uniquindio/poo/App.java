package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoPago.TRANSFERENCIA);
        pago.crearPago();
    }
}
