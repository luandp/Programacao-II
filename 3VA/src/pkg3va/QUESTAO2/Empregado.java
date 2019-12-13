/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO2;

import java.util.Date;

/**
 *
 * @author Luan Paulo
 */
public class Empregado extends Pessoa{
    private double SalarioBase;
    private double IRPF;
    private Departamento dept;

    public Empregado(String nome, String DataNascimento, String cpf, double SalarioBase, double IRPF, Departamento dept) {
        super(nome, DataNascimento, cpf);
        this.SalarioBase = SalarioBase;
        this.IRPF = IRPF;
        this.dept = dept;
    }
    
    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    public Departamento getDept() {
        return dept;
    }

    public void setDept(Departamento dept) {
        this.dept = dept;
    }
    
    public String CalcularSalario(){
        double desc = this.SalarioBase * this.IRPF;
        double liquido = this.SalarioBase - desc;
        return "Calculo:\n  Salario Bruto:"+this.SalarioBase+"\n    Desconto:"+desc+"\n   Salario Liquido:"+liquido;
    }
    
    
    
}
