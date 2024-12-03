package lacosCondicionais;
import java.util.Scanner;

public class MaiorMenorIgual {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a;
		int b;
		int c;
		int resultado;

		System.out.println("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		c = ler.nextInt();
		
		resultado = a + b;
		
		if(resultado > c)
		{
			System.out.println("A soma de A + B é maior que C");
		}
		else if(resultado < c)
		{
			System.out.println("A soma de A + B é menor que C");
		}
		else
		{
			System.out.println("A soma de A + B é igual que C");
		}
	}
}
