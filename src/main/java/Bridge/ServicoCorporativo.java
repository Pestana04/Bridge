package Bridge;

public class ServicoCorporativo extends ServicoDelivery {

    private int quantidadePedidos;

    public ServicoCorporativo(float valorBase) {
        super(valorBase);
    }

    public void setQuantidadePedidos(int quantidadePedidos) {
        this.quantidadePedidos = quantidadePedidos;
    }

    public float calcularValorFinal() {
        return this.valorBase * this.quantidadePedidos * (1 + this.tipoEntrega.percentualTaxa());
    }
}