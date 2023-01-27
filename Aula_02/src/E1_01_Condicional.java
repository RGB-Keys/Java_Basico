
public class E1_01_Condicional {

	public static void main(String[] args) {

		double salario = 4000.0;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("O IR é de 7.5%");
			System.out.println("Pode deduzir na declaração o valor de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("O IR é de 15%");
			System.out.println("Pode deduzir na declaração o valor de R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR é de 22.5%");
			System.out.println("Pode deduzir na declaração o valor de R$ 636");
		} else {
			System.out.println("Erro!");
		}
	}
}