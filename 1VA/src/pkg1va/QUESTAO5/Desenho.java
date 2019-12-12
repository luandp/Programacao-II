/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO5;

/**
 *
 * @author Luan Paulo
 */
public class Desenho {
        int linha;
        int coluna;
        int espaco;
        
       public void imprimirDesenho(){
           for (linha = 6;linha >= 1;linha--){
               for(espaco = 6;espaco > linha; espaco--){
               System.out.print(" ");
               }
           
           for(coluna = 1;coluna <=linha;coluna++){
               System.out.print("*");
           }
                System.out.println();
           } //fim do 1° loop
        }//fecha metodo
}
