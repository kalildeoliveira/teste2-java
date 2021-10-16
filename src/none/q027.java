package at3;
import java.util.*;
public class q027 {
	/**
	 * lê valor de N produto e dinheiro e devolve total da compra com troco
	 * sendo que o valor 0 emite relatório e reinicia o loop.
	 */
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int compra=0, i=1, j=2;
		double soma=0, valorPago=0;		
		boolean ficarNoLoop=true;		
		System.out.println("Informe o valor do produto ou \"0\" para Sair");
		while (ficarNoLoop) {				
		System.out.print("Valor R$");		
		double [] produto = new double[j];
		produto[i]=entrada.nextDouble();
		if (produto[i]!=0) {			
			soma = soma+produto[i];
			compra++; i++; j++;			
		} else {
			ficarNoLoop=false;
			System.out.println("Sua compra deu R$"+soma);
			System.out.println("Pagamento em dinheiro?");
			System.out.print("Valor pago:");
			valorPago=entrada.nextDouble();
			System.out.println("\nLojas Tabajara");
			for (i=1;i<=compra;i++) {
				System.out.println("Produto "+i+": R$ "+(produto[i]));
			}
			System.out.println("Total R$"+soma);
			System.out.println("Dinheiro R$: "+valorPago);
			System.out.println("Troco R$"+(valorPago-soma));
			}
		} System.out.println("\nPrograma encerrado.");
	}
}