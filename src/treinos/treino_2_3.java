package treinos;

public class treino_2_3 {

	//Escreva um algoritmo que gera aleatoriamente 50 valores inteiros e positivos e
	//encontre o maior valor, o menor valor e a média dos números.

	public static void main(String[] args) {
		int num = -1;
		int soma = 0;
		int cont = 0;
		int valor = 0;
		int valor2 = 101;
		while (cont < 50) {
			num = (int)(Math.random()*100);
			soma += num;
			if (num > valor) {
				valor = num;
			}if (valor2 > num) {
				valor2 = num;
			}cont++;
		}System.out.println("O maior valor foi: "+valor+"\nOmenor valor foi: "+valor2+"\nAmedia dos valores é: "+(soma+=num)/cont);
	}
}