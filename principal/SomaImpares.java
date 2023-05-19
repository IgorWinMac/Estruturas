package principal;

public class SomaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int soma = 0;

		for(i = 1; i <= 25; i++) {
			if(i%2!=0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println();
		System.out.println("A soma dos número impares é: "+soma);
	}

}
