
public class aula3_3 {
/*Declare uma variável do tipo Real (Wrapper) e de a ela o nome de ValorNaoPrimitivo e
 *atribua a ela um valor qualquer do tipo do tipo primitivo, fazendo o boxing 
 *manualmente. Crie um segunda variável de um tipo real com o nome de ValorPrimitivo 
 *e atribua a ela o valor da variável valorNaoPrimitivo fazendo o unboxing manual.
 */

	public static void main(String[] args) {
		Double valorNaoPrimitivo = Double.valueOf(6865.5465);
		double valorPrimitivo = valorNaoPrimitivo.doubleValue();
		System.out.println(valorPrimitivo);
		
		

	}

}
