package JantarPacote;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "douglas";
		pessoa1.peso = 60;
		
		Comida comida1 = new Comida();
		comida1.peso = 6;
		
		pessoa1.comer(comida1);
		pessoa1.comer(comida1);
		pessoa1.comer(comida1);
		
		
		
		
		System.out.println(pessoa1.peso);
	
			}

}
