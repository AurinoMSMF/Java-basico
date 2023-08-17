import java.util.Scanner;

public class ContaTerminal {
	
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número da conta:");
		int numero = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite o número da agência:");
		String agenciaLine = scanner.nextLine();
		String agencia = agenciaLine.trim();
		
		System.out.println("Digite o nome do cliente:");
		String clienteLine = scanner.nextLine();
		String cliente = clienteLine.trim();
		
		
		System.out.println("Digite o seu saldo:");
		float saldo = scanner.nextFloat();
		
		String infos = "Olá, "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque";
		
		scanner.close();
		
		System.out.println(infos);
	}
	
}
