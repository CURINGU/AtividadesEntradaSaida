package Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosWrapper {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		for(int i=0; i < 10; i++)
		{
			System.out.println("Digite o " + (i+1) + "° número inteiro (não use números repetidos): ");
			setNumeros.add(ler.nextInt());
		}
		
		System.out.println("\n\nListando todos os dados: ");
		for(Integer numero : setNumeros)
		{
			System.out.println(numero);
		}
		
	}
}
