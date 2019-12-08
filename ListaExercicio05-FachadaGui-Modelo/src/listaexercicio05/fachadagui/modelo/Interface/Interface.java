/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio05.fachadagui.modelo.Interface;

import java.io.File;
import java.util.ArrayList;
import listaexercicio05.fachadagui.modelo.Classe.Pessoa;

/**
 *
 * @author Luan Paulo
 */
public interface Interface {
    public String adicionarPessoa(String nome, String telefone, String rg);
    public void adicionarPessoas(ArrayList<Pessoa> pessoas);
    public ArrayList<Pessoa> recuperarPessoas(File f);
    public String getNomePessoa(int indice);
    public String getTelefonePessoa(int indice);
    public String getRGPessoa(int indice);
}
