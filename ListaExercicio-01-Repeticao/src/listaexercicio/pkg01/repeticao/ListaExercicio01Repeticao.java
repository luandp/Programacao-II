/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg01.repeticao;

import java.util.Scanner;

/**
 *
 * @author Luan Paulo
 */
public class ListaExercicio01Repeticao {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        Exercicios e = new Exercicios();
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("\n________________________________\n\n    Lista de Exercicio 01\nRepeticao\nProf. Gustavo Callou\nDigite qual Exercicio quer Executar, de 1 a 9\nou 0 para Sair");
            opcao = s.nextInt();
            
            switch(opcao){
                case 1: e.exercicio01();
                    break;
                case 2:e.Exercicio02();
                    break;
                case 3:e.Exercicio03();
                    break;
                case 4:e.Exercicio04();
                    break;
                case 5:e.Exercicio05();
                    break;
                case 6:e.Exercicio06();
                    break;
                case 7:e.Exercicio07();
                    break;
                case 8:e.Exercicio08();
                    break;
                case 9:e.Exercicio09();
                    break;
                case 0:
                    
                    
            }
        }while(opcao!=0);
        
        
    }
      
}
