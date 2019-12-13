/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va.QUESTAO3;

/**
 *
 * @author Luan Paulo
 */
public class Questao3 {
    public static void main3() {
        Fachada fachada = new Fachada();
        fachada.CadastrarCliente("Luan", 123, "123.123.123-00");
        fachada.CadastrarCliente("jose", 1234, "123.123.123-01");
        fachada.CadastrarCliente("maria", 12, "123.123.123-02");
        fachada.CadastrarCliente("josefina", 121233, "123.123.123-03");
 
        fachada.CadastrarQuarto("Quarto1");
        fachada.CadastrarQuarto("Quarto2");
        fachada.CadastrarQuarto("Quarto3");
        fachada.CadastrarQuarto("Quarto4");
 
        fachada.ExibirQuartos();
        
        fachada.AlugarQuarto("Luan", 0);
        fachada.AlugarQuarto("jose", 6);
        fachada.AlugarQuarto("Maria",1);
        fachada.fecharQuarto("Quarto1");
        
    }
   
}
