/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan Paulo
 */
public interface Interface {
        public String cadastrar(String id, String texto,String monetario,ArrayList<Integer> inteiros);
        public String atualizar();
        public String remover();
        
}
