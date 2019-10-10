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
     
        
        ContaEspecial ce01 = new ContaEspecial(1000);
        ContaEspecial ce02 = new ContaEspecial(400);
        ContaEspecial ce03 = new ContaEspecial(100);
        ArrayList<ContaEspecial> ce = new ArrayList<ContaEspecial>();
        
        ce.add(ce01);
        ce.add(ce02);
        ce.add(ce03);

        ce.get(0).debitar(1000);
        ce.get(1).debitar(1000);
        ce.get(2).debitar(1000);
        
        /*Imprimir*/
        Poupanca p1 = new Poupanca(0.01);
        Poupanca p2 = new Poupanca(0.02);
        Poupanca p3 = new Poupanca(0.03);
        ArrayList<Poupanca> p = new ArrayList<Poupanca>();
        
        for(int i=0;i<p.size();i++){
        p.get(i).RenderJuros();
        p.get(i).RenderJuros();
        }
        
    }
    
}
