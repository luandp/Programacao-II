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
public class Quarto implements Serializable{
    private int numero;
    private int status;

    public Quarto(int numero, int status) {
        this.numero = numero;
        this.status = status;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if(this.status==0){
            return "0 - Disponivel";
        }else{
            return "1 - Ocupado";    
        }
        
    }
    
    
    
    
}
