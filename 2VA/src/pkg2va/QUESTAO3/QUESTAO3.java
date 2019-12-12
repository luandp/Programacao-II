/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2va.QUESTAO3;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Luan Paulo
 */
public class QUESTAO3 {
    public static void main() {
        Departamento depto = new Departamento();
        depto.setId(1);
        depto.setDescricao("TI");
        
        Collection<Empregado> empregados;
     
        
        Empregado emp1 = new Empregado();
        emp1.setCpf(123456789);
        emp1.setNome("João Jose");
        emp1.setSalario(1200.90);
 
        
       
        Empregado emp2 = new Empregado();
        emp2.setCpf(123456123);
        emp2.setNome("Jose maria");
        emp2.setSalario(1299.90);

        Empregado emp3 = new Empregado();
        emp3.setCpf(123456456);
        emp3.setNome("maria Maria");
        emp3.setSalario(1359.90);
        
        empregados = new ArrayList<>();
        empregados.add(emp1);
        empregados.add(emp2);
        empregados.add(emp3);
        
        depto.empregados = empregados;
        
    }
}
