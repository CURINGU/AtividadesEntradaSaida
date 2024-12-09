package Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaClientes {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int resposta = 1;
		int continuar = 1;
		String nome;
		
		while(continuar == 1)
		{
			System.out.println("Escolha uma opção: \n\n"
					+ "1 - Adicionar clientes na Fila \n"
					+ "2 - Listar todos os Clientess \n"
					+ "3 - Retirar cliente da Fila \n"
					+ "0 - Sair \n");
			
			resposta = leia.nextInt();
			leia.nextLine(); // Consome a quebra de linha pendente.
			
			switch(resposta)
			{
				case 1:
					System.out.println("Digite o nome: ");
					nome = leia.nextLine();
					fila.add(nome);
					System.out.println("\nCliente Adicionado!");
					System.out.println("Fila: " + fila + "\n");
					break;
					
				case 2:
					if(fila.isEmpty())
					{
						System.out.println("A fila está vazia! \n");
					}
					else
					{
						System.out.println("Lista de Clientes na Fila: " + fila + "\n");
					}
					break;
					
				case 3:
					
					if(fila.isEmpty())
					{
						System.out.println("A fila está vazia! \n");
					}
					else
					{
						System.out.println("Lista de Clientes na Fila: " + fila + "\n");
						fila.poll();
						System.out.println("Fila: " + fila + "");
						System.out.println("O Cliente foi Chamado! \n");
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
