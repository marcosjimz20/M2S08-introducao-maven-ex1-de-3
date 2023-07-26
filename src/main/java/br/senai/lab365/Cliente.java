package br.senai.lab365;

public class Cliente {
    private String nome;

// Constructores
    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
        System.out.println("Novo cliente cadastrado");
    }

// Getters e Setters


    public String getCliente() {
        return nome;
    }

    public void setCliente(String nome) {
        this.nome = nome;
    }
}
