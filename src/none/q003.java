package none;
import java.util.*;
public class q003 {

	/**
	 * lê e devolve de acordo com as regras de validação em loop. 
	 * 	a)  nome (3 caracteres), 
	 *	b)  idade 0 a 150,
	 * 	c)  salário > 0,
	 * 	d)  sexo ‘f’ ou ‘m’ e
	 * 	e)  estado civil ‘s’, ‘c’, ‘v’ ou ‘d’
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome="123";
		int idade=0;
		float salario=0;
		String f="f", m="m", s="s", c="c", v="v", d="d", sexo="", estadoCivil="";
		boolean ficarNoLoop=true;
		
		// a) nome
		do {
			System.out.println("O sistema requer seu nome, idade, salário, sexo e estado civil.");
			System.out.print("Nome (no mínimo 3 caracteres): ");
			nome = entrada.next();
			if (nome.length ()<3) { 
				System.out.println("\nO nome precisa ter no mínimo 3 caracteres");
			} else {
				ficarNoLoop=false;
			}
		} while (ficarNoLoop);
		
		// b) idade
		do {
		System.out.print("Idade : ");
		idade = entrada.nextInt();
			if (idade<0) { 
				System.out.println("\nO sistema não recebe idade negativa.");
			}
			if (idade > 150) {
				System.out.println("\nA idade não pode exceder 150 anos.");
			}
			} while (idade<0 || idade>=150);
		
		// c) salario
		do {
			System.out.println("Informe o seu salário.");
			System.out.print ("Salário: R$ ");
			salario = entrada.nextFloat();
			if (salario<0) {
				System.out.println("\nO salário não pode ser negativo");
				ficarNoLoop=true;
			} else { 
				ficarNoLoop=false;
			}
		} while (ficarNoLoop);
		
		// d) sexo
		do {
			System.out.println("Informe \"f\" para feminino ou \"m\" para masculino.");
			System.out.print("Sexo: ");
			sexo = entrada.next();
			if ((sexo.equals(f) || sexo.equals(m))) {
				ficarNoLoop = false;
			} else { 
				System.out.println("Dados incorretos. Tente novamente. ");
				ficarNoLoop = true;
			}
		} while (ficarNoLoop);
		
		// d) estado civil
		do {
			System.out.println("Informe \"s\" para solteiro, \"c\" para casado,\n" +
					"\"v\" para viúvo ou \"d\" para divorciado.");
			System.out.print("Sexo: ");
			estadoCivil = entrada.next();
			if ((estadoCivil.equals(s) || estadoCivil.equals(c) || estadoCivil.equals(v) || estadoCivil.equals(d))) {
				ficarNoLoop = false;
			} else { 
				System.out.println("Dados incorretos. Tente novamente. ");
				ficarNoLoop = true;
			}
		} while (ficarNoLoop);		
		
		// relatório
		System.out.println("\n::::: Dados Informados ::::: ");
		System.out.println("Nome: "+nome+"\n" +
				"Idade: "+idade+"\n" +
				"Salário: R$ "+salario);
		if (sexo.equals(f)) {
			System.out.println("Sexo: Feminino");
		} else {
			System.out.println("Sexo: Masculino");
		}
		if (estadoCivil.equals(s)) {
			System.out.println("Estado Civil: Solteiro");
		} else if (estadoCivil.equals(c)) {
			System.out.println("Estado Civil: Casado");
		} else if (estadoCivil.equals(v)) {
			System.out.println("Estado Civil: Viúvo");
		} else {
			System.out.println("Estado Civil:: Divorciado");
		}
	} 
}
