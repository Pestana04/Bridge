package Test;

import Bridge.EntregaAgendada;
import Bridge.EntregaExpressa;
import Bridge.EntregaNormal;
import Bridge.RetiradaLocal;
import Bridge.ServicoCorporativo;
import Bridge.TipoEntrega;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCorporativoTest {

    @Test
    void deveRetornarValorServicoCorporativoComEntregaNormal() {
        TipoEntrega tipoEntrega = new EntregaNormal();
        ServicoCorporativo servicoCorporativo = new ServicoCorporativo(80.0f);
        servicoCorporativo.setTipoEntrega(tipoEntrega);
        servicoCorporativo.setQuantidadePedidos(2);
        assertEquals(160.0f, servicoCorporativo.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoCorporativoComEntregaExpressa() {
        TipoEntrega tipoEntrega = new EntregaExpressa();
        ServicoCorporativo servicoCorporativo = new ServicoCorporativo(80.0f);
        servicoCorporativo.setTipoEntrega(tipoEntrega);
        servicoCorporativo.setQuantidadePedidos(2);
        assertEquals(176.0f, servicoCorporativo.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoCorporativoComEntregaAgendada() {
        TipoEntrega tipoEntrega = new EntregaAgendada();
        ServicoCorporativo servicoCorporativo = new ServicoCorporativo(80.0f);
        servicoCorporativo.setTipoEntrega(tipoEntrega);
        servicoCorporativo.setQuantidadePedidos(2);
        assertEquals(192.0f, servicoCorporativo.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoCorporativoComRetiradaLocal() {
        TipoEntrega tipoEntrega = new RetiradaLocal();
        ServicoCorporativo servicoCorporativo = new ServicoCorporativo(80.0f);
        servicoCorporativo.setTipoEntrega(tipoEntrega);
        servicoCorporativo.setQuantidadePedidos(2);
        assertEquals(152.0f, servicoCorporativo.calcularValorFinal(), 0.01f);
    }
}