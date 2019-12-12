/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author Luan Paulo
 */
public class EmpregadoHora extends EmpregadoAbstrato{
    
    private double horasTrabalhadas;
    private double valorHora;

    
    public EmpregadoHora(String Nome, String cpf, double horastrabalhadas, double valorHora){
      super(Nome, cpf);
      this.horasTrabalhadas = horastrabalhadas;
      this.valorHora = valorHora;
    }
            
            
            
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(String Nome, String cpf, double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    
    public double getPagamento(double HorasTrabalhadas, double ValorHora){
        return HorasTrabalhadas*ValorHora;
}
    
    
}
