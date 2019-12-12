/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO7;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa(String Nome, int Idade, String CPF){
        setNome(Nome);
        setIdade(Idade);
        setCpf(CPF);
    }
    public void setNome(String nome) {
        if(nome == null){
            System.out.println("Nome não pode ser Vazio/Nulo, valor não inserido, digite novamente.");
        }else{
        this.nome = nome;     
        }
    }

    public void setIdade(int idade) {
        if(idade<=16){
            System.out.println("cadastro permitido para maiores de 16 anos, valor não inserido, digite novamente");
        }else{
        this.idade = idade;     
        }
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        
        if(cpf.trim().length()!=11){
            System.out.println("CPF só pode ter 11 Digitos, digite novamente");
        }else if(cpf.trim()=="00000000000"){
            System.out.println("CPF não pode ser Sequecia de 0, Digite novamente");
        }
        else{
        this.cpf = cpf;
        }
        }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    
}
