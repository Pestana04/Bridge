package Test;

import Bridge.EntregaAgendada;
import Bridge.EntregaExpressa;
import Bridge.EntregaNormal;
import Bridge.RetiradaLocal;
import Bridge.ServicoBasico;
import Bridge.TipoEntrega;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoBasicoTest {

    @Test
    void deveRetornarValorServicoBasicoComEntregaNormal() {
        TipoEntrega tipoEntrega = new EntregaNormal();
        ServicoBasico servicoBasico = new ServicoBasico(50.0f);
        servicoBasico.setTipoEntrega(tipoEntrega);
        assertEquals(50.0f, servicoBasico.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoBasicoComEntregaExpressa() {
        TipoEntrega tipoEntrega = new EntregaExpressa();
        ServicoBasico servicoBasico = new ServicoBasico(50.0f);
        servicoBasico.setTipoEntrega(tipoEntrega);
        assertEquals(50.0f, servicoBasico.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoBasicoComEntregaAgendada() {
        TipoEntrega tipoEntrega = new EntregaAgendada();
        ServicoBasico servicoBasico = new ServicoBasico(50.0f);
        servicoBasico.setTipoEntrega(tipoEntrega);
        assertEquals(50.0f, servicoBasico.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarValorServicoBasicoComRetiradaLocal() {
        TipoEntrega tipoEntrega = new RetiradaLocal();
        ServicoBasico servicoBasico = new ServicoBasico(50.0f);
        servicoBasico.setTipoEntrega(tipoEntrega);
        assertEquals(50.0f, servicoBasico.calcularValorFinal(), 0.01f);
    }
}