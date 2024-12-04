package LacosRepeticao;
import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numPares = 0;
		int numImpares = 0;
		int resp;
		
		for(int i=0; i<10; i++)
        {
        	System.out.println("Digite o " + (i+1) + "º número: ");
            resp = leia.nextInt();
            
            if(resp % 2 == 0)
            {
            	numPares++;
            }
            else
            {
            	numImpares++;
            }
        }
			
		System.out.println("Total de números Pares: " + numPares);
		System.out.println("Total de números Ímpares: " + numImpares);
	}

}
