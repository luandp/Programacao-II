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
public class Animal {
    String string1;
    String string2;
    int int1;

    public Animal() {
        this.string1 = "";
        this.string2 = "";
        this.int1 = 0;
    }
    public Animal(String string1, String string2, int int1) {
        this.string1 = string1;
        this.string2 = string2;
        this.int1 = int1;
    }

    
    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    
    
    
}
