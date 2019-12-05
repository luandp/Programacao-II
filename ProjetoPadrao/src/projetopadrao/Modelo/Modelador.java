/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Modelo;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import projetopadrao.Classe.Conexao;
import projetopadrao.Classe.Generica;
import projetopadrao.Interface.Interface;

/**
 *
 * @author Luan Paulo
 */
public class Modelador{
        Conexao con = new Conexao();
    public String cadastrar(Generica novo) {
        try {
            
            return "";
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        }
    }

    public String atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String cadastrar2(String texto) {
        try {
            File f = new File("novo-arquivo.txt");
		
		if(!f.exists()) f.createNewFile();
		
		FileWriter w = new FileWriter(f);

		w.write(texto);
		
		w.close();
		//s.close();
            return "Cadastrado com Sucesso!";
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        }
    }
}
