public class Calculator {
	public void addition (int valor_1, int valor_2) {
		int resultado = valor_1 + valor_2;
		System.out.println ("Resultado da adição: " + resultado);
	}
	public void subtraction (int valor_1, int valor_2) {
		int resultado = valor_1 - valor_2;
		System.out.println ("Resultado da subtração: " + resultado);
	}
	public void multiplication (int valor_1, int valor_2) {
		int resultado = valor_1 * valor_2;
		System.out.println ("Resultado da multiplicação: " + resultado);
	}
	public void division (int valor_1, int valor_2) {
		if (valor_1 % valor_2 == 0) {
			int resultado = valor_1 / valor_2;
			System.out.println ("Resultado da divisão: " + resultado);
		} else {
			System.out.println ("Erro!");
		}
	}
}
