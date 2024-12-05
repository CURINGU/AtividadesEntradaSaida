package Vetores;
import java.util.Scanner;

public class ArmazenaNumeros {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		int soma = 0;
		float media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i < 10; i++)
		{
			System.out.println("Escreva o " + (i + 1) + "° número");
			numeros[i] = ler.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for(int i=0; i < 10; i++)
		{	
			if(i % 2 != 0)
			{
				System.out.print(numeros[i] + " ");
			}
		}

		System.out.println("\nElementos pares: ");
		for(int i=0; i < 10; i++)
		{	
			if(numeros[i] % 2 == 0)
			{
				System.out.print(numeros[i] + " ");
			}
		}
		
		for(int i=0; i < 10; i++)
		{	
			soma += numeros[i];
		}
		System.out.println("\nSoma: " + soma);
		
		media = soma / 10;
		System.out.printf("Média: %.2f", media);
	}

}
