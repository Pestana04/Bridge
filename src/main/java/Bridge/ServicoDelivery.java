package Bridge;

public abstract class ServicoDelivery {

    protected TipoEntrega tipoEntrega;
    protected float valorBase;

    public ServicoDelivery(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValorFinal();
}