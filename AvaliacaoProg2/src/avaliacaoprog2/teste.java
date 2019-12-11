/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoprog2;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class teste {
 
    public static void main(String[] args) {
        
       
      Pessoa pessoaA = new Pessoa("Maria", 18, "12345678900");
      Pessoa pessoaB = new Pessoa("Jose", 21, "12345678901");
      Pessoa pessoaC = new Pessoa("Josefina", 31, "12345678902");
      
        Sessao sessao1 = new Sessao("ToyStory", 5, 22);
        Sessao sessao2 = new Sessao("It: a coisa", 1, 0);
        
      Ingresso ingresso1 = new Ingresso(pessoaA, sessao1, "19B");
      Ingresso ingresso2 = new Ingresso(pessoaB, sessao1, "20B");
      Ingresso ingresso3 = new Ingresso(pessoaC, sessao2, "1A");
  
        System.out.println("Idade:"+ingresso1.pessoa.getIdade());
        System.out.println("Filme:"+ingresso2.sessao.getNome_do_filme()+"\nNumero da Sala:"+ingresso2.sessao.getNumero_da_sala());
    }
}
