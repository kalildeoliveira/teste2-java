package none;
import java.util.*;
public class q010 {

	/**
	 * lê base e expoente e devolve o resultado.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base=0, expoente=0, contador=0, resultado=1;
		boolean ficarNoLoop=true;
		
		// entradas
		System.out.println("Informe a base e o expoente.");
		System.out.print("Base: ");
		resultado = base = entrada.nextDouble();
		System.out.print("Expoente: ");
		contador = expoente = entrada.nextDouble();
		while (ficarNoLoop) {
			contador--;
			resultado=resultado*base;
			if (contador==1) {
				ficarNoLoop = false;
			}
		}
		System.out.println("O resultado de "+base+" elevado a "+expoente+" é: "+resultado);
	}
}