package org.example;

public class Veiculo {
    private String marca;
    private String cor;
    private Boolean farolAlto;


    /**
     * Construtor vazio
     */
    public Veiculo() {
    }

    /**
     * Construção das propriedades com nosso construtor
     */
    public Veiculo(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    //Inicialização dos Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getFarolAlto() {
        return farolAlto;
    }

    public void setFarolAlto(Boolean farolAlto) {
        this.farolAlto = farolAlto;
    }

    //Metodo que será usado em outra forma como polimorfismo
    public void exibirPainel() {
        System.out.println("Exibindo Painel");
    }

}
