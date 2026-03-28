package Bridge;

public class ServicoBasico extends ServicoDelivery {

    public ServicoBasico(float valorBase) {
        super(valorBase);
    }

    public float calcularValorFinal() {
        return this.valorBase;
    }
}