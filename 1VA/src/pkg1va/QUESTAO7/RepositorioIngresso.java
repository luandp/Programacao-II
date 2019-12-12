/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luan Paulo
 */
public class RepositorioIngresso {
        ArrayList<Ingresso> ingressos = new ArrayList<>();
        
        
        public ArrayList<String> retornaPessoas(String filme){
            ArrayList<String> lista = new ArrayList<>();
            for (Iterator<Ingresso> iterator = ingressos.iterator(); iterator.hasNext();) {
                Ingresso ing = iterator.next();
                if(ing.sessao.getNome_do_filme().equals(filme)){
                lista.add(ing.pessoa.getNome());
                }
            }
            return lista;
        }
}
