import java.util.Scanner;

public class aula7 {

	//Fa�a um Programa que pergunte em que turno voc� estuda. 
	//Pe�a para digitar M- matutino ou V-Vespertino ou N- Noturno. 
	//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!"
	//conforme o caso.


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o turno que voc� estuda,  M, V ou N: ");
		char turno = teclado.nextLine().toUpperCase().charAt(0);
		switch (turno) {
			case 'M':
				System.out.println("Bom dia!");
				break;
			case 'V':
				System.out.println("Boa tarde!");
				break;
			case 'N':
				System.out.println("Boa noite!");
				break;
			default:
				System.out.println("Valor invalido!!!");
		}
	}

}
