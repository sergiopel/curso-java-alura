import java.util.ArrayList;
import java.util.List;

/*
- Criar aplicação para lançamento de compras com cartão de crédito
- Menu para lançamento de compras
- Exibição da lista de compras realizadas o ordenadas por valor
 */
public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValorDaCompra()) {
            this.saldo -= compra.getValorDaCompra();
            compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}
