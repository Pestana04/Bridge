package Test;

import Bridge.EntregaAgendada;
import Bridge.EntregaExpressa;
import Bridge.EntregaNormal;
import Bridge.RetiradaLocal;
import Bridge.ServicoPremium;
import Bridge.TipoEntrega;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoPremiumTest {

    @Test
    void deveRetornarValorServicoPremiumComEntregaNormal() {
        TipoEntrega tipoEntrega = new EntregaNormal();
        ServicoPremium servicoPremium = new ServicoPremium(100.0f);
        servicoPremium.setTipoEntrega(tipoEntrega);
        assertEquals(100.0f, servicoPremium.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoPremiumComEntregaExpressa() {
        TipoEntrega tipoEntrega = new EntregaExpressa();
        ServicoPremium servicoPremium = new ServicoPremium(100.0f);
        servicoPremium.setTipoEntrega(tipoEntrega);
        assertEquals(110.0f, servicoPremium.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoPremiumComEntregaAgendada() {
        TipoEntrega tipoEntrega = new EntregaAgendada();
        ServicoPremium servicoPremium = new ServicoPremium(100.0f);
        servicoPremium.setTipoEntrega(tipoEntrega);
        assertEquals(120.0f, servicoPremium.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoPremiumComRetiradaLocal() {
        TipoEntrega tipoEntrega = new RetiradaLocal();
        ServicoPremium servicoPremium = new ServicoPremium(100.0f);
        servicoPremium.setTipoEntrega(tipoEntrega);
        assertEquals(95.0f, servicoPremium.calcularValorFinal(), 0.01f);
    }
}