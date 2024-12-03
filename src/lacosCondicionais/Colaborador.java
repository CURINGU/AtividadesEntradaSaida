package lacosCondicionais;

import java.util.Scanner;

public class Colaborador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int codCargo;
		float salario;
		
		String cargo = "";
		float salarioReajustado = 0;

		System.out.println("Digite o nome do colaborador: ");
		nome = ler.nextLine();
		System.out.println("Digite o código do cargo: ");
		codCargo = ler.nextInt();
		System.out.println("Digite o salário do colaborador: ");
		salario = ler.nextFloat();
		
		switch(codCargo)
		{
			case 1:
				salarioReajustado = salario + (0.10f * salario);
				cargo = "Gerente";
				break;
			case 2:
				salarioReajustado = salario + (0.07f * salario);
				cargo = "Vendedor";
				break;
			case 3:
				salarioReajustado = salario + (0.09f * salario);
				cargo = "Supervisor";
				break;
			case 4:
				salarioReajustado = salario + (0.06f * salario);
				cargo = "Morotista";
				break;
			case 5:
				salarioReajustado = salario + (0.05f * salario);
				cargo = "Estoquista";
				break;
			case 6:
				salarioReajustado = salario + (0.08f * salario);
				cargo = "Técnico de TI";
				break;
			default:
				System.out.println("Código inválido!");
		}
		
		System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo + "\nSalário: " + salarioReajustado);

	}

}
