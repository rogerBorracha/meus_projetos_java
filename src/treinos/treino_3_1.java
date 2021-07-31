package treinos;

import java.util.Scanner;

public class treino_3_1 {

//	Escrever um algoritmo que leia uma quantidade desconhecida de números e conte 
//	quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
//	A entrada de dados deve terminar quando for lido um número negativo.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite numeros positivos aleatorios, para finalizar digite um numero negativo: ");
		double num = 0;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		do {
			num = teclado.nextDouble();
			if (num >= 0 && num <= 100) {
				if (num >= 0 && num <= 25) {
					cont1++;
				}else if (num >= 26 && num <= 50) {
					cont2++;
				}else if (num >= 51 && num <= 75) {
					cont3++;
				}else {
					cont4++;
				}
			}else {
				System.out.println("Digite numeros de 0 a 100!!!");
			}
		}while(num >= 0);
		System.out.println("Foram informados "+cont1+" numeros no intervalo de 0 a 25,\n "+cont2+" numeros no intervalo de 26 a 50,\n "+cont3+" numeros no intervalo de 51 a 75 e\n "+cont4+" numeros no intervalo de 76 a 100.");
	}
}