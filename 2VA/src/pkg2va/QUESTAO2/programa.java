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
public class programa {
            public static void main2(){
        try {
            ExcessaoA.lancaExcessao();
        } catch (Exception exception){
            System.out.println("Metodo main captura excessao de A");
        }
    }
}
