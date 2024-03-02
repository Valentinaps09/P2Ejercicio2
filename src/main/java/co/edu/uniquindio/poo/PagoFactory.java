package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class PagoFactory {

    private final static Map<TipoPago,Pago> pagos = new HashMap<>(){{

        put(TipoPago.PAYPAL,new PagoPaypal() );
        put(TipoPago.APPLE_PAY,new PagoApplePay() );
        put(TipoPago.GOOGLE_PAY,new PagoGooglePay());
        put(TipoPago.BITCOIN,new PagoBitcoin());
        put(TipoPago.EFECTIVO,new PagoEfectivo());
        put(TipoPago.TARJETA_DEBITO,new PagoTarjetaDebito());
        put(TipoPago.TARJETA_CREDITO,new PagoTarjetaCredito());
        put(TipoPago.TRANSFERENCIA,new PagoTransferencia());

    }};
    
    public Pago obtenerPago(TipoPago tipoPago){
        return pagos.get(tipoPago); 
    }
}