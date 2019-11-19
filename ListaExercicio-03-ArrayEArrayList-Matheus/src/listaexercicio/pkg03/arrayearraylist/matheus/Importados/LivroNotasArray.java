/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayearraylist.matheus.Importados;

/**
 *
 * @author Luan Paulo
 */
public class LivroNotasArray {
 
	
	private int numNotas;
	private double somaNotas;
	
	public LivroNotas() {
		this.numNotas = 0;
		this.somaNotas = 0;
	}
	
	public void adicionaNota(double nota){
		numNotas++;
		somaNotas += nota;
	}
	
	public double calculaMedia() {
		double media = 0;
		if(numNotas > 0) {
			media = somaNotas/this.numNotas;
		}
		return media;
	}
 	
	public int getNumNotas() {
		return numNotas;
	}

	public double getSomaNotas() {
		return somaNotas;
	}
		   
}
