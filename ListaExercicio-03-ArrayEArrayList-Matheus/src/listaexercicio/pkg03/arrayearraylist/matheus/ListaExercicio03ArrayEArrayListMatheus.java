/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayearraylist.matheus;

import listaexercicio.pkg03.arrayearraylist.matheus.Importados.AppAnuncio;

/**
 *
 * @author Luan Paulo
 */
public class ListaExercicio03ArrayEArrayListMatheus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /*
        Questão 1 (Passando argumentos para uma aplicação)
        1.  Crie um projeto (Netbeans ou Eclipse) e importe os códigos de exemplos.
        2.  Rode o código da classe array.AppAnuncio passando duas strings para a aplicação.
        3.  Modifique o código da aplicação para receber uma terceira string que representa o
            destinatário da mensagem. Esta string deve ser impressa no console depois da linha
            que começa com "Mensagem : ".
        4.  Modifique esta aplicação para verificar o tamanho do array de argumentos. Caso o array
            tenha tamanho menor que três mostre para o usuário uma mensagem de erro.
        */
        
        /*
        1.1 Feito
        1.2 pode Ser feito das seguintes formas:
            Opção 01: Configurando os Paramentros do Projeto e enviando atraves do
            Args do Main
            Opção 02: Criando um Array de String e passando por parametro.

           */
        System.out.println("1.2_______________________");
        //Opção 01
        /*
        Para usar o args do Main vá até o menu 
        Executar > Definir configuração de Projeto > Personalizar...
        Preencha onde tem Argumentos:
        cada argumento é separado por espaço, se quiser por uma String Inteira
        use aspas Duplas e espaço
        */
        AppAnuncio.main(args);
        //Opção 02
        String Argumentos[] = new String[2];//
        Argumentos[0] = "Titulo - Opcao 02";
        Argumentos[1] = "Corpo do Texto - Opcao 02";
        AppAnuncio.main(Argumentos);
        /*
        1.3 você pode Adicionar um novo argumento lá no menu Personalizar
            ou modificar os argumentos para satisfazer a organização
            e modificar a Função existente na Classe AppAnuncio
            Criarei outra função Main2 e o Array Argumentos2
            só para manter o historico  do codigo.
        
        */
        System.out.println("1.3_______________________");
        //Opcao 01
        AppAnuncio.main2(args);
        //Opcao 02
        String Argumentos2[] = new String[3];//
        Argumentos2[0] = "Titulo - Opcao 02";
        Argumentos2[1] = "Corpo do Texto - Opcao 02";
        Argumentos2[2] = "Nincho - Opcao 02";
        AppAnuncio.main2(Argumentos2);
        
        /*
        1.4 Você pode modificar a função main adicionando TryCatch para
            avaliar a posicao válida do Array
            Criarei outra funcao main3 só para manter o Historico do Código
        */
         System.out.println("1.4_______________________");
         AppAnuncio.main3(Argumentos);//Dará Erro.
         AppAnuncio.main3(Argumentos2);//Será Impresso Normalmente.
        
        
        
        
    }
    
}
