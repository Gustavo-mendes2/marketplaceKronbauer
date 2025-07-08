package entidades;

import entidades.enumeradas.Tipo;

import java.util.ArrayList;

public abstract class Conta {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    // private Tipo tier;

    public Conta(Integer id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        //  this.tier = tier;
    }

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

    public static boolean existeId(ArrayList<Conta> contas, int id) {
        for (Conta conta : contas) {
            if (conta.getId() == id) {
                return true;
            }
        }
        return false;
    }
}

