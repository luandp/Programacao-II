/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Controlador;

import java.util.ArrayList;
import java.util.List;
import projetopadrao.Classe.Generica;
import projetopadrao.Interface.Interface;
import projetopadrao.Modelo.Modelador;

/**
 *
 * @author Luan Paulo
 */
public class Validador implements Interface{

    Modelador model = new Modelador();
    
    public String cadastrar(String id, String texto,String monetario,ArrayList<Integer> inteiros) {
        //Conversao
        try {
            int Id = Integer.parseInt(id);
            String Texto = texto;
            double Monetario = Double.parseDouble(monetario);
            List<Integer> Inteiros = new ArrayList<>();
            
            if(Id==0){
                    throw new Exception("Escolha outro Id, não pode ser 0");
            }
            if(Texto.trim().equals("")){
                    throw  new Exception("o Texto não pode ser Nulo, ou vazio");
            }
            if(Texto.trim().length()<10){
                    throw  new Exception("O Texto é Muito Curto, digita mais vai!");
            }
            if(Monetario==0){
                    throw new Exception("Este valor não pode ser 0,Escreva algum outro valor!");
            }
            if(Inteiros.isEmpty()){
                    throw new Exception("isso é uma Lista de Valores, não pode estar Vazia!");
            }
            Generica novo = new Generica(Id, Texto, Monetario, true, inteiros);
          return model.cadastrar(novo);
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        }
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
        //Conversao
        try {
            //Generica novo = new Generica(Id, Texto, Monetario, true, inteiros);
          return model.cadastrar2(texto);
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        }
    }
}
