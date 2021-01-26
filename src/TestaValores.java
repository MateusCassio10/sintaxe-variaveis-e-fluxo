
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		System.out.println(segundo);
		primeiro = 10;// nao altera o valor do segundo, que continua sendo 5
		
		System.out.println(segundo);
		 

	}

}
