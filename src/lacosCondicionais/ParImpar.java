package lacosCondicionais;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite o número A: ");
		num = ler.nextInt();
		
		if(num > 0)
		{
			if(num % 2 == 0)
			{
				System.out.println("O Número " + num + " é par e positivo!");
			}
			else
			{
				System.out.println("O Número " + num + " é ímpar e positivo!");
			}
		}
		else
		{
			if(num % 2 == 0)
			{
				System.out.println("O Número " + num + " é par e negativo!");
			}
			else
			{
				System.out.println("O Número " + num + " é ímpar e negativo!");
			}
		}
	}
}
