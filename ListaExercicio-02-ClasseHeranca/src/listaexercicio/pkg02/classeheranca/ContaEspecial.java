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
public class ContaEspecial extends Conta {
     /*
    Atributo limite
    Sobrescrever o método debitar 
    */
    private double Limite;
    
    public void debitar(double valor){
        if(getLimite()>=valor){
            setLimite(getLimite()-valor);
        }
    }

    /**
     * @return the Limite
     */
    public double getLimite() {
        return Limite;
    }

    /**
     * @param Limite the Limite to set
     */
    public void setLimite(double Limite) {
        this.Limite = Limite;
    }
    
    
    
}
