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
public class AlugarQuarto implements Serializable{
        private Cliente cliente;
        private Quarto quarto;

    public AlugarQuarto() {
        this.cliente = null;
        this.quarto = null;
    }    
        
    public AlugarQuarto(Cliente cliente, Quarto quarto) {
        this.cliente = cliente;
        this.quarto = quarto;
    }

        
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
        
        
}
