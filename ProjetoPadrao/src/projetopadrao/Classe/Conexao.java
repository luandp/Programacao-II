/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Classe;

import anexos.TextoObj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Luan Paulo
 */
public class Conexao {
        ArrayList<BlocoNotas> lista = new ArrayList<BlocoNotas>();
	private ArrayList<BlocoNotas> o;
        
        
    public Writer abrir(BlocoNotas nova) throws IOException{
        File file = new File(nova.NomeArquivo);
        
        FileWriter wr = new FileWriter(file);
        return wr;
    }
    
    public Writer fechar(BlocoNotas nova) throws IOException{
        File file = new File(nova.NomeArquivo);
        
        FileWriter wr = new FileWriter(file);
        return wr;
    }
    
    public void salvarArray() throws IOException {
		
		File f = new File("objetoArray.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this.lista);
		oos.close();
	}
	
	public void lerArray() throws IOException, ClassNotFoundException {
		File f = new File("objetoArray.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		this.o = (ArrayList<BlocoNotas>) ois.readObject();
		
		for (BlocoNotas bloconotas : o) {
			System.out.println("array"+bloconotas.getEscritor()+ bloconotas.getId());
		}
		ois.close();
	}
        
	public void salvar(TextoObj to) throws IOException {
		
		File f = new File("objeto.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(to);
		oos.close();
	}
	
	public void ler() throws IOException, ClassNotFoundException{
		
		File f = new File("objeto.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		TextoObj clone = (TextoObj) o;
		
		System.out.println(clone);
		
	}
}
