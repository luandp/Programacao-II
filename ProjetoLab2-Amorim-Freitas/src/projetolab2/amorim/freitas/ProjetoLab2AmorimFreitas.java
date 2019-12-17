/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab2.amorim.freitas;

import Fachada.Fachada;
import Gui.Tela;

/**
 *
 * @author Luan Paulo
 */
public class ProjetoLab2AmorimFreitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Fachada fachada = new Fachada();
        Tela tela = new Tela(fachada);
        tela.show();
    }
    
}
