package br.com.alura.screenmatch.desafios.desafios2;

public class ContaBancaria {
    private String conta;
    private double saldo;

    public ContaBancaria(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
