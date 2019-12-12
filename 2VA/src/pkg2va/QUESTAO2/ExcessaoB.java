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
public class ExcessaoB {
        public static void lancaExcessaoB() throws Exception{
        try {
            System.out.println("Metodo lancaExcessaoB");
            ExcessaoC.lancaExcessaoC();
        } catch (Exception exception){
            System.out.println("Capturando excessao em B");
        }
    }
}
