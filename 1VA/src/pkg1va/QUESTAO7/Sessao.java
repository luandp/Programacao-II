/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO7;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Sessao {
    private String nome_do_filme;
    private int numero_da_sala;
    private int hora_inicio;

    public Sessao(String filme, int sala,int hora){
        setNome_do_filme(filme);
        setNumero_da_sala(sala);
        setHora_inicio(hora);
    }

    public String getNome_do_filme() {
        return nome_do_filme;
    }

    public int getNumero_da_sala() {
        return numero_da_sala;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }
    
    
    
    
    /**
     * 
     * @param nome_do_filme the nome_do_filme to set
     */
    public void setNome_do_filme(String nome_do_filme) {
        if(nome_do_filme==null){
            System.out.println("o Nome do Filme não pode ser Nulo, valor não inserido, digite novamente");
        }else if(nome_do_filme.trim()==""){
            System.out.println("o Nome do Filme não pode ser Vazio, valor não inserido, digite novamente");        
        }
        else{
        this.nome_do_filme = nome_do_filme;     
        }
    }

    /**
     * @param numero_da_sala the numero_da_sala to set
     */
    public void setNumero_da_sala(int numero_da_sala) {
        this.numero_da_sala = numero_da_sala;
        }

    /**
     * @param hora_inicio the hora_inicio to set
     */
    public void setHora_inicio(int hora_inicio) {
        if(hora_inicio >=0){
            if(this.hora_inicio<=23){
                        this.hora_inicio = hora_inicio;
            }else{
                        System.out.println("a hora tem que ser de 0 à 23");
            }
        }else{
            System.out.println("a hora tem que ser de 0 à 23");
        }
    }
    
    
}
