package org.example;

/**
 * Classe Carro (Filha) que extende sua classe pai Veiculo (Herança Simples)
 */
public class Carro extends Veiculo {


    public Carro() {
    }

    public Carro(String marca, String cor) {
        super(marca, cor);

    }

    public void tocarRaio() {
        System.out.println("Tocando rádio...");
    }

    public void acelerarCarro() {
        System.out.println("Estamos acelerando o carro...");

    }

    @Override
    public void exibirPainel() {
        System.out.println("Aplicando polimorfismo, estamos exibindo o painel diretamente do carro...");
    }

    /**
     * Usamos o toString para exibir um objeto de forma legível.
     */
    @Override
    public String toString() {
        return "marca='" + getMarca() + '\'' + ", cor='" + getCor() + '\'';
    }
}
