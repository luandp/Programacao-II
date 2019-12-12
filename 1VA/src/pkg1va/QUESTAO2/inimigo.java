/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO2;

/**
 *
 * @author Luan Paulo
 */
public class inimigo {
    private String nome;
    private float percentualVida;
    private int velocidade;

    public inimigo(String nome, float percentualVida, int velocidade) {
        this.nome = nome;
        this.percentualVida = percentualVida;
        this.velocidade = velocidade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentualVida() {
        return percentualVida;
    }

    public void setPercentualVida(float percentualVida) {
        this.percentualVida = percentualVida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public void atualiza(inimigo i){
        if(i != null && getVelocidade()>0 && getPercentualVida()>0){
            this.nome = getNome();
            this.percentualVida = getPercentualVida();
            this.velocidade = getVelocidade();
        }
    }
    
    public boolean equals(Object o){
        if(o instanceof inimigo){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Dados:\n    Nome:"+this.nome+"\n    PercVida:"+this.percentualVida+"\n    Veloc:"+this.velocidade;
    }
    
}
