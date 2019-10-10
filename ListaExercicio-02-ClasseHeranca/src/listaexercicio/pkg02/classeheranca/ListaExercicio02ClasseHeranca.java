/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg02.classeheranca;

import java.util.ArrayList;

/**
 *
 * @author Luan Paulo
 */
public class ListaExercicio02ClasseHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<ContaEspecial> ce = new ArrayList<ContaEspecial>();
        
        ContaEspecial ce01 = new ContaEspecial(01,200,1000);
        ContaEspecial ce02 = new ContaEspecial(02,400,400);
        ContaEspecial ce03 = new ContaEspecial(03,800,100);
        
        ce.add(ce01);
        ce.add(ce02);
        ce.add(ce03);

        ce.get(0).debitar(1000);
        ce.get(1).debitar(1000);
        ce.get(2).debitar(1000);
        
        for(int i=0;i<ce.size();i++){
            System.out.println("contaEspecial:"+ i+":"+ce.get(i).getNumero()+"\n"
            +"Saldo: "+ce.get(i).getSaldo()+"\n");
            
        }
        
        /*Imprimir*/
        Poupanca p1 = new Poupanca(01,200,0.01);
        Poupanca p2 = new Poupanca(02,400,0.02);
        Poupanca p3 = new Poupanca(03,800,0.03);
        ArrayList<Poupanca> p = new ArrayList<Poupanca>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        
        for(int i=0;i<p.size();i++){
        p.get(i).RenderJuros(0.01);
        p.get(i).RenderJuros(0.01);
        }
        
        
        for(int i=0;i<p.size();i++){
            System.out.println("contaPoupanca"+ i+":"+ce.get(i).getNumero()+"\n"
            +"Saldo: "+ce.get(i).getSaldo()+"\n");
         }

    }
    
}
