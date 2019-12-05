package anexos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

	public static void main2(String[] args) throws IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		String t;
		//
		LinkedList<String> texto = new LinkedList<String>();
		
                
		System.out.println("texto: ");
		t = s.next();
		
		texto.add(t);
                texto.add(t);
                texto.add(t);
               
		
		File f = new File("novo-arquivo.txt");
		
		if(!f.exists()) f.createNewFile();
		
		FileWriter w = new FileWriter(f);

		w.write(t);
		
		w.close();
		s.close();
		
		
		TextoObj c = new TextoObj("lucas", "245-6");
		TextoObj c2 = new TextoObj("luas", "24543245-6");
		TextoObj c3 = new TextoObj("ls", "245-111116");
		
		c.salvar(c);
		c.salvar(c);
		
		c.add(c);
		c2.add(c2);
		c3.add(c3);
		c.ler();
		c.salvarArray();
		c.lerArray();
	}

}
