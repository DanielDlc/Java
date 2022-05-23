package vetor;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Daniel", "Rodrigo", "Leandro"};
		
		System.out.println("Teste usando for normal");

		for (int i = 0 ; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------");
		
		System.out.println("Testando usando for each");

		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
