/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Fachada;

import java.util.ArrayList;
import java.util.List;
import projetopadrao.Controlador.Validador;
import projetopadrao.Interface.Interface;

/**
 *
 * @author Luan Paulo
 */
public class Fachada implements Interface{
    
    Validador control = new Validador();
    public String cadastrar(String id, String texto,String monetario,ArrayList<Integer> inteiros) {
        control.cadastrar(id,texto,monetario,inteiros);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String cadastrar2(String texto) {
        control.cadastrar2(texto);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
