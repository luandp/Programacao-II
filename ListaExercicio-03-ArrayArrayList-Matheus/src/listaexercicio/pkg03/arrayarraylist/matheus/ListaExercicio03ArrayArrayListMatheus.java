/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayarraylist.matheus;

import Importados.AppAnuncio;

/**
 *
 * @author Luan Paulo
 */
public class ListaExercicio03ArrayArrayListMatheus {

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
            Opção 01: Criando um Array de String e passando por parametro,
            Opção 02: Configurando os Paramentros do Projeto e enviando atraves do
            Args do Main
        */
        //Opção 01
        String Argumentos[] = new String[2];
        Argumentos[0] = "Titulo - Opcao 01";
        Argumentos[1] = "Corpo do Texto - Opcao 01";
        AppAnuncio.executar(Argumentos);
        //Opção 02
        /*
        Para usar o args do Main vá até o menu 
        Executar > Definir configuração de Projeto > Personalizar...
        Preencha onde tem Argumentos:
        cada argumento é separado por espaço, se quiser por uma String Inteira
        use aspas Duplas e espaço
        */
        AppAnuncio.executar(args);
        
        
        
        
    }
    
}
 