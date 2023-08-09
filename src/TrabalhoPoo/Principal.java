package TrabalhoPoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Cofrinho cofrinho = new Cofrinho();
		Menu menu = new Menu();
		Moeda moeda;

		Scanner entrada = new Scanner(System.in);

		int op = 0; // variável opção que o usuário vai digitar.
		double valorTotal = 0, valorTotalRemovido = 0; // valor total converdido para real e valor total removido.
		boolean removeuMoeda = false; // variável para verificar se a moeda foi removida com sucesso.

		while (op != 5) {

			menu.menuPrincipal(); // classe menu principal.

			op = entrada.nextInt();

			switch (op) {

			case 1:

				System.out.println();
				System.out.println("----------- Adicionar Moeda -----------");
				menu.menuAdicionarRemover(); // chamando o menu principal

				System.out.println("Digite A Cédulas Que Deseja Adicionar: ");
				int moedaAdicionar = entrada.nextInt();

				System.out.println();
				System.out.println("Digite O Valor Que Deseja Adicionar: ");
				double valorAdicionar = entrada.nextDouble();

				moeda = null;
				valorTotal = 0;

				// verificando qual moeda o usuário deseja adicionar.

				if (moedaAdicionar == 1) {

					moeda = new Dolar(valorAdicionar);

				} else if (moedaAdicionar == 2) {

					moeda = new Euro(valorAdicionar);

				} else if (moedaAdicionar == 3) {

					moeda = new Real(valorAdicionar);

				} else {

					System.out.println("Digite Uma Cédula Válida!");
					continue;

				}

				cofrinho.adicionarMoeda(moeda); // adiciona a moeda no array list de moedas.
				break;

			case 2:

				System.out.println();
				System.out.println("----------- Remover Moeda -----------");
				menu.menuAdicionarRemover(); // chama o menu remover.

				moeda = null;

				System.out.println("Digite a Cédula Que Deseja Remover: ");
				int moedaRemover = entrada.nextInt();

				System.out.println();
				System.out.println("Digite O Valor Que Deseja Remover");
				double valorRemover = entrada.nextDouble();

				if (moedaRemover == 1) {
					
					// verifica qual moeda o usuário deseja remover.

					moeda = new Dolar(valorRemover); 
					valorTotalRemovido = valorRemover * 5.06; // adiciona o total do valor removido.
					removeuMoeda = true; // variável para verificar se o valor foi removido para a verificação na linha 121

				} else if (moedaRemover == 2) {

					moeda = new Euro(valorRemover);
					valorTotalRemovido = valorRemover * 5.56;
					removeuMoeda = true;

				} else if (moedaRemover == 3) {

					moeda = new Real(valorRemover);
					valorTotalRemovido = valorRemover;
					removeuMoeda = true;

				} else {

					System.out.println("Digite Uma Cédula Válida!");
					continue;

				}

				cofrinho.remover(moeda); // remove a moeda do array list .

			case 3:
				
				// lista todas as moedas do array list.

				System.out.println();
				cofrinho.listarMoeda();
				break;

			case 4:

				if (removeuMoeda == true) {

					valorTotal -= valorTotalRemovido; // remove o total removido da variável valor total.

				} else {

					for (Moeda m : cofrinho.getListaDeMoedas()) {

						valorTotal += m.converter(); // converte todos os valores para real.

					}

				}

				System.out.println();
				System.out.printf("Valor Total Em R$ = : %.2f", valorTotal); // formantando o valor total para 2 casa depois da virgula
				break;

			}

		}

	}
}