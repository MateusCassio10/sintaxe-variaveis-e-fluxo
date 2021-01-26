
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condiconais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos! ");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce é menor, mas pode entrar acompanhdo de um maior ");
			} else {
				System.out.println("voce é menor de idade! ");
			}

		}

	}

}
