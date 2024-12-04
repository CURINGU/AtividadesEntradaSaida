package lacosCondicionais;
import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int codProd;
		int quant;
		float preco;
		int total = 0;
		String nomeProd = "";

		System.out.println("Digite o código do produto: ");
		codProd = ler.nextInt();
		System.out.println("Digite a quantidade: ");
		quant = ler.nextInt();
		
		switch(codProd)
		{
			case 1:
				total = quant * 10;
				nomeProd = "Cachorro Quente";
				break;
			case 2:
				total = quant * 15;
				nomeProd = "X-Salada";
				break;
			case 3:
				total = quant * 18;
				nomeProd = "X-Bacon";
				break;
			case 4:
				total = quant * 12;
				nomeProd = "Bauru";
				break;
			case 5:
				total = quant * 8;
				nomeProd = "Refrigerante";
				break;
			case 6:
				total = quant * 13;
				nomeProd = "Suco de Laranja";
				break;
			default:
				System.out.println("Código inválido!");
		}
		
		System.out.println("Produto: " + nomeProd + "\nValor total: R$" + total);
	}

}
