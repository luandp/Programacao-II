/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg02.classeheranca;

import java.util.Random;

/**
 *
 * @author Luan Paulo
 */
public class Conta {
    protected int Numero;
    protected double Saldo;
    protected Random gerador = new Random();
    public Conta(){
        setNumero(gerador.nextInt());
        setSaldo(0);
        
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public void creditar(double valor){
            this.Saldo += valor;
        }
    
    public void debitar(double valor){
            this.Saldo -= valor;
          
    }
    
}
