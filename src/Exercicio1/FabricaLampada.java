package Exercicio1;

public class FabricaLampada {

    public  static Lampada construir(String tipoDeLampada){
        if (tipoDeLampada.equals("incandescente")){
            return new Incandescente();
        } else if (tipoDeLampada.equals("fluorescente")) {
            return new Fluorescente();
        }else {
            System.out.println("Essa lampada e inavalida : " + tipoDeLampada);
        }
        return null;
    }
}
