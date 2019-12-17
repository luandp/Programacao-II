/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Classes.AlugarQuarto;
import Classes.Cliente;
import Classes.Quarto;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Paulo
 */
public final class Fachada {
    ArrayList<Cliente> clientes;
    ArrayList<Quarto> quartos;
    ArrayList<AlugarQuarto> clienteQuarto;
    
    public Fachada() throws Exception{
        recuperarClientes();
        recuperarQuartos();
        recuperarClienteQuarto();
    }
    
    
    public void cadastrarCliente(String nome,int telefone,String cpf) throws Exception{
        try {
            Cliente cli = new Cliente();
            if(nome.trim()==null || nome.trim().equals("") || nome.trim().length()<4) throw new Exception("Nome não pode ser Nulo ou Vazio! E não pode ter menos de 4 Caracteres");
            cli.setNome(nome);
            if(String.valueOf(telefone).trim()==null || String.valueOf(telefone).trim().equals("") || telefone==0) throw new Exception("Telefone não pode ser Nulo, Vazio ou 0");
            cli.setTelefone(telefone);
            if(cpf.trim()==null || cpf.trim().equals("") || cpf.trim().length()<3) throw new Exception("Nome não pode ser Nulo ou Vazio! E não pode ter menos de 3 Caracteres");
            cli.setCpf(cpf);
            
            clientes.add(cli);
            
            File f = new File("Clientes.txt");
            if(!f.exists()) f.createNewFile();
            FileOutputStream fileout = new FileOutputStream(f);
            ObjectOutputStream objectout = new ObjectOutputStream(fileout);
            objectout.writeObject(clientes);
            
        } catch (Exception e) {
            throw new Exception("Fachada:CadastrarCliente:"+e);
        }
    }
    
    public void cadastrarQuarto(int numero,int status) throws Exception{
        try {
            Quarto qua = new Quarto();
            if(String.valueOf(numero).trim()==null || String.valueOf(numero).trim().equals("") || numero==0) throw new Exception("Numero não pode ser Nulo, Vazio ou 0");
            qua.setNumero(numero);
            if(String.valueOf(status).trim()==null || String.valueOf(status).trim().equals("") || status<0 || status > 1) throw new Exception("Status não pode ser Nulo, Vazio ou != 1 ou 0");
            qua.setStatus(status);
            
            quartos.add(qua);
            
            File f = new File("Quartos.txt");
            if(!f.exists()) f.createNewFile();
            FileOutputStream fileout = new FileOutputStream(f);
            ObjectOutputStream objectout = new ObjectOutputStream(fileout);
            objectout.writeObject(quartos);
            
            
        } catch (Exception e) {
            throw new Exception("Fachada:CadastrarQuarto:"+e);
        }
    }
    
    public void alugarQuarto(String nome, int numero) throws Exception{
        try {
            AlugarQuarto cliQua = new AlugarQuarto();
            
            for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {
                Cliente next = iterator.next();
                if(next.getNome().equals(nome)){
                    cliQua.setCli(next);
                    break;
                }   
            }
            if(cliQua.getCli()==null) throw new Exception("Cliente não Existe!");
            
            for (Iterator<Quarto> iterator = quartos.iterator(); iterator.hasNext();) {
                Quarto next = iterator.next();
                if(next.getNumero()==numero && next.getStatus() != 1){
                    next.setStatus(1);
                    cliQua.setQua(next);
                    break;
                }   
            }
            if(cliQua.getCli()==null) throw new Exception("N° Quarto não Existe ou está Ocupado!");
            
            clienteQuarto.add(cliQua);
            
            File f = new File("clienteQuarto.txt");
            if(!f.exists()) f.createNewFile();
            FileOutputStream fileout = new FileOutputStream(f);
            ObjectOutputStream objectout = new ObjectOutputStream(fileout);
            objectout.writeObject(clienteQuarto);
            
        } catch (Exception e) {
            throw new Exception("Fachada:AlugarQuarto:"+e);
        }
    }
    
    public void fecharQuarto(int numero) throws Exception{
        try {
            Quarto aux = null;
            for (Iterator<AlugarQuarto> iterator = clienteQuarto.iterator(); iterator.hasNext();) {
                AlugarQuarto next = iterator.next();
                if(next.getQua().getNumero()==numero && next.getQua().getStatus()==1){
                    clienteQuarto.remove(next);
                    aux = next.getQua();
                }
                for (Iterator<Quarto> iterator1 = quartos.iterator(); iterator1.hasNext();) {
                    Quarto next1 = iterator1.next();
                    if(next.equals(aux)){
                        next1.setStatus(0);
                    }
                }
                
            File fquartos = new File("Quartos.txt");
            if(!fquartos.exists()) fquartos.createNewFile();
            FileOutputStream fileout = new FileOutputStream(fquartos);
            ObjectOutputStream objectout = new ObjectOutputStream(fileout);
            objectout.writeObject(quartos);
            
            File fcliqua = new File("clienteQuarto.txt");
            if(!fcliqua.exists()) fcliqua.createNewFile();
            FileOutputStream fileoutcliqua = new FileOutputStream(fcliqua);
            ObjectOutputStream objectoutcliqua = new ObjectOutputStream(fileoutcliqua);
            objectoutcliqua.writeObject(clienteQuarto);
                
            }
        } catch (Exception e) {
            throw new Exception("Fachada:FecharQuarto:"+e);
        }
    }
    
    public void exibirQuartos() throws Exception{
        try {
            String Comeco = "Inicio da Lista de Quartos:\n_____\n";
            String meio = "";
            String fim = "_____\nFim da Lista de Quartos";
            
            for (Quarto quarto : quartos) {
                meio += "_______\nN° Quarto: "+quarto.getNumero()+"\nStatus: "+quarto.getStatus()+"\n";
            }
            JOptionPane.showMessageDialog(null, Comeco+meio+fim);
        } catch (HeadlessException e) {
            throw new Exception("Fachada:ExibirQuartos:"+e);
        }
    }
    
    public void recuperarClientes() throws Exception{
        try {
            File f = new File("Clientes.txt");
            if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>) ois.readObject();
        }else{
            clientes = new ArrayList<>();
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Fachada:RecuperarClientes:"+e);
        }
    }
    
        public void recuperarQuartos() throws Exception{
        try {
            File f = new File("Quartos.txt");
            if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            quartos = (ArrayList<Quarto>) ois.readObject();
        }else{
            quartos = new ArrayList<>();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Fachada:RecuperarQuartos:"+e);
        }
    }
        
        public void recuperarClienteQuarto() throws Exception{
        try {
            File f = new File("clienteQuarto.txt");
            if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            clienteQuarto = (ArrayList<AlugarQuarto>) ois.readObject();
        }else{
            clienteQuarto = new ArrayList<>();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Fachada:RecuperarClienteQuarto:"+e);
        }
    }
}
