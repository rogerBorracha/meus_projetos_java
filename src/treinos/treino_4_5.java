package treinos;

public class treino_4_5 {

	//Faça um programa que preencha dois arrays de dez elementos numéricos cada um 
	//(os valores devem ser atribuídos na inicialização) e mostre o array resultante 
	//da intercalação deles, conforme exemplo abaixo:
	//vetor1 = {3,5,4,2,2,5,3,2,5,9} vetor2 = {7,15,20,0,18,4,55,23,8,6}
	//vetorResult ={3,7,5,15,4,20,2,0,2,18,5,4,3,55,2,23,5,8,9,6}

	public static void main(String[] args) {
		int num1[] = {3,5,4,2,2,5,3,2,5,9};
		int num2[] = {7,15,20,0,18,4,55,23,8,6};
		int num3[] = new int[20];
		int cont = 0;
		for(int i = 0; i < 10; i++) {
			num3[cont] = num1[i];
			cont++;
			num3[cont] = num2[i];
			cont++;
		}
		for(int i = 0; i < 20; i++) {
			System.out.println(num3[i]+" \t->\t "+i);
		}

	}

}
