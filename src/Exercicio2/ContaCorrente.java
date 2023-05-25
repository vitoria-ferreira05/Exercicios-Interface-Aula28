package Exercicio2;

public class ContaCorrente implements Tributos {
    private double saldoContaCorrente;


    public ContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    @Override
    public void calcularTributos() {
        System.out.println("Valor do tributo que tera que pagar: R$ " + saldoContaCorrente * 0.01);
    }
}
