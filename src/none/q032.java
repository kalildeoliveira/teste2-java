package at3;
import java.util.*;
public class q032 {

	/**
	 * lê código de 5 cidades, número de veículos e acidentes e devolve
	 * 	a) o maior e menor índice de acidente e sua respectiva cidade
	 * 	b) Total de veículos e média de veículos
	 *	c) Total de acidentes
	 * 	d) média de acidentes nas cidades com menos de 2 mil veículos
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int codigo=0, veiculosCidade1=0, veiculosCidade2=0, veiculosCidade3=0, veiculosCidade4=0, veiculosCidade5=0,
				acidentesCidade1=0, acidentesCidade2=0, acidentesCidade3=0, acidentesCidade4=0, acidentesCidade5=0,
				quantidadeVeiculos=0, quantidadeAcidentes=0, quantidadeAcidentes2Mil=0, maiorAcidentesNumero=0, menorAcidentesNumero=0;
		double totalVeiculos=0, mediaVeiculos=0, mediaVeiculos2000=0, totalAcidentes=0, mediaAcidentes2Mil=0, mediaAcidentes=0;
		boolean ficarNoLoop=true;
		String maiorAcidentes="", menorAcidentes="", opcao="", sair="0";
		
		// Entrada de dados por cidade
		System.out.println("Informe, de 1 a 5, o código da cidade e depois o número de veículos e acidentes.");		
		while (ficarNoLoop) {
		System.out.print("Código: ");
		codigo=entrada.nextInt();
			if (codigo==1) { 
				System.out.print("Veiculos: ");
				veiculosCidade1=entrada.nextInt();
				mediaVeiculos=mediaVeiculos+veiculosCidade1;
				quantidadeVeiculos++;
				System.out.print("Acidentes: ");
				acidentesCidade1=entrada.nextInt();
				if (veiculosCidade1<=2000) {
					mediaAcidentes2Mil=mediaAcidentes2Mil+acidentesCidade1;
					quantidadeAcidentes++; quantidadeAcidentes2Mil++;
				} else {
					mediaAcidentes=mediaAcidentes+acidentesCidade1;
					quantidadeAcidentes++;
				}
			} else if (codigo==2) {
				System.out.print("Veiculos: ");
				veiculosCidade2=entrada.nextInt();
				mediaVeiculos=mediaVeiculos+veiculosCidade2;
				quantidadeVeiculos++;
				System.out.print("Acidentes: ");
				acidentesCidade2=entrada.nextInt();
				if (veiculosCidade2<=2000) {
					mediaAcidentes2Mil=mediaAcidentes2Mil+acidentesCidade2;
					quantidadeAcidentes++; quantidadeAcidentes2Mil++;
				} else {
					mediaAcidentes=mediaAcidentes+acidentesCidade2;
					quantidadeAcidentes++;
				}				
			} else if (codigo==3) {
				System.out.print("Veiculos: ");
				veiculosCidade3=entrada.nextInt();
				mediaVeiculos=mediaVeiculos+veiculosCidade3;
				quantidadeVeiculos++;
				System.out.print("Acidentes: ");
				acidentesCidade3=entrada.nextInt();
				if (veiculosCidade3<=2000) {
					mediaAcidentes2Mil=mediaAcidentes2Mil+acidentesCidade3;
					quantidadeAcidentes++; quantidadeAcidentes2Mil++;
				} else {
					mediaAcidentes=mediaAcidentes+acidentesCidade3;
					quantidadeAcidentes++;
				}				
			} else if (codigo==4) {
				System.out.print("Veiculos: ");
				veiculosCidade4=entrada.nextInt();
				mediaVeiculos=mediaVeiculos+veiculosCidade4;
				quantidadeVeiculos++;
				System.out.print("Acidentes: ");
				acidentesCidade4=entrada.nextInt();
				if (veiculosCidade4<=2000) {
					mediaAcidentes2Mil=mediaAcidentes2Mil+acidentesCidade4;
					quantidadeAcidentes++; quantidadeAcidentes2Mil++;
				} else {
					mediaAcidentes=mediaAcidentes+acidentesCidade4;
					quantidadeAcidentes++;
				}
			} else if (codigo==5) {
				System.out.print("Veiculos: ");
				veiculosCidade5=entrada.nextInt();
				mediaVeiculos=mediaVeiculos+veiculosCidade5;
				quantidadeVeiculos++;
				System.out.print("Acidentes: ");
				acidentesCidade5=entrada.nextInt();
				if (veiculosCidade5<=2000) {
					mediaAcidentes2Mil=mediaAcidentes2Mil+acidentesCidade5;
					quantidadeAcidentes++; quantidadeAcidentes2Mil++;
				} else {
					mediaAcidentes=mediaAcidentes+acidentesCidade5;
					quantidadeAcidentes++;
				}
			} else {
				System.out.println("Código incorreto");
				ficarNoLoop=false;
			}
			
			// Total de veiculos e média
			totalVeiculos=veiculosCidade1+veiculosCidade2+veiculosCidade3+veiculosCidade4+veiculosCidade5;
			mediaVeiculos=(totalVeiculos)/quantidadeVeiculos;
			
			// Total de acidentes
			totalAcidentes=mediaAcidentes+mediaAcidentes2Mil;
			
			// Media de acidentes para cidades com menos de 2 mil veiculos			
			mediaAcidentes2Mil=mediaAcidentes2Mil/quantidadeAcidentes2Mil;
			
			// maior e menor indice de acidentes 		
			if (acidentesCidade1 > acidentesCidade2 && acidentesCidade1 > acidentesCidade3 
					&& acidentesCidade1>acidentesCidade4 && acidentesCidade1>acidentesCidade5) {
				maiorAcidentes = "Cidade cod\"1\"";
				maiorAcidentesNumero = acidentesCidade1;
			} else if (acidentesCidade2>acidentesCidade3 && acidentesCidade2>acidentesCidade4 &&
					acidentesCidade2>acidentesCidade5) {
				maiorAcidentes = "Cidade cod\"2\"";
				maiorAcidentesNumero = acidentesCidade2;
			} else if (acidentesCidade3>acidentesCidade4 && acidentesCidade3>acidentesCidade5) {
				maiorAcidentes = "Cidade cod\"3\"";
				maiorAcidentesNumero = acidentesCidade3;
			} else if (acidentesCidade4>acidentesCidade5) {
				maiorAcidentes = "Cidade cod\"4\"";
				maiorAcidentesNumero = acidentesCidade4;
			} else {
				maiorAcidentes = "Cidade cod\"5\"";
				maiorAcidentesNumero = acidentesCidade5;
			}
				
			if (acidentesCidade1 < acidentesCidade2 && acidentesCidade1 < acidentesCidade3 
					&& acidentesCidade1<acidentesCidade4 && acidentesCidade1<acidentesCidade5) {
				menorAcidentes = "Cidade cod\"1\""; 
				menorAcidentesNumero = acidentesCidade1;
			} else if (acidentesCidade2<acidentesCidade3 && acidentesCidade2<acidentesCidade4 &&
					acidentesCidade2<acidentesCidade5) {
				menorAcidentes = "Cidade cod\"2\"";
				menorAcidentesNumero = acidentesCidade2;
			} else if (acidentesCidade3<acidentesCidade4 && acidentesCidade3<acidentesCidade5) {
				menorAcidentes = "Cidade cod\"3\"";
				menorAcidentesNumero = acidentesCidade3;
			} else if (acidentesCidade4<acidentesCidade5) {
				menorAcidentes = "Cidade cod\"4\"";
				menorAcidentesNumero = acidentesCidade4;
			} else {
				menorAcidentes = "Cidade cod\"5\"";
				menorAcidentesNumero = acidentesCidade5;
			}
			System.out.print ("\nSair?");
			System.out.println("Pressione \"0\" ou \"1\" para continuar");
			System.out.print ("Opção: ");
			opcao=entrada.next();
			if (opcao.equals(sair)) {
				ficarNoLoop=false;
			}
		}
		
		// relatório
		System.out.println("\nTotal de Veículos de passeio (em 1999).....: "+totalVeiculos);
		System.out.println("Número de acidentes de trânsito com vítima(em 1999).....: "+totalAcidentes);
		System.out.println("A cidade com maior índice de acidentes: "+maiorAcidentes+" com "+maiorAcidentesNumero+" acidentes");
		System.out.println("A cidade com menor índice de acidentes: "+menorAcidentes+" com "+menorAcidentesNumero+" acidentes");
		System.out.println("Média de veículos das cinco cidades juntas.....: "+mediaVeiculos);
		System.out.println("Média de acidentes em cidades com menos de 2 mil veículos.....: "+mediaAcidentes2Mil);
		System.out.println("\nPrograma encerrado.");
	}
}
