/*
As compras (valor e descrição), serão lançadas no cartão de crédito
e na classe main haverá um List das compras acumuladas
 */
public class Compra implements Comparable<Compra>{
    private String descricaoDaCompra;
    private double valorDaCompra;

    public Compra(String descricaoDaCompra, double valorDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
        this.valorDaCompra = valorDaCompra;
    }

    // a descrição da compra é inserida no construtor, então
    // não tem sentido ter um setter para ela
    public String getDescricaoDaCompra() {
        return descricaoDaCompra;
    }

    // o valor da compra é inserida no construtor, então
    // não tem sentido ter um setter pra ele
    public double getValorDaCompra() {
        return valorDaCompra;
    }

    @Override
    public String toString() {
        return "Compra: descrição = " + descricaoDaCompra + " - valor = " + valorDaCompra;
    }

    // ordenar por valor da compra
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorDaCompra).compareTo(Double.valueOf(outraCompra.valorDaCompra));
    }
}
