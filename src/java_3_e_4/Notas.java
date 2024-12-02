package java_3_e_4;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		float notas[] = new float[4];
		float media;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i < 4; i++)
		{
			System.out.println("Escreva a " + (i + 1) + "° nota");
			notas[i] = ler.nextFloat();
		}
		
		media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
		
		System.out.println("A média é de: " + media);
	}

}
