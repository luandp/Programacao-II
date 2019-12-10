/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio05.fachadagui.modelo.Fachada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import listaexercicio05.fachadagui.modelo.Classe.Pessoa;
import listaexercicio05.fachadagui.modelo.Interface.Interface;

/**
 *
 * @author Luan Paulo
 */
public class Fachada implements Interface{
           
           ArrayList<Pessoa> pessoas;
           File f = new File("pessoas.dat");
           public Fachada(){
            pessoas = this.recuperarPessoasSerializable(f);

           }
       
    @Override
    public String adicionarPessoa(String nome, String telefone, String rg){
        try {
         Pessoa p = new Pessoa(nome, telefone, rg);
         pessoas.add(p);
            adicionarPessoasSerializable(pessoas);
         return "Pessoa Adicionada com Sucesso!\nIndice:"+(pessoas.size()-1);
        } catch (Exception e) {
         throw new UnsupportedOperationException("Erro ao Criar esta Pessoa,\nVerifique os dados\ne Tente novamente"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void adicionarPessoas(ArrayList<Pessoa> pessoas) {
         try {
            if(!f.exists())f.createNewFile();
            FileWriter w = new FileWriter(f);
            for (Iterator<Pessoa> iterator = pessoas.iterator(); iterator.hasNext();) {
                Pessoa next = iterator.next();
                w.write(next.toString());
            }
               w.close();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Erro ao Adicionar no Arquivo,\nVerifique os dados\ne tente novamente"); //To change body of generated methods, choose Tools | Templates.
    
        }
       }

    public void adicionarPessoasSerializable(ArrayList<Pessoa> pessoas) {
         try {
            if(!f.exists())f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(pessoas);
	    oos.close();
               
           	
        } catch (Exception e) {
            throw new UnsupportedOperationException("Erro ao Adicionar no Arquivo,\nVerifique os dados\ne tente novamente"); //To change body of generated methods, choose Tools | Templates.
    
        }
       }

    
    @Override
    public ArrayList<Pessoa> recuperarPessoas(File f) {
           ArrayList<Pessoa> ps = new ArrayList<>();
        try {
            FileReader fr = new FileReader(f.toString());
            if(f.exists()){
                Scanner scan = new Scanner(f);
                BufferedReader br = new BufferedReader(fr);
			int count=0;
                        String nome = "";
                        String telefone = "";
                        String rg = "";
                        while(br.ready()){

                            String linha = br.readLine();
                        switch (count%3) {
                        case 0:
                            nome = linha;
                            break;
                        case 1:
                            telefone = linha;
                            break;
                        case 2:
                            rg = linha;
                            if(!nome.equals("") && !telefone.equals("") && !rg.equals("")){
                                Pessoa p = new Pessoa(nome, telefone, rg);
                                
                                ps.add(p);
                                nome = "";
                                telefone = "";
                                rg = "";
                            }
                            break;
                        default:
                            break;
                    }
                            count++;
                                
                        }
                        
            }
            return ps;
        } catch (Exception e) {
            return ps;
        }
    }

    public ArrayList<Pessoa> recuperarPessoasSerializable(File f) {
           ArrayList<Pessoa> ps = new ArrayList<>();
        try {
            if(f.exists()){
                FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ps = (ArrayList<Pessoa>) ois.readObject();
            }
            return ps;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getNomePessoa(int indice) {
        try {
            return pessoas.get(indice).getNome();
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
        }
    }

    @Override
    public String getTelefonePessoa(int indice) {
        try {
            return pessoas.get(indice).getTelefone();
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
        }
    }

    @Override
    public String getRGPessoa(int indice) {
        try {
            return pessoas.get(indice).getRg();
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
        }
    }
    
    public Pessoa getPessoa(int indice) {
        try {
            return pessoas.get(indice);
            
        } catch (Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
        }
    }
    
       
}
