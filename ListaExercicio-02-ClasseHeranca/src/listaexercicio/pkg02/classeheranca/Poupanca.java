/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg02.classeheranca;

/**
 *
 * @author Luan Paulo
 */
public class Poupanca extends Conta{
    
        protected double Variacao;

        public Poupanca(int numero, double saldo, double variacao){
            super(numero,saldo);
            setVariacao(variacao);
            
    }    
    public double getVariacao() {
        return Variacao;
    }

    public void setVariacao(double Variacao) {
        this.Variacao = Variacao;
    }

    public void RenderJuros(double jurosMensal){
        this.creditar(this.getSaldo()*jurosMensal);
    }

}
