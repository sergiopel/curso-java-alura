package br.com.alura.screenmatch.desafios.persistenciadados;

public class Veiculo {
    private String marca;
    private String modelo;
    private String motor;

    public Veiculo(String marca, String modelo, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "(marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' + ")";
    }
}
