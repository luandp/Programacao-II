/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va_progii.Fachada;

import pkg3va_progii.Classes.AlugarQuarto;
import pkg3va_progii.Classes.Quarto;
import pkg3va_progii.Classes.Cliente;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luan Paulo
 */
public class Fachada {
    ArrayList<Cliente> clientes;
    ArrayList<Quarto> quartos;
    ArrayList<AlugarQuarto> clienteQuarto;

    public Fachada(){
        this.clientes = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.clienteQuarto = new ArrayList<>();
    }
    
    public Fachada(ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<AlugarQuarto> clienteQuarto) {
        this.clientes = clientes;
        this.quartos = quartos;
        this.clienteQuarto = clienteQuarto;
    }
    
    public void cadastrarCliente(String nome, int tel, String cpf) throws Exception{
        try {
        Cliente novo = new Cliente(nome, tel, cpf);
        clientes.add(novo);
        } catch (Exception e) {
           throw new Exception();
        }
    }
    
    public void cadastrarQuarto(int numero, int status) throws Exception{
        try {
        Quarto novo = new Quarto(numero, status);
        quartos.add(novo);            
        } catch (Exception e) {
        throw new Exception();
        }
    }
    
    public void alugarQuarto(String nomeCliente, int numeroQuarto) throws Exception{
        try {
            Cliente cliente = verificarClienteExiste(nomeCliente);
            Quarto quarto = verificarQuartoExiste(numeroQuarto);
            if(quarto.getStatus()==1){
                throw new Exception();
            }
            AlugarQuarto novo = new AlugarQuarto(cliente, quarto);
            clienteQuarto.add(novo);
        } catch (Exception e) {
        throw new Exception();
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
    
    public Quarto verificarQuartoExiste(int numeroQuarto) throws Exception{
        try {
            for (Quarto next : quartos) {
                if(next.getNumero()== numeroQuarto){
                    return next;
                }
            }
            throw new Exception();
        } catch (Exception e) {
        throw new Exception();
        }
    }
    
    public void fecharQuarto(int numeroQuarto){
        try {
            for (AlugarQuarto next : clienteQuarto) {
                if(next.getQuarto().getNumero()==numeroQuarto && next.getQuarto().getStatus()==1){
                    next.getQuarto().setStatus(0);
                }
        }
        } catch (Exception e) {
        }
    }
    
    public void salvarArquivo(ArrayList<Object> objeto, String nomedoarquivo) throws Exception{
        try {
            
        } catch (Exception e) {
        throw new Exception();
        }
    }
    
    public ArrayList<Object> recuperarArquivo(String nomedoarquivo) throws Exception{
        try {
            
        } catch (Exception e) {
        throw new Exception();
        }
        return null;
    }
    
}
