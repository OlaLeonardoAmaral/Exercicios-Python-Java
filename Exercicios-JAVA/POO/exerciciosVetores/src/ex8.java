import java.util.Locale;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] sexo = new char[n];
		
		for (int i=0; i<n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		
		
		double maior = 0.0;
		// maior altura
		for (int i=0; i<n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			} 
		}
		
		double menor = maior;
		// menor altura
		for (int i=0; i<n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		
		double alturaMulheres = 0.0;
		// quantas Mulheres (contF) e quantos Homens (contM) 
		int contF = 0;
		int contM = 0;
		// soma total da altura das mulheres (F)
		for (int i=0; i<n; i++) {
			if (sexo[i] == 'F') {
				alturaMulheres = alturaMulheres + altura[i];
				contF++;
			} else {
				contM++;
			}
		}
		
		double media = (double) alturaMulheres / contF;
	
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + contM);
		
		sc.close();
	}

}
