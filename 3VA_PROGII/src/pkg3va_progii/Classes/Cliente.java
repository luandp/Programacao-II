/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va_progii.Classes;

import java.io.Serializable;

/**
 *
 * @author Luan Paulo
 */
public class Cliente implements Serializable{
    private String nome;
    private int tel;
    private String cpf;

    public Cliente() {
        this.nome = "";
        this.tel = 0;
        this.cpf = "";
    }
    
    public Cliente(String nome, int tel, String cpf) {
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
