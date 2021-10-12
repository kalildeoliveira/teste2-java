package none;
public class q004 {

		/**
		 * lê a população e taxa de crescimento de 2 cidades e devolve
		 * 	o tempo para a população de uma cidade passar a outra, sendo: 
		 * 	a)  população A = 80 mil pessoas e taxa de 3%
		 * 	b)  população B = 200 mil e taxa de 1.5%
		 */

	public static void main(String[] args) {
		double paisA=80000, paisB=200000, numeroAnos=0, taxaA=1.03, taxaB=1.015;

	   while (paisA < paisB) {
	       numeroAnos = numeroAnos +1;
	       paisA = paisA * taxaA;
	       paisB = paisB * taxaB;
	   }
	   System.out.println ("Com a taxa de crescimento prevista, " + 
			   "será preciso aguadar "+ numeroAnos+ " anos \n"+
			   "para que a população do país A ultrapasse a "+
			   "população do país B ");
	}
}
