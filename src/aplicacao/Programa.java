package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Victor de Casas", "victorcasas@gmail.com");
		Pessoa p2 = new Pessoa(1, "Mariana Figueiredo Martins", "marianafmartins@gmail.com");
		Pessoa p3 = new Pessoa(1, "Gustavo Martins de Casas", "gustavomcasas@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
