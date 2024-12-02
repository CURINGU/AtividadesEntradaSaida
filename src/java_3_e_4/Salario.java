package java_3_e_4;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario;
		float abono;
		float novosalario;
		
		System.out.println("Digite o Salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = ler.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("O novo salário é: " + novosalario);
	}

}
