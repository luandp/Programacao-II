/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayearraylist.entrega.Importados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luan Paulo
 */
public class LivroNotasArrayList {
 
	
	private ArrayList<Double> notas;
	
	public LivroNotasArrayList() {
		this.notas = new ArrayList<>();
	}
	
	public void adicionaNota(double nota){
                    notas.add(nota);
        }
	
	public double calculaMedia() {

            double soma=0;

            for (Iterator<Double> iterator = notas.iterator(); iterator.hasNext();) {
            Double next = iterator.next();
            soma += next;
            }
           return soma/notas.size();
	}
 	
	public int getNumNotas() {
		return notas.size();
	}

	public double getSomaNotas() {
            double soma =0;
            for(int i=0;i<notas.size();i++){
                soma += i;
            }
            return soma;
	}

}
