import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();

		System.out.print("Sexo:");
		conta.sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas:");
		conta.cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes:");
		conta.refrigerante = sc.nextInt();
		System.out.print("Quantidade de espetinhos:");
		conta.espeto = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", conta.consumo());
		if (conta.couvert() == 0) {
			System.out.println("Isento de couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", conta.couvert());
		}
		System.out.printf("INGRESSO = R$ %.2f%n", conta.ingresso());

		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", conta.total());
		sc.close();

	}

}
