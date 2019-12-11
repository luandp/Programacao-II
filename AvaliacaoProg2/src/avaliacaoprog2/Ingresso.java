/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoprog2;

import sun.net.www.content.text.plain;

/**
 *
 * @author Aluno
 */
public class Ingresso{
       
        private String Poltrona;
                Pessoa pessoa;
                Sessao sessao;
        public Ingresso(Pessoa p, Sessao s, String Poltrona){
            setPoltrona(Poltrona);
            pessoa = p;
            sessao = s;
            
        }
        
    /**
     * 
     * @param Poltrona the Poltrona to set
     */
    public void setPoltrona(String Poltrona) {
       if(Poltrona == null){
             System.out.println("a Poltrona não pode ser Nula, valor não inserido, digite novamente");
       }else if(Poltrona.trim() == ""){
             System.out.println("o Dado: Poltrona não pode ficar Vazio, valor não inserido, digite novamente");       
       }else{
        this.Poltrona = Poltrona;       
       }
    }
        
        
}
