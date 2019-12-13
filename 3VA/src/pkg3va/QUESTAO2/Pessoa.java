/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO2;

import java.util.Date;

/**
 *
 * @author Luan Paulo
 */
public class Pessoa {
    private String nome;
    private String DataNascimento;
    private String cpf;

    public Pessoa(String nome, String DataNascimento, String cpf) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.cpf = cpf;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
