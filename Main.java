import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		Calculator calculator = new Calculator ();
		while (true) {
			System.out.println (" ");
			System.out.println ("1 - Adição");
			System.out.println ("2 - Subtração");
			System.out.println ("3 - Multiplicação");
			System.out.println ("4 - Divisão");
			System.out.println ("5 - Sair");
			System.out.println (" ");
			System.out.print ("Escolha: ");
			int escolha = scanner.nextInt ();
			System.out.println (" ");
			if (escolha == 5) {
				System.out.println ("Até logo.");
				break;
			}
			System.out.print ("Digite o primeiro valor: ");
			int valor_1 = scanner.nextInt ();
			System.out.print ("Digite o segundo valor: ");
			int valor_2 = scanner.nextInt ();
			switch (escolha) {
				case 1:
					calculator.addition (valor_1, valor_2);
					break;
				case 2:
					calculator.subtraction (valor_1, valor_2);
					break;
				case 3:
					calculator.multiplication (valor_1, valor_2);
					break;
				case 4:
					calculator.division (valor_1, valor_2);
					break;
				default:
					System.out.println ("Opção inválida.");
			}
		}
		scanner.close ();
	}
}
