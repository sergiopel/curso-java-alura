public class Compra {
    private String descricaoDaCompra;
    private double valorDaCompra;

    public Compra(String descricaoDaCompra, double valorDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
        this.valorDaCompra = valorDaCompra;
    }

    public String getDescricaoDaCompra() {
        return descricaoDaCompra;
    }

    public void setDescricaoDaCompra(String descricaoDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public String toString() {
        return descricaoDaCompra + " - " + valorDaCompra;
    }
}
