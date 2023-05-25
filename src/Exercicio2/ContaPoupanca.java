package Exercicio2;

public class ContaPoupanca implements Tributos {

    private double saldoContaPoupanca;

    public ContaPoupanca(double saldoConta) {
        this.saldoContaPoupanca = saldoContaPoupanca;
    }

    public double getSaldoConta() {
        return saldoContaPoupanca;
    }

    @Override
    public void calcularTributos() {
        System.out.println("Valor do tributo da poupanca: R$ " + saldoContaPoupanca * 0.0);
    }
}
