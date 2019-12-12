/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1va.QUESTAO4;

import pkg1va.QUESTAO2.inimigo;

/**
 *
 * @author Luan Paulo
 */
public class Questao4 {
    public static void main4() {
        System.out.println("_________Questao04");
        inimigo a = new inimigo("Monstro", 115.90f, 80);
        inimigo b = new inimigo("Dinossauro", 180.45f, 55);
        inimigo c = new inimigo("Chupacabra", 55.87f, 210);
    
        a.atualiza(b);
        b.setPercentualVida(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a = c;
        b.setVelocidade(-12);
        a.atualiza(b);
        b.atualiza(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
