package java_3_e_4;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		float valores[] = new float[4];
		float diferenca;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i < 4; i++)
		{
			System.out.println("Escreva o " + (i + 1) + "° número");
			valores[i] = ler.nextFloat();
		}
		
		diferenca = (valores[0] * valores[1]) - (valores[2] * valores[3]);
		
		System.out.println("A diferença dos produtos é de: " + diferenca);
	}

}
