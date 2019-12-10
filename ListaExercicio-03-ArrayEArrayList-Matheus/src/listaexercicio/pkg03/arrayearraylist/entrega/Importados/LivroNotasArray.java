/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayearraylist.entrega.Importados;

/**
 *
 * @author Luan Paulo
 */
public class LivroNotasArray {
 
	
	private int numNotas;
	private double[] notas;
	
	public LivroNotasArray() {
		this.numNotas = 0;
		this.notas = new double[10];
	}
	
	public void adicionaNota(double nota){
                if (numNotas<10) {
                numNotas++;
		notas[numNotas] =  nota;                
                }else{
                    System.out.println("Nota não adicionada!\nSem espaço no Array");
                }
            
             
                
	}
	
	public double calculaMedia() {
		
		return (getNumNotas()/numNotas);
	}
 	
	public int getNumNotas() {
		return numNotas;
	}

	public double getSomaNotas() {
            double soma =0;
            for(int i=0;i<numNotas;i++){
                soma = soma+i;
            }
            return soma;
	}

}
