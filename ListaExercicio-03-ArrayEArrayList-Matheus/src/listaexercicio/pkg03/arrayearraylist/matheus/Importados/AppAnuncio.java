package listaexercicio.pkg03.arrayearraylist.matheus.Importados;

public class AppAnuncio {

	public static void main(String[] argumentos) {
			System.out.println("Anuncio de : " + argumentos[0]);
			System.out.println("Mensagem   : " + argumentos[1]);
	}
	public static void main2(String[] argumentos) {
			System.out.println("Anuncio de : " + argumentos[0]);
                        System.out.println("Destinatario : " + argumentos[2]);
			System.out.println("Mensagem   : " + argumentos[1]);
	}
	public static void main3(String[] argumentos) {
                        try {
                            String dest = argumentos[2];
                            String msg = argumentos[1];
                            String ad = argumentos[0];
                            
			System.out.println("Anuncio de : " + ad);
                        System.out.println("Destinatario : " + dest);
			System.out.println("Mensagem   : " + msg);
                        } catch (Exception e) {
                            System.out.println("Main3 Erro: "+ e);
                        }
	}

}