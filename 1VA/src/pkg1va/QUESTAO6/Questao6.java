/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO6;

/**
 *
 * @author Luan Paulo
 */
public class Questao6 {
    public static void main6() {
         System.out.println("_________Questao06");
       try {
        Cachorro cachorro1, cachorro2;
            System.out.println("1 Linha OK");
        Animal anim;
            System.out.println("2 Linha OK");

        cachorro1 = new Cachorro();
            System.out.println("3 Linha OK");
        anim = cachorro1;
            System.out.println("4 Linha OK");
        cachorro2 = (Cachorro) anim;
            System.out.println("5 Linha OK");
            
        } catch (Exception e) {
            System.out.println("Erro:"+e);
        }
    }
}
