package TrabalhoPoo;

import java.util.ArrayList; // importando array list

public class Cofrinho {

	private ArrayList<Moeda> listaDeMoedas = new ArrayList<Moeda>(); // criando o array list como privado.

	public void adicionarMoeda(Moeda moeda) { // método para adicionar moeda

		listaDeMoedas.add(moeda); // adiona a moeda no array list

	}

	public void remover(Moeda moeda) { // método para remover moeda

		if (listaDeMoedas.contains(moeda)) { // verifica se o valor que esta sendo removido existe no array list 

			listaDeMoedas.remove(moeda);
			System.out.println("Moeda Removida Com Sucesso");
			System.out.println();

		} else {

			System.out.println("Esse Valor De Moeda Não Existe!");
			System.out.println();

		}
	}

	public void listarMoeda() {  // método para listar todas as moedas

		for (Moeda m : listaDeMoedas) { // for para percorre todos os valores do array list

			m.info(); // método que mostra as cédulas adicionadas no array list

		}
	}

	public ArrayList<Moeda> getListaDeMoedas() { // método get para pegar os valores do array list

		return listaDeMoedas;

	}
}