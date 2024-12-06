package Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Cores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i=0; i < 5; i++)
		{
			System.out.println("Digite uma cor: ");
			cores.add(ler.nextLine());
		}
		
		System.out.println("\nTodas as cores: ");
		for(String nota : cores) {
			System.out.println(nota);
		}
		
		cores.sort(String::compareToIgnoreCase);
		//Usando NULL, ele ordena de acordo com maiúsculas e minúsculas, o que não deixa em ordem alfabética correta
		
		System.out.println("\nCores ordenadas: ");
		for(String nota : cores) {
			System.out.println(nota);
		}
		
	}

}
