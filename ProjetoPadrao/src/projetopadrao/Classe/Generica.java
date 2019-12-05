/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrao.Classe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luan Paulo
 */
public class Generica {
    int id;
    String variavelTexto;
    double variavelvalor;
    boolean variavelboleana;
    List<Integer> inteiros;
    
    public Generica(){
        this.id = 0;
        this.variavelTexto = "";
        this.variavelvalor = 0;
        this.variavelboleana = false;
        this.inteiros = new ArrayList<>();
    }
    
    public Generica(int id, String variavelTexto, double variavelvalor, boolean variavelboleana, ArrayList<Integer>inteiros) {
        this.id = id;
        this.variavelTexto = variavelTexto;
        this.variavelvalor = variavelvalor;
        this.variavelboleana = variavelboleana;
        this.inteiros = inteiros;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariavelTexto() {
        return variavelTexto;
    }

    public void setVariavelTexto(String variavelTexto) {
        this.variavelTexto = variavelTexto;
    }

    public double getVariavelvalor() {
        return variavelvalor;
    }

    public void setVariavelvalor(double variavelvalor) {
        this.variavelvalor = variavelvalor;
    }

    public boolean isVariavelboleana() {
        return variavelboleana;
    }

    public void setVariavelboleana(boolean variavelboleana) {
        this.variavelboleana = variavelboleana;
    }

    public List<Integer> getInteiros() {
        return inteiros;
    }

    public void setInteiros(List<Integer> inteiros) {
        this.inteiros = inteiros;
    }

    public void addInteiro(int inteiro) {
        this.inteiros.add(inteiro);
    }

    public void removeInteiro(int inteiro) {
        this.inteiros.remove(inteiro);
    }
    
    

    @Override
    public String toString() {
        return "Generica{" + "id=" + id + ", variavelTexto=" + variavelTexto + ", variavelvalor=" + variavelvalor + ", variavelboleana=" + variavelboleana + ", inteiros=" + inteiros + '}';
    }
    
    
    
}
