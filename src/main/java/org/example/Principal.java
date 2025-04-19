package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lerRepostaMotorista = new Scanner(System.in);
        Carro meuCarro = new Carro("Ford Fiesta Rocan", "Vermelho");

        /**
         * Modo 1- utilizando o Construtor com Parametros
         **/


        System.out.println("================================================");
        System.out.println("====Polimorfismo====");
        meuCarro.exibirPainel();
        System.out.println("================================================");


        System.out.println("================================================");
        System.out.println("====Exibindo mensagem no Painel====");
        System.out.println(" O carro que temos atualmente é: " + meuCarro);
        System.out.println("================================================");


        System.out.println("================================================");
        System.out.println("====Nova mensagem no Painel====");
        System.out.println("Claro motorista, deseja tocar o rádio? ");
        String respostaMotorista = lerRepostaMotorista.next();
        if (respostaMotorista.equals("Sim")) {
            meuCarro.tocarRaio();
        } else {
            System.out.println("================================================");
            System.out.println("Ok, então vamos desligar o rádio.");
            System.out.println("================================================");
        }


        /**
         * Modo 2- utilizando o Construtor vazio para instanciar objetos acesso os Getters e Setters
         **/
        Carro meuCarro2 = new Carro();
        meuCarro2.setCor("Azul");
        meuCarro2.setMarca("Brasília");
        meuCarro2.setFarolAlto(true);

        System.out.println("==========================================Modelo 2====================================================");
        System.out.println(meuCarro2.getFarolAlto());
        System.out.println(meuCarro2.getCor());
        System.out.println(meuCarro2.getMarca());


    }
}
