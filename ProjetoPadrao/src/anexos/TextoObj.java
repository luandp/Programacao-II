package anexos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class TextoObj implements Serializable{
	
	private String nome;
	private String cpf;
	
	ArrayList<TextoObj> lista = new ArrayList<TextoObj>();
	private ArrayList<TextoObj> o;
	
	public TextoObj(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "TextoObj [nome=" + nome + ", cpf=" + cpf + "]";
	}
        
	public void add(TextoObj o) {
		lista.add(o);
		
	}
	
	public void salvarArray() throws IOException {
		
		File f = new File("objetoArray.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this.lista);
		oos.close();
	}
	
	public void lerArray() throws IOException, ClassNotFoundException {
		File f = new File("objetoArray.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		this.o = (ArrayList<TextoObj>) ois.readObject();
		
		for (TextoObj textoObj : o) {
			System.out.println("array"+textoObj.getNome() + textoObj.getCpf());
		}
		ois.close();
	}
        
	public void salvar(TextoObj to) throws IOException {
		
		File f = new File("objeto.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(to);
		oos.close();
	}
	
	public void ler() throws IOException, ClassNotFoundException{
		
		File f = new File("objeto.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		TextoObj clone = (TextoObj) o;
		
		System.out.println(clone);
		
	}
        
	
}
