package br.com.alura.screenmatch2.desafios2;

public class Cachorro extends Animal {

    private String som;

    public Cachorro() {

    }
    public Cachorro(String nome, int idade, String som) {
        super(nome, idade);
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void late() {
        System.out.println("O cachorro está latindo");
    }
}
