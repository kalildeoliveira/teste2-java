package at3;
import java.util.*;
public class q012 {
	
	/**
	 * lê comando para gerar a série de Fibonacci, ou seja,
	 * “cada termo subsequente corresponde à soma dos dois anteriores”
	 * (SEQUENCIA, 2021);
	 */
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int numero1=0, numero2=1, numero3=0, contador=0, limite=0;
		String opcao="", f="f";
		boolean ficarNoLoop=true;
		
		System.out.println("Digite \"f\" para gerar a série de Fibronacci");
		System.out.print("Opção: ");
		opcao = entrada.next();
		System.out.println("Informe um número limite da série. Exemplo: 30");
		System.out.print("Limite: ");
		limite = entrada.nextInt();
		if (limite==0) {
			limite=30;
		}		
		if (opcao.equals(f)) {
			while (ficarNoLoop) {
			numero3=numero1+numero2;
			System.out.println(numero3);
			numero1=numero2;
			numero2=numero3;
			contador++;
			if (contador==limite) {
				ficarNoLoop = false;
			}
			}
		} else { 
			System.out.println("\n\nPrograma encerrado");
		}
		
	}
}
