/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author Luan Paulo
 */
public class ControleRemotoTV implements ControleRemoto{

    @Override
    public void aumentar() {
     toString("aumente");
    }

    @Override
    public void diminuir() {
        toString("diminua");
    }

    public String toString(String texto) {
        return this.toString()+" o volume";
    }
    
    
    
    
}
