package Bridge;

public class ServicoPremium extends ServicoDelivery {

    public ServicoPremium(float valorBase) {
        super(valorBase);
    }

    public float calcularValorFinal() {
        return this.valorBase * (1 + this.tipoEntrega.percentualTaxa());
    }
}