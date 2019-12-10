/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio.pkg03.arrayearraylist.entrega.Importados;

/**
 *
 * @author Luan Paulo
 */
public class TesteLivroNotas {
    public static void main(String[] args) {
        LivroNotas lv = new LivroNotas();
        lv.adicionaNota(10);
        lv.adicionaNota(7);
        lv.adicionaNota(2);
        lv.adicionaNota(8);
        lv.adicionaNota(7);
        
        lv.getNumNotas();
        
        lv.calculaMedia();
        
    }
}
