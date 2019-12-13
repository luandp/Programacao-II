/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO3;

/**
 *
 * @author Luan Paulo
 */
public class Quarto {
    private String nome;
    private int Status;

    public Quarto(String nome, int Status) {
        this.nome = nome;
        this.Status = Status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
    
}
