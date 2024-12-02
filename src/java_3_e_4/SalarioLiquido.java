package java_3_e_4;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto;
		float adicional;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicional = ler.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasExtras = ler.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adicional + (horasExtras * 5) - descontos;
		
		System.out.println("O Salário Líquido é de: " + salarioLiquido);

	}

}
