/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A20_FACADE;

import A42_CLASS.AlugarQuarto;
import A42_CLASS.Cliente;
import A42_CLASS.Quarto;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luan Paulo
 */
public class Fachada {
    ArrayList<Cliente> Clientes = new ArrayList<>();
    int indiceCliente=0;
    ArrayList<Quarto> Quartos = new ArrayList<>();
    int indiceQuarto=0;
    ArrayList<AlugarQuarto> ClienteQuarto =  new ArrayList<>();
    int indiceClienteQuarto=0;
    
    public void CadastrarCliente(String nome,int tel,String cpf){
        Cliente c = new Cliente(nome, tel, cpf);
        Clientes.add(c);
        this.indiceCliente++;
    }
    
    public void CadastrarQuarto(String nome){
        Quarto q = new Quarto(nome, 0);
        Quartos.add(q);
        this.indiceQuarto++;
    }
    
    public void AlugarQuarto(String nomeCliente, int indiceQuarto){
        try {
            Quarto q = Quartos.get(indiceQuarto);
            //if(nomeCliente!=null && nomeCliente.trim() != "" && q !=null && q.getStatus() !=0){
            q.setStatus(1);
            System.out.println("Quarto Alugado!");
            /*}else{
                throw new Exception();
            }*/
        } catch (Exception e) {
            System.out.println("Cliente não existe ou Quarto não está Disponivel"+e);
        }   
    }
    
    public void fecharQuarto(String nomeQuarto){
        try {
            for (Iterator<Quarto> iterator = Quartos.iterator(); iterator.hasNext();) {
                Quarto quarto = iterator.next();
                if(quarto.getNome().equals(nomeQuarto) && quarto.getStatus()==1){
                    quarto.setStatus(0);
                }
            }
            System.out.println("Quarto "+nomeQuarto+" Agora está fechado!");
        }               
        catch (Exception e) {
            System.out.println("Quarto "+nomeQuarto+" está desocupado ou não existe!");
        }
        
        
}

    public void ExibirQuartos(){
        System.out.println("\nExibirQuartos:");
        for (Iterator<Quarto> iterator = Quartos.iterator(); iterator.hasNext();) {
            Quarto quarto = iterator.next();
            System.out.println("\n  Nome:"+quarto.getNome()+"\n  Status:"+quarto.getStatus());
        }
        System.out.println("\nFim da Exibição dos Quartos");
        
    }
    
}
