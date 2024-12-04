package LacosRepeticao;
import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numMenores = 0;
		int numMaiores = 0;
		int idade = 1;
		
		while(idade >= 0)
		{
			System.out.println("Digite uma idade: ");
            idade = leia.nextInt();
            
            if(idade <= 21 && idade > 0)
            {
            	numMenores++;
            }
            else if(idade >= 50)
            {
            	numMaiores++;
            }
		}
			
		System.out.println("Total de pessoas menores de 21 anos: " + numMenores);
		System.out.println("Total de pessoas maiores de 50 anos: " + numMaiores);

	}

}
