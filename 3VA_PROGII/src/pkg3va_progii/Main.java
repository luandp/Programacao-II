/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3va_progii;

import pkg3va_progii.Fachada.Fachada;
import pkg3va_progii.Views.TelaPrincipal;

/**
 *
 * @author Luan Paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fachada fachada = new Fachada();
       TelaPrincipal tp = new TelaPrincipal(fachada);
       tp.show();
    }
    
}
