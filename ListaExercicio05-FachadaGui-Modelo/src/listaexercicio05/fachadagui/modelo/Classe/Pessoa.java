/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio05.fachadagui.modelo.Classe;

/**
 *
 * @author Luan Paulo
 */
public class Pessoa {
    String nome;
    String telefone;
    String rg;
    
    //Construtor Vazio
     public Pessoa() {
        this.nome = "";
        this.telefone = "";
        this.rg = "";
    }
    //Construtor Completo

    public Pessoa(String nome, String telefone, String rg) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
    }

    //Gets and Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    //toString

    @Override
    public String toString() {
        return ""+getNome()+"\n"+getTelefone()+"\n"+getRg()+"\n";
    }
    
    
    
    
}
