/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO2;

/**
 *
 * @author Luan Paulo
 */
public class Departamento {
    private String nome;
    private String descricao;

    
    
    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
