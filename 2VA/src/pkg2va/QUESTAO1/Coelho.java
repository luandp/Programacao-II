/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2va.QUESTAO1;

/**
 *
 * @author Luan Paulo
 */
public class Coelho extends Animal implements Vegetariano{
    String string100;
    String string200;
    int inteiro200;

    public Coelho() {
        super("", "", 0);
        this.string100 = "";
        this.string200 = "";
        this.inteiro200 = 0;
    }

    public Coelho(String string100, String string200, int inteiro200, String string1, String string2, int int1) {
        super(string1, string2, int1);
        this.string100 = string100;
        this.string200 = string200;
        this.inteiro200 = inteiro200;
    }

                   
    
    public String getString100() {
        return string100;
    }

    public void setString100(String string100) {
        this.string100 = string100;
    }

    public String getString200() {
        return string200;
    }

    public void setString200(String string200) {
        this.string200 = string200;
    }

    public int getInteiro200() {
        return inteiro200;
    }

    public void setInteiro200(int inteiro200) {
        this.inteiro200 = inteiro200;
    }

    @Override
    public void colher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comermato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cagarmato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
