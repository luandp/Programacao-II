/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2va.QUESTAO1;

import pkg2va.QUESTAO2.programa;

/**
 *
 * @author Luan Paulo
 */
public class QUESTAO1 {
        public static void main1(){
        Coelho c = new Coelho();
        Cachorro d1 = (Cachorro) new Animal(); // Linha Erro - Cachorro d1 = new Animal();
        Cachorro d2 = new Cachorro();
        Animal a = c;
        Vegetariano v = c;
        Carnivoro carne = d2;
        Vegetariano v2 = d2;
        Object o = d2;
        Animal a2 = new Cachorro();
        a2 = c;
        v2 = (Vegetariano) a2; // Linha Erro -  v2 = a2;
   
        }
     
}
