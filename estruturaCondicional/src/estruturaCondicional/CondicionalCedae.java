package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalCedae {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// áquas do Rio (calculo por m³) 
		int metroCubico = sc.nextInt();
		double conta = 150.0;
		
		if(metroCubico > 15) {
			conta += (metroCubico - 15) * 44.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}

}
