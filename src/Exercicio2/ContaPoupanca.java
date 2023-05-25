package Exercicio2;

public class ContaPoupanca implements Tributos {

    private double saldoConta;

    public ContaPoupanca(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    @Override
    public void calcularTributos() {
        System.out.println("Valor do tributo da poupanca: R$ " + saldoConta * 0.0);
    }
}
