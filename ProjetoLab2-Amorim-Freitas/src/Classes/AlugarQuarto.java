/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Luan Paulo
 */
public class AlugarQuarto implements Serializable{
       private Cliente cli;
       private Quarto qua;

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Quarto getQua() {
        return qua;
    }

    public void setQua(Quarto qua) {
        this.qua = qua;
    }
       
       
}
