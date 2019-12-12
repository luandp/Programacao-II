package abstratas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan Paulo
 */
public class EmpregadoAbstrato {

        private String Nome;
        private String cpf;
        
        
        
        /**
     * @return the Nome
     */
        
    
        public EmpregadoAbstrato(String nome, String cpf){
        
        this.Nome = nome;
        this.cpf = cpf;
        }
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
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
        this.cpf = cpf;
    }
    
     @Override
	public String toString() {
            return "Nome:"+ this.Nome + "CPF:"+ this.cpf;
	}
        public double getPagamento() {
		return 0;
	}
        

    /**
     * @return the tipo
     */
    

        
        
    
}
