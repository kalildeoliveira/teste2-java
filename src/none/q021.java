package at3;
import java.util.*;
public class q021 {
	
	/**
	 *  lê a idade de N pessoas e devolve se a média de idade é:
	 *  	a) jovem, entre 0 e 25, 
	 *		b) adulta, entre 26 e 60 ou
	 *		c) idosa, se é maior de 60
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double idade=0, media=0;
		int limite=0;
		System.out.println("Informe quantas idades pretende lançar no sistema. Ex.: 10");
		System.out.print("Idades: ");
		limite=entrada.nextInt();				
		for (int i=1; i<=limite; i++) {
			System.out.print("Idade["+i+"]: ");
			idade=entrada.nextDouble();
			media=media+idade;			
		}
		idade=media/limite;
		if (idade>0 && idade<=25) {
			System.out.println("A média é jovem, com "+idade+" anos.");
		} else if (idade>25 && idade<=60) {
			System.out.println("A média é adulta, com "+idade+" anos.");
		} else if (idade>60) {
			System.out.println("A média é idosa, com "+idade+" anos.");
		}
	}	
}
