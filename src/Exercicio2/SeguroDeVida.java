package Exercicio2;

public class SeguroDeVida implements Tributos {
    private double seguroDeVida;

    public SeguroDeVida(double seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }

    public double getSeguroDeVida() {
        return seguroDeVida;
    }

    @Override
    public void calcularTributos() {
    }
}
