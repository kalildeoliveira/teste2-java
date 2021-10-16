package at3;
import java.util.*;
public class q035 {

	/**
	 * lê o código e quantidade de N produtos e devolve valor pago por item e total
	 * sendo que o cliente informa o fim da compra.Considerar
	 *	100 - para Cachorro Quente por R$ 1,20
	 * 	101 - Bauru Simples, R$ 1,30
	 *	102 - Bauru com ovo, R$ 1,50
	 * 	103 - Hambúrguer, R$ 1,20
	 *	104 - Cheeseburguer, R$ 1,30
	 *	105 - Refrigerante, R$ 1,00
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeProduto=0, produto100=0, produto101=0, produto102=0, produto103=0, produto104=0, produto105=0;
		double valorProduto=0, valorCompra=0, soma=0;
		boolean ficarNoLoop=true;
		String codigo="", codigoCachorro="100", codigoBauruSimples="101", codigoBauruOvo="102", codigoHamburger="103", codigoCheeseBurger="104",
				codigoRefrigerante="105", opcao="", sim="s", nao="n";
		System.out.println("Informe o código do produto conforme a tabela e também a quantidade.");
		System.out.println("100 - Cachorro Quente \n"+
	  	"101 - Bauru Simples \n"+
	 	"102 - Bauru com ovo \n"+
	  	"103 - Hambúrguer \n"+
	 	"104 - Cheeseburguer \n"+
	 	"105 - Refrigerante\n");
		
		while (ficarNoLoop) {		
			System.out.print("\nCódigo: ");
			codigo=entrada.next();
			System.out.print("Quantidade: ");
			quantidadeProduto=entrada.nextInt();
			if (codigo.equals(codigoCachorro)) {
				valorProduto=1.20*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto100=quantidadeProduto;
			} else if (codigo.equals(codigoBauruSimples)) {
				valorProduto=1.30*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto101=quantidadeProduto;
			} else if (codigo.equals(codigoBauruOvo)) {
				valorProduto=1.50*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto102=quantidadeProduto;
			} else if (codigo.equals(codigoHamburger)) {
				valorProduto=1.20*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto103=quantidadeProduto;
			} else if (codigo.equals(codigoCheeseBurger)) {
				valorProduto=1.30*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto104=quantidadeProduto;
			} else if (codigo.equals(codigoRefrigerante)) {
				valorProduto=1.00*quantidadeProduto;
				valorCompra=valorCompra+valorProduto;
				produto105=quantidadeProduto;
			}
			System.out.println("\nContinuar comprando?");
			System.out.println("\"s\" - sim ou \"n\" - não");
			System.out.print("Opção: ");
			opcao=entrada.next();
			if (opcao.equals(nao)) {
				ficarNoLoop=false;
			}			
		}
				
		// relatório da compra
		System.out.println("\n:::::::::::: RELATÓRIO DA COMPRA ::::::::::::::");
		System.out.println("Cod|     Produto       |   R$   |Qtd| R$ x Qtd ");
		if (produto100!=0) {
			System.out.println("100|Cachorro Quente... | R$1,20 | "+produto100+" | R$ "+ (1.2*produto100));
		} 
		if (produto101!=0) {
			System.out.println("101|Bauru simples..... | R$1,30 | "+produto101+" | R$ "+ (1.3*produto101));
		}	 
		if (produto102!=0) {
			System.out.println("102|Bauru com ovo..... | R$1,50 | "+produto102+" | R$ "+ (1.5*produto102));
		}
		if (produto103!=0) {
			System.out.println("103|Hambúrguer.........| R$1,20 | "+produto103+" | R$ "+ (1.2*produto103));
		}
		if (produto104!=0) {
			System.out.println("104|Cheeseburguer..... | R$1,30 | "+produto104+" | R$ "+ (1.3*produto104));
		}
		if (produto105!=0) {
			System.out.println("105|Refrigerante...... | R$1,00 | "+produto105+" | R$ "+ (1.0*produto105));
		}
		System.out.println("Total da compra...................... R$ "+valorCompra);
	}
}
