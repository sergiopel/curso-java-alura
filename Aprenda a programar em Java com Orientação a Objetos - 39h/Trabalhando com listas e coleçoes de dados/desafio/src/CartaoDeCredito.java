import java.util.List;

/*
- Criar aplicação para lançamento de compras com cartão de crédito
- Menu para lançamento de compras
- Exibição da lista de compras realizadas o ordenadas por valor
 */
public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compra;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void lancaCompra(List<Compra> compra) {
        this.compra = compra;
    }
}
