package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int resposta = 1;
		int continuar = 1;
		String nomeLivro;
		
		while(continuar == 1)
		{
			System.out.println("Escolha uma opção: \n\n"
					+ "1 - Adicionar Livro na Pilha \n"
					+ "2 - Listar todos os Livros \n"
					+ "3 - Retirar Livro da Pilha \n"
					+ "0 - Sair \n");
			
			resposta = leia.nextInt();
			leia.nextLine(); // Consome a quebra de linha pendente.
			
			switch(resposta)
			{
				case 1:
					System.out.println("Digite o nome do Livro: ");
					nomeLivro = leia.nextLine();
					pilha.push(nomeLivro);
					System.out.println("\nLivro Adicionado!");
					System.out.println("Pilha: " + pilha + "\n");
					break;
					
				case 2:
					if(pilha.isEmpty())
					{
						System.out.println("A pilha está vazia! \n");
					}
					else
					{
						System.out.println("Lista de Livros na Pilha: " + pilha + "\n");
					}
					break;
					
				case 3:
					if(pilha.isEmpty())
					{
						System.out.println("A pilha está vazia! \n");
					}
					else
					{
						pilha.pop();
						System.out.println("Pilha: " + pilha + "");
						System.out.println("Um Livro foi retirado da pilha! \n");
					}
					break;

				case 0:
					continuar = 0;
					System.out.println("Programa Finalizado!");
					break;
			}
		}

	}

}
