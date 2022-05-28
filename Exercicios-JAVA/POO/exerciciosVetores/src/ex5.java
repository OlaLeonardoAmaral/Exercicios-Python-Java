import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		
		int[] vetPares = new int[n];
		double soma = 0.0;
		int contNumerosPares = 0;
		
		// verificar todos os valores pares no vetor VET
		// somar os valores pares dentro do vetor VET
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				vetPares[i] = vet[i];
				soma = soma + vetPares[i];
				contNumerosPares++;
			}
		}
		
		// media de todos os valores pares		
		double media = (double) soma / contNumerosPares;	
		System.out.printf("%.1f%n", media);
				
		sc.close();
	}

}
