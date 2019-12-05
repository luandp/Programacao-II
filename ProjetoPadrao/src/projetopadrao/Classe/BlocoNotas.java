/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Classe;

import java.io.Serializable;

/**
 *
 * @author Luan Paulo
 */
public class BlocoNotas implements Serializable{
        int id;
        String Escritor;
        String NomeArquivo;

    public BlocoNotas(int id, String Escritor, String NomeArquivo) {
        this.id = id;
        this.Escritor = Escritor;
        this.NomeArquivo = NomeArquivo;
    }

    public BlocoNotas() {
        this.id = 0;
        this.Escritor = "";
        this.NomeArquivo = "";
    }
        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEscritor() {
        return Escritor;
    }

    public void setEscritor(String Escritor) {
        this.Escritor = Escritor;
    }

    public String getNomeArquivo() {
        return NomeArquivo;
    }

    public void setNomeArquivo(String NomeArquivo) {
        this.NomeArquivo = NomeArquivo;
    }
        
    
    
        
        
        
        
}
