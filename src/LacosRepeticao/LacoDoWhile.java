package LacosRepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		int num = 1;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
            
            if(num > 0)
            {
            	soma += num;
            }

        } while (num != 0);
			
		System.out.println("A soma dos números positivos é: " + soma);

	}

}
