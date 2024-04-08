package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "gerentes")
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private int numFuncGerenciados;


    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numFuncGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numFuncGerenciados = numFuncGerenciados;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }


    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

