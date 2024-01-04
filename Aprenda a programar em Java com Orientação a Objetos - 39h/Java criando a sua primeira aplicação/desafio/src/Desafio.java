import java.util.Scanner;

public class Desafio {
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
        double saldo = 0;
        String operacoes;
        int opcaoDesejada = 0;
        double valorAReceber = 0;
        double valorATransferir = 0;

        System.out.println("Entre com o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Entre com o tipo da conta: ");
        tipoConta = sc.nextLine();
        System.out.println("Entre com o saldo inicial: ");
        saldo = sc.nextDouble();

        dadosIniciais= """
                ***************************
                Dados iniciais do cliente:
                
                Nome: %s 
                Tipo conta: %s
                Saldo: R$ %.2f
                ***************************
                """.formatted(nome, tipoConta, saldo);
        System.out.println(dadosIniciais);

        operacoes = """
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                 
                Digite a opção desejada:
                """;

        while (opcaoDesejada != 4) {
            System.out.println(operacoes);
            opcaoDesejada = sc.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("O saldo é: " + saldo + "\n");
            } else if (opcaoDesejada == 2) {
                System.out.println("Digite o valor a receber: ");
                valorAReceber = sc.nextDouble();
                saldo += valorAReceber;
                System.out.println("O saldo atualizado é: " + saldo + "\n");
            } else if (opcaoDesejada == 3) {
                System.out.println("Digite o valor a transferir: ");
                valorATransferir = sc.nextDouble();
                if (valorATransferir > saldo) {
                    System.out.println("Valor a transferir é maior que o saldo, digite outro valor" + "\n");
                } else {
                    saldo -= valorATransferir;
                    System.out.println("O saldo atualizado é: " + saldo + "\n");
                }
            } else {
                if (opcaoDesejada != 4) {
                    System.out.println("Opção inválida! Digite uma opção de 1 a 4.");
                }
            }
        }







    }
}