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
public class Exercicios {
    
    
    public void exercicio01(){
    /*
        1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        mensagem caso o valor seja inválido e continue pedindo nota até que
        seja informado um valor válido. 
        */
        System.out.println("1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma\n" +
"        mensagem caso o valor seja inválido e continue pedindo nota até que\n" +
"        seja informado um valor válido. ");
        int nota=-1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma nota:");
        nota = s.nextInt();
        while(!(nota>0 && nota <10))
        {
        System.out.println("Você digitou uma nota invalida: "+nota);
        System.out.println("Digite outra nota:");            
        nota = s.nextInt();
        }
        System.out.println("Você digitou uma nota valida: "+nota);
    }
    public void Exercicio02(){
        /*
	    2. Supondo que a população de um país A seja de 55.000 habitantes e tem
	    uma taxa de crescimento mensal de 0,3%. A população de um país B
	    tem 160.000 habitantes e tem uma taxa de crescimento mensal de
	    0,18%. Faça um programa que calcule e escreva o número de meses
	    necessários para que a população do país A ultrapasse ou iguale a
	    população do país B, mantidas as taxas de crescimento.
    	    */
        System.out.println("2. Supondo que a população de um país A seja de 55.000 habitantes e tem\n" +
"	    uma taxa de crescimento mensal de 0,3%. A população de um país B\n" +
"	    tem 160.000 habitantes e tem uma taxa de crescimento mensal de\n" +
"	    0,18%. Faça um programa que calcule e escreva o número de meses\n" +
"	    necessários para que a população do país A ultrapasse ou iguale a\n" +
"	    população do país B, mantidas as taxas de crescimento.");
        
        double A = 55.000;
        double B = 160.000;
        int meses = 1;
        
        while(!(B<A))
        {
        A = A+(A*0.3);
        B = B+(B*0.18);
        meses++;
            System.out.println("mes:"+meses+"\n   A:"+A+"\n   B:"+B );
        }
            System.out.println("mes Final:"+meses+"\n   A:"+A+"\n   B:"+B );
    }
    public void Exercicio03(){
       /*
     3. Faça um programa que imprima na tela os números de 1 a 20, um
    abaixo do outro. Depois modifique o programa para que ele mostre os
    números um ao lado do outro.    
     */
        System.out.println("3. Faça um programa que imprima na tela os números de 1 a 20, um\n" +
"    abaixo do outro. Depois modifique o programa para que ele mostre os\n" +
"    números um ao lado do outro.");
        
        for(int i=0;i<20;i++){
            System.out.println(i);
        }

        for(int i=0;i<20;i++){
            System.out.print(i+", ");
        }
    }
    public void Exercicio04(){
     /*
      4. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
    */
        System.out.println("4. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de\n" +
"qualquer número inteiro entre 1 a 10. O usuário deve informar de qual\n" +
"numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo\n" +
"abaixo:\n" +
"o Tabuada de 5:\n" +
"o 5 X 1 = 5\n" +
"o 5 X 2 = 10\n" +
"o ...\n" +
"o 5 X 10 = 50");
    Scanner s = new Scanner(System.in);
    int n;
        do{
        System.out.println("Digite qual numero vc quer ver a tabuada");
        n = s.nextInt();
        }while(!(n>0 && n<11));
        for(int i=1;i<=10;i++){
        System.out.println(n+" X "+i+" = "+n*i);
    }
    }
    public void Exercicio05(){
       /*
    5. Desenvolver um programa que efetue a soma de todos os números
    ímpares que são múltiplos de três e que se encontram no conjunto dos
    números de 1 até 500.    
    */
        System.out.println("5. Desenvolver um programa que efetue a soma de todos os números\n" +
"    ímpares que são múltiplos de três e que se encontram no conjunto dos\n" +
"    números de 1 até 500.");
        int n = 0;
        int i = 1;
        while(n<=500){
            if(i%3==0){
            System.out.println(n+", "+i+", "+(n+i));     
             n = n+i;
            }
         i++;
        }
    }
    public void Exercicio06(){
    /*
    6. Desenvolver um programa que leia a altura de 15 pessoas. Este
    programa deverá calcular e mostrar :
    a. A menor altura do grupo;
    b. A maior altura do grupo;     
    */
        System.out.println("6. Desenvolver um programa que leia a altura de 15 pessoas. Este\n" +
"    programa deverá calcular e mostrar :\n" +
"    a. A menor altura do grupo;\n" +
"    b. A maior altura do grupo;");
        Scanner scan = new Scanner(System.in);
        double MaxAltura = 0;
        double MinAltura = Double.MAX_VALUE;
        double aux;
        for(int i=0;i<15;i++){
            System.out.println("Digite a Altura da "+(i+1)+"ª Pessoa:");
            aux = scan.nextDouble();
            if(aux>MaxAltura){
                MaxAltura = aux;
            }
            if(aux<MinAltura){
                MinAltura = aux;
            }
        }
        System.out.printf("Menor altura é: %.2f\nMaior Altura: %.2f",MinAltura,MaxAltura);
    }
    public void Exercicio07(){
     /*
            7. Desenvolver um algoritmo que leia um número não determinado de
            valores e calcule e escreva a média aritmética dos valores lidos, a
            quantidade de valores positivos, a quantidade de valores negativos
            e o percentual de valores negativos e positivos        
        */
        System.out.println("7. Desenvolver um algoritmo que leia um número não determinado de\n" +
"            valores e calcule e escreva a média aritmética dos valores lidos, a\n" +
"            quantidade de valores positivos, a quantidade de valores negativos\n" +
"            e o percentual de valores negativos e positivos");
        
        double aux =0,n=0;
        int contador=0, positivos=0, negativos=0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Digite um Numero ou 0[Zero para sair]:");
            aux = scan.nextDouble();
            if(aux==0){
            break;
            }else if(aux>0){
                positivos++;
            }else{
                negativos++;
            }
            n = n+aux;
            contador++;
            
        }while(aux!=0);
        System.out.println("media dos valores lidos:"+(n/contador)+"Qtd Positivos e negativos:"
                +positivos+"="+((positivos*100)/contador)+"%"+
                ", "+negativos+"="+((negativos*100)/contador)+"%");
    }
    public void Exercicio08(){
      /*
            8. Escrever um algoritmo que leia uma quantidade desconhecida de
números e conte quantos deles estão nos seguintes intervalos: [0-25],
[26-50], [51-75] e [76-100]. A entrada de dados deve terminar
quando for lido um número negativo.      
        */
        System.out.println("8. Escrever um algoritmo que leia uma quantidade desconhecida de\n" +
"números e conte quantos deles estão nos seguintes intervalos: [0-25],\n" +
"[26-50], [51-75] e [76-100]. A entrada de dados deve terminar\n" +
"quando for lido um número negativo.");
        int aux, inter0_25=0,inter26_50=0,inter51_75=0,inter76_100=0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Digite qualquer não-negativo ou negativo para sair (n<0)");
            aux = scan.nextInt();
            if(aux>0 && aux <26){
            inter0_25++;
            }else if(aux>25 && aux<51){
            inter26_50++;
            }else if(aux>50 && aux <76){
            inter51_75++;
            }else if(aux>75 && aux<101){
            inter76_100++;
            }else{}
        }while(aux>-1);
        System.out.printf("Quantidade Inter:\n0-25:%d\n26-50:%d\n51-75:%d\n76-100:%d",inter0_25,inter26_50,inter51_75,inter76_100);
    }
    public void Exercicio09(){
     /*
          9.Faça um algoritmo estruturado que leia uma quantidade não
            determinada de números positivos. Calcule a quantidade de números
            pares e ímpares, a média de valores pares e a média geral dos números
            lidos. O número que encerrará a leitura será zero.         */
     
        System.out.println("9.Faça um algoritmo estruturado que leia uma quantidade não\n" +
"            determinada de números positivos. Calcule a quantidade de números\n" +
"            pares e ímpares, a média de valores pares e a média geral dos números\n" +
"            lidos. O número que encerrará a leitura será zero.");
        int aux,cont_par=0,cont_impar=0,par=0,impar=0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Digite qualquer não-negativo ou negativo para sair (n<0)");
            aux = scan.nextInt();
            if(aux<1){}
            else if(aux%2==0){
            cont_par++;
            par = par+aux;
            }else{
            cont_impar++;
            impar = impar+aux;
            }
            
        }while(aux!=0);
        System.out.println("Quantidade:\nPares:"+cont_par+
                "\nImpares:"+cont_impar+
                "\nMédia:\nPares:"+(par/cont_par)+
                "\nMédia Geral:"+((par+impar)/(cont_par+cont_impar)));
    }  
}
