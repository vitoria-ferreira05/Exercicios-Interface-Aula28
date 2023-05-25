package Exercicio2;

import static Exercicio2.Tributos.*;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca saldoContaPoupanca = new ContaPoupanca(3000.00);
        ContaCorrente saldoContaCorrente = new ContaCorrente(1000.00);
        SeguroDeVida seguroDeVida = new SeguroDeVida(42);

        System.out.println("---DADOS DA(O) CLIENTE---");
        System.out.println("Cliente: " + NOME +
                " \nCPF: " + CPF +
                " \nNumero da conta: " + NUMEROCONTA);

        System.out.println("-------------------------------------");
        System.out.println("---DADOS CONTA POUPANCA---");
        System.out.println("Saldo da conta poupanca: R$ " + saldoContaPoupanca.getSaldoConta());
        saldoContaPoupanca.calcularTributos();

        System.out.println("-------------------------------------");
        System.out.println("---DADOS CONTA CORRENTE---");
        System.out.println("Saldo da conta corrente: R$ " + saldoContaCorrente.getSaldoContaCorrente());
        saldoContaCorrente.calcularTributos();

        System.out.println("-------------------------------------");
        System.out.println("---DADOS CONTA CORRENTE COM TAXA DO SEGURO DE VIDA---");
        System.out.println("Valor do seguro de vida: R$ " + seguroDeVida.getSeguroDeVida());
        double novoSaldoContaCorrente = saldoContaCorrente.getSaldoContaCorrente() - seguroDeVida.getSeguroDeVida();
        System.out.println("Saldo da conta corrente retirando taxa fixa do seguro: R$ " + novoSaldoContaCorrente);
    }
}
