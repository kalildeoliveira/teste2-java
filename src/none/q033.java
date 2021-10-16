package at3;
import java.util.*;
public class q033 {

	/**
	 * l� valor inicial da d�vida e devolve os dados da d�vida conforme os juros e 
	 * quantidade de parcelas, incluindo o valor da parcela. Considerar: : 
	 * 	juros 0 para 1 parcela
	 * 	10% para 3 parcelas
	 * 	15% para 6 parcelas
	 * 	20% para 9 parcelas
	 *	25% para 12 parcelas
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double divida=0;
		int parcelas=0;						
		System.out.println("Informe o valor da d�vida para o c�lculo dos juros.");		
		System.out.print("Divida: ");
		divida=entrada.nextDouble();
				
		//relat�rio do valor da d�vida conforme quantidade de parcelas e juros
		System.out.println("D�vida | Juros | Parcelas | Valor Parcela");
		for (parcelas=1; parcelas<=12; parcelas++) {
			if (parcelas==1) {
				System.out.print("R$ "+divida);
				System.out.print("| 00 % |");
				System.out.print(parcelas);
				System.out.print(" | ");
				System.out.print("R$ "+divida/parcelas);				
			} else if (parcelas==3) {
				System.out.println("\n");
				System.out.print("R$ "+divida*1.10);
				System.out.print("| 10 % |");
				System.out.print(parcelas);
				System.out.print(" | ");
				System.out.print("R$ "+divida/parcelas);
			} else if (parcelas==6) {
				System.out.println("\n");
				System.out.print("R$ "+divida*1.15);
				System.out.print("| 15 % |");
				System.out.print(parcelas);
				System.out.print(" | ");
				System.out.print("R$ "+divida/parcelas);
			} else if (parcelas==9) {
				System.out.println("\n");
				System.out.print("R$ "+divida*1.20);
				System.out.print("| 20 % |");
				System.out.print(parcelas);
				System.out.print(" | ");
				System.out.print("R$ "+divida/parcelas);
			} else if (parcelas==12) {
				System.out.println("\n");
				System.out.print("R$ "+divida*1.25);
				System.out.print("| 25 % |");
				System.out.print(parcelas);
				System.out.print(" | ");
				System.out.print("R$ "+divida/parcelas);
			}
		}
	}
}
