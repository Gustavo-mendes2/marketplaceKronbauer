package entidades;

import entidades.enumeradas.Tipo;

import java.util.ArrayList;

// Classe da qual todas as contas herdam os atributos que compartilham

public abstract class Conta {

    // atributos

    private Integer id;
    private String nome;
    private String email;
    private String senha;

    // Constructor

    public Conta(Integer id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Recebe a lista de contas e verifica se uma certa ID existe dentro da lista.

    public static boolean existeId(ArrayList<Conta> contas, int id) {
        for (Conta conta : contas) {
            if (conta.getId() == id) {
                return true;
            }
        }
        return false;
    }
}

