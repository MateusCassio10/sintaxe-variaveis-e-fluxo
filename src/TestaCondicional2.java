
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
	
		
		if(idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("voce pode  entrar");
		}else {
			System.out.println("voce nao pode entrar!");
		}
		
	}

}
