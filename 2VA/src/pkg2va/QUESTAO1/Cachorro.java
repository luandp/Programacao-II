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
public class Cachorro extends Animal implements Vegetariano,Carnivoro{
    String string10;
    String string20;
    int inteiro10;

    public Cachorro() {
        super("", "", 0);
        this.string10 = "";
        this.string20 = "";
        this.inteiro10 = 0;
    }

    public Cachorro(String string10, String string20, int inteiro10, String string1, String string2, int int1) {
        super(string1, string2, int1);
        this.string10 = string10;
        this.string20 = string20;
        this.inteiro10 = inteiro10;
    }

    
    public String getString10() {
        return string10;
    }

    public void setString10(String string10) {
        this.string10 = string10;
    }

    public String getString20() {
        return string20;
    }

    public void setString20(String string20) {
        this.string20 = string20;
    }

    public int getInteiro10() {
        return inteiro10;
    }

    public void setInteiro10(int inteiro10) {
        this.inteiro10 = inteiro10;
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

    @Override
    public void cacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comercarne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cagarcarne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
