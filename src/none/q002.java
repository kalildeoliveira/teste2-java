package none;
import java.util.*;

public class q002 {

	/**
	 * l� nome de usu�rio e senha em loop e devolve erro se nome e senha forem iguais
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String usuario="", senha="";
		do {
		System.out.println("Informe o nome do usu�rio e a senha.");
		System.out.print("Usu�rio: ");
		usuario = entrada.next();
		System.out.print("Senha: ");
		senha = entrada.next(); 
		if (usuario.equals(senha)) { 
			System.out.println("O nome do usu�rio n�o pode ser o mesmo" +
					"da senha. Tente novamente.");
		}
		} while (usuario.equals(senha));
		System.out.println("\nFim do Programa");
	}
}