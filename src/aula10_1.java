
public class aula10_1 {

	//Declare um array de 50 posi��es e preencha ele com 50 valores aleat�rios. 
	//Ao final imprima todos os valores pares e divis�veis por 3.


	public static void main(String[] args) {
		int num [] = new int[50];
		for(int i = 0; i < 50; i++) {
			num[i] = (int)(Math.random()*100);	
			if (num[i] % 2 == 0 && num[i] % 3 == 0) {
				System.out.println("O indice: "+i+" com valor de "+num[i]+" � par e divisivel por 3.");
			}
		}
		

	}

}
