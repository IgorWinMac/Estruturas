package principal;

public class Lado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i = 1; i <= 25; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(i = 1; i <= 25; i++) {
			if(i%2!=0) {
				System.out.print(i+"-");
			}
		}

	}

}
