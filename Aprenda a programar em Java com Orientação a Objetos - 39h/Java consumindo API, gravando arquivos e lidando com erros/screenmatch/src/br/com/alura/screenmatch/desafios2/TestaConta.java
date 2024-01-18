package br.com.alura.screenmatch.desafios2;

import java.util.ArrayList;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("454545-4", 5005.96);
        ContaBancaria conta2 = new ContaBancaria("154545-x", 1005.96);
        ContaBancaria conta3 = new ContaBancaria("254545-1", 2005.96);
        ContaBancaria conta4 = new ContaBancaria("354545-46", 3005.96);
        ContaBancaria conta5 = new ContaBancaria("654545-9", 15005.96);

        ArrayList<ContaBancaria> listContas = new ArrayList<>();
        listContas.add(conta1);
        listContas.add(conta2);
        listContas.add(conta3);
        listContas.add(conta4);
        listContas.add(conta5);

        // variável contaMaiorSaldo do tipo ContaBancaria recebe o primeiro objeto
        ContaBancaria contaMaiorSaldo = listContas.get(0);

        for (ContaBancaria conta : listContas) {
            System.out.println("Saldo da conta: " + conta.getSaldo());
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo é: " + contaMaiorSaldo.getConta() +
        " e o seu saldo é: " + contaMaiorSaldo.getSaldo());

    }
}
