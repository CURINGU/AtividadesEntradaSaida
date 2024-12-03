package lacosCondicionais;
import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;
		boolean doou;

		System.out.println("Digite o nome do doador: ");
		nome = ler.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();
		
		System.out.println("Já doou sangue? ");
		doou = ler.nextBoolean();
		
		if(idade >= 18 && idade <= 69)
		{
			if(idade >= 60 && doou == true)
			{
				System.out.println(nome +" não está apto para doar sangue!");
			}
			else
			{
				System.out.println(nome +" está apto para doar sangue!");
			}
		}
		else
		{
			System.out.println(nome +" não está apto para doar sangue!");
		}

	}

}
