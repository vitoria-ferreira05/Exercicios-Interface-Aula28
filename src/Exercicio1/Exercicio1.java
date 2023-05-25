package Exercicio1;

import java.util.Scanner;

import static Exercicio1.Lampada.MARCA;

public class Exercicio1 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        Fluorescente lampadaFluorecente = new Fluorescente();
        Incandescente lampadaIncandescente = new Incandescente();

        System.out.println("Temos dois tipos de lampadas: incandescente e fluorescente. Qual voce quer construir?");
        String tipoDeLampada = sc.next();


        System.out.println("Voce escolheu a lampada " + tipoDeLampada + " , e so para informar a marca da sua lampada e: " + MARCA);


        while (true){
            System.out.println("Agora vamos testar a lampada que voce escolheu \n" +
                    "1. Ligar a lampada\n" +
                    "2. Desligar a lampada");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    if (tipoDeLampada.equals("incandescente")){
                        lampadaIncandescente.ligar();
                    }
                    if (tipoDeLampada.equals("fluorescente")){
                        lampadaFluorecente.ligar();
                    }
                    break;
                    case 2:
                        if (tipoDeLampada.equals("incandescente")){
                            lampadaIncandescente.desligar();
                        }
                        if (tipoDeLampada.equals("fluorescente")){
                            lampadaFluorecente.desligar();
                        }
                break;
                default:
                    System.out.println("Opcao incorreta, teremos que iniciar novamente :)");
                    System.exit(0);
                    break;
            }
        }

    }
}
