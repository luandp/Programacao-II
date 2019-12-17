/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va_progii.Fachada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pkg3va_progii.Classes.AlugarQuarto;
import pkg3va_progii.Classes.Quarto;
import pkg3va_progii.Classes.Cliente;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Luan Paulo
 */
public final class Fachada {
    public ArrayList<Cliente> clientes;
    public ArrayList<Quarto> quartos;
    public ArrayList<AlugarQuarto> clienteQuarto;
    
    public Fachada() throws Exception{
        this.clientes = (ArrayList<Cliente>) recuperarArquivo("Clientes.dat");
        if(clientes==null) clientes = new ArrayList<>();
        this.quartos = (ArrayList<Quarto>) recuperarArquivo("Quartos.dat");
        if(quartos==null) quartos = new ArrayList<>();
        this.clienteQuarto = (ArrayList<AlugarQuarto>) recuperarArquivo("ClienteQuarto.dat");
        if(clienteQuarto==null) clienteQuarto = new ArrayList<>();
    }
    
    public Fachada(ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<AlugarQuarto> clienteQuarto) {
        this.clientes = clientes;
        this.quartos = quartos;
        this.clienteQuarto = clienteQuarto;
    }
    
    //Clientes
    public void cadastrarCliente(String nome, int tel, String cpf) throws Exception{
        try {
        Cliente novo = new Cliente(nome, tel, cpf);
        clientes.add(novo);
        salvarArquivo(clientes, "Clientes.dat");
        } catch (Exception e) {
           throw new Exception("Erro CadastrarCliente(): "+e);
        }
    }

    public Cliente verificarClienteExiste(String nomeCliente) throws Exception{
        try {
            for (Cliente next : clientes) {
                if(next.getNome().equals(nomeCliente.trim())){
                    return next;
                }
            }
            throw new Exception();
        } catch (Exception e) {
        throw new Exception();
        }
    }
    public Cliente verificarClienteExisteCpf(String cpf) throws Exception{
        try {
            for (Cliente next : clientes) {
                if(next.getCpf().equals(cpf.trim())){
                    return next;
                }
            }
            throw new Exception();
        } catch (Exception e) {
        throw new Exception();
        }
    }
    
    //Quarto
    public void cadastrarQuarto(int numero, int status) throws Exception{
        try {
        Quarto novo = new Quarto(numero, status);
        quartos.add(novo);            
            salvarArquivo(quartos, "Quartos.dat");
        } catch (Exception e) {
        throw new Exception("Erro ao Cadastrar o Quarto"+e);
        }
    }
   
     public Quarto verificarQuartoExiste(int numeroQuarto) throws Exception{
        try {
            for (Quarto next : quartos) {
                if(next.getNumero()== numeroQuarto){
                    return next;
                }
            }
            throw new Exception();
        } catch (Exception e) {
        throw new Exception("Quarto não Existe"+e);
        }
    }
    
     //Quartos
    public void alugarQuarto(String nomeCliente, int numeroQuarto) throws Exception{
        try {
            Cliente cliente = verificarClienteExiste(nomeCliente);
            if(cliente==null) throw new Exception("Cliente não pode ser Nulo ou Inexistente!\nVerifique seu Nome ou Cadastre-o!");
            Quarto quarto = verificarQuartoExiste(numeroQuarto);
            if(quarto==null) throw new Exception("Quarto não pode ser Nulo ou Inexistente!\nVerifique seu Numero ou Cadastre-o!");
            verificarQuartoAlugado(quarto);
            quarto.setStatus(1);
            quartos.get(getIndexQuarto(quarto)).setStatus(1);
            AlugarQuarto novo = new AlugarQuarto(cliente, quarto);
            clienteQuarto.add(novo);
            salvarArquivo(clienteQuarto, "ClienteQuarto.dat");
        } catch (Exception e) {
        throw new Exception("Erro ao fazer o Check-in: "+e);
        }
   
    }
    
    public int getIndexQuarto(Quarto quarto) throws Exception{
        try {
            for(Quarto next : quartos){
                if(next.equals(quarto)){
                    return quartos.indexOf(next);
                }
            }
            throw  new Exception("Quarto não encontrado!");
        } catch (Exception e) {
            throw new Exception("Erro no GetIndexQuarto: "+e);
        }
    }
    public void fecharQuarto(int numeroQuarto) throws Exception{
        try {
            for (AlugarQuarto next : clienteQuarto) {
                if(next.getQuarto().getNumero()== numeroQuarto && next.getQuarto().getStatus()==1){
                    next.getQuarto().setStatus(0);
                    quartos.get(getIndexQuarto(next.getQuarto())).setStatus(0);
                    clienteQuarto.remove(next);
                    break;
                }       
            }
        } catch (Exception e) {
            throw new Exception("Erro ao fazer o Check-Out: "+e);
        }
    }

     public void verificarQuartoAlugado(Quarto quarto) throws Exception{
        try {
            if(quarto.getStatus()==1){
                throw new Exception("Quarto alugado!");
            }
        } catch (Exception e) {
        throw new Exception("Quarto não Existe"+e);
        }
    }
    
    //Arquivo
    
    public void salvarArquivo(Object objeto, String nomedoarquivo) throws Exception{
        try {
            File f = new File(nomedoarquivo);
            if(!f.exists()) f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
        } catch (Exception e) {
        throw new Exception("Erro SalvarArquivo(): "+e);
        }
    }
    
    public Object recuperarArquivo(String nomedoarquivo) throws Exception{
        try {
        Object o = new Object();
        File f = new File(nomedoarquivo);
        if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Object) ois.readObject();
            return o;
        }else{
            return null;
        }
        } catch (IOException | ClassNotFoundException e) {
        throw new Exception("Erro ao recuperar arquivo: "+e+" |-> ");
        }
    }
    
}
