/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2va.QUESTAO3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author Luan Paulo
 */
public class Departamento {
        Integer id;
        String descricao;
        Collection<Empregado> empregados;

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Collection<Empregado> getEmpregados() {
        return empregados;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEmpregados(Collection<Empregado> empregados) {
        this.empregados = empregados;
    }
    public Collection<Empregado> filtrarEmpregadosPorSalario2 (double valor){
        Collection<Empregado> result = new ArrayList<>();
       
        for (Iterator<Empregado> iterator = result.iterator(); iterator.hasNext();) {
            Empregado novo = iterator.next();
            if(novo.salario >valor)
            {
                result.add(novo);
            }
        }
        
        return result;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Collection<Empregado> filtrarEmpregadosPorSalario(double valor){
        Collection<Empregado> melhorSalario= new ArrayList<>();
        for (Iterator<Empregado> iterator = empregados.iterator(); iterator.hasNext();) {
            Empregado next = iterator.next();
            if(next.getSalario()>valor){
              melhorSalario.add(next);
            }
        }
        return melhorSalario;
    }
        
        
}
