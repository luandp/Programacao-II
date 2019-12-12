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
public class ExcessaoC {
        public static void lancaExcessaoC() throws Exception{
        try {
            System.out.println("Metdod LancaExcessaoC");
            throw new Exception();
        } catch (Exception exception){
            System.out.println("Capturando excessao em C");
            Object a = null;
            a.toString();
        }
    }
}
