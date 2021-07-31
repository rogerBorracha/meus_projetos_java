package treinos;

import java.util.Scanner;

public class treino_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salario atual: ");
		double salario = teclado.nextDouble();
		double sal = 0;
		if (salario <= 280.00) {
			sal = (salario * 0.2) + salario;
		}else if(salario > 280.00 && salario <= 700.00) {
			sal = (salario * 0.15) + salario;
		}else if(salario > 700.00 && salario < 1500.00) {
			sal = (salario * 0.1) + salario;
		}else {
			sal = (salario * 0.05) + salario;
		}
		System.out.println("O salario antes do reajuste era: " + salario);
		System.out.println("A porcentagem de aumento foi: " + 100 * (sal - salario)/salario + "%");
		System.out.println("O salario antes do reajuste era: " + (salario * (sal - salario)/salario));
		System.out.println("O salario depois do reajuste é: " + sal);
	}

}
