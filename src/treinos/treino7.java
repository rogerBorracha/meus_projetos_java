package treinos;
import java.util.Scanner;

public class treino7 {

//Fa�a um Programa para ler tr�s idades de alunos e seguir as seguintes instru��es: 
//Se a m�dia de idade dos alunos � inferior de 25, apresentar a mensagem "Turma Jovem"; 
//Se a m�dia de idade dos alunos � entre 25 e 40, apresentar a mensagem "Turma Adulta"; 
//Se a m�dia de idade dos alunos � acima de 40 anos, apresentar a mensagem "Turma Idosa".

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade de tr�s alunos: ");
		int ida1 = teclado.nextInt();
		int ida2 = teclado.nextInt();
		int ida3 = teclado.nextInt();
		if ((ida1 + ida2 + ida3)/3 < 25) {
			System.out.println("Turma Jovem");
		}else if ((ida1 + ida2 + ida3)/3 >= 25 && (ida1 + ida2 + ida3)/3 <= 40) {
			System.out.println("Turma Adulta");
		}else {
			System.out.println("Turma Idosa");
		}
	}
}
