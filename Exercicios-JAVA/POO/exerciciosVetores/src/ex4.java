import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		// soma de todos os numeros que esta armazenado no vetor
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = soma + vet[i];
		}
		
		double media = soma / n;
		System.out.printf("%.3f%n", media);
		
		
		// valores abaixo da media 
		for (int i=0; i<n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
