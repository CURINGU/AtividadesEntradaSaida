package Vetores;
import java.util.Scanner;

public class LocalizaNumero {

	public static void main(String[] args) {
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int resp;
		boolean encontrou = false;
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Digite o número que você deseja encontrar: ");
        resp = leia.nextInt();
        
        for(int i = 0; i < 9; i ++) {
            if(numeros[i] == resp)
            {
            	System.out.println("O número " + resp + " está localizado na posição: " + i);
            	encontrou = true;
            }
        }
        
        if(encontrou == false)
        {
        	System.out.println("O número " + resp + " não foi encontrado!");
        }

	}

}
