import java.util.Scanner;

public class Main {
//Criar projeto conforme descrição abaixo
/*
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String tipoConta;
        String dadosIniciais;
        double saldoInicial = 0;


        System.out.println("Entre com o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Entre com o tipo da conta: ");
        tipoConta = sc.nextLine();
        System.out.println("Entre com o saldo inicial: ");
        saldoInicial = sc.nextDouble();

        dadosIniciais= """
                ***************************
                Dados iniciais do cliente:
                
                Nome: %s 
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***************************
                """.formatted(nome, tipoConta, saldoInicial);
        System.out.println(dadosIniciais);


    }
}