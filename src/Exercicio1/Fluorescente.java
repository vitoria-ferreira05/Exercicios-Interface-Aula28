package Exercicio1;

public class Fluorescente implements Lampada {
    private boolean ligado = false;

    @Override
    public boolean ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Voce ligou a lampada fluorescente");
        }
        return false;
    }

    @Override
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Voce desligou a lampada fluorescente");
        }
    }
}
