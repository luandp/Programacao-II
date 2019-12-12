/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2va.QUESTAO2;

/**
 *
 * @author Luan Paulo
 */
public class ExcessaoA {
    public static void lancaExcessao() throws Exception{
        try {
            System.out.println("superClasse ExcessaoA");
            ExcessaoB.lancaExcessaoB();
        } catch (RuntimeException exception) {
            System.out.println("erro inexperado. nullpoint");
        }catch (Exception exception){
            System.out.println("Captura excessao B e C");
        }
    }
}
