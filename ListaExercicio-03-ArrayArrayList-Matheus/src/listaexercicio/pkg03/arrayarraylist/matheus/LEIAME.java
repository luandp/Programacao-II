/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayarraylist.matheus;

/**
 *
 * @author Luan Paulo
 */
public class LEIAME {
    /*
    Lista de Exercício 03
    
Questão 1 (Passando argumentos para uma aplicação)
    1.  Crie um projeto (Netbeans ou Eclipse) e importe os códigos de exemplos.
    2.  Rode o código da classe array.AppAnuncio passando duas strings para a aplicação.
    3.  Modifique o código da aplicação para receber uma terceira string que representa o
        destinatário da mensagem. Esta string deve ser impressa no console depois da linha
        que começa com "Mensagem : ".
    4.  Modifique esta aplicação para verificar o tamanho do array de argumentos. Caso o array
        tenha tamanho menor que três mostre para o usuário uma mensagem de erro.
Questão 2 (Utilizando array para guardar as notas)
    1.  Veja o código da classe array.LivroNotas
    2.  Crie uma classe chamada TesteLivroNotas no mesmo pacote com um método main.
    3.  Dentro o main:
        a. crie um objeto LivroNotas
        b. chame no objeto métodos para adicionar notas, calcular a quantidade de notas e
           a média.
    4.  Crie uma outra classe chamada LivroNotasArray que é bem parecida com LivroNotas.
        As diferenças são:
        a. no lugar do atributo somaNotas está o atributo double[] notas (array com as
        notas)
        b. no construtor de LivroNotasArray inicialize o array com tamanho 10
        c. Crie um método chamado adicionarNota com a mesma assinatura utilizada na
           classe LivroNotas. O corpo deste método deve adicionar o valor do argumento
           na próxima posição livre do array de notas. Se o array estiver cheio não adiciona
           nota no array e imprime no console uma mensagem de erro.
        d. Crie um método double getNumNotas() que retorna a quantidade de notas
           inseridas.
        e. Crie um método double getSomaNotas() que percorre o array de notas e retorna
           a soma todas as notas adicionadas até então. Evite adicionar na soma as
           posições do array que não contém notas inseridas.
        f. Crie um método double calcularMedia() que retorna a soma das notas dividido
        pela quantidade de notas.
    5. Aproveite o main da classe TesteLivroNotas para criar um objeto LivroNotasArray e
           chamar os métodos deste objeto.
Questão 3 (Mudando de array para lista)
    1.  Modifique a classe LivroNotasArray para utilizar um ArrayList<Double> no lugar do
        array. Faça as simplificações que achar necessario.
    2.  Teste as modificações.
    3.  Qual a diferença que um usuário da classe pode notar ao chamar o método adicionar
        notas com relação a versão que utiliza array? 
    */
}
