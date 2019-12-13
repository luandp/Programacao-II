/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO2;

/**
 *
 * @author Luan Paulo
 */
public class Questao2 {
    public static void main2() {
        Pessoa p = new Pessoa("Maria", "01/01/1990", "000.000.111-22");
        Departamento d = new Departamento("TI", "Manutenção e Desenvolvimento de Sistemas e redes");
        Empregado e = new Empregado("Luan", "11/03/1993", "095.709.194-00", 1000, 0.05, d);
        
        System.out.println(e.CalcularSalario());
    }
   
}
