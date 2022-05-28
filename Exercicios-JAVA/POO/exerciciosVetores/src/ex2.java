import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		// QUANTIDADE DE NUMERO PARES
		int soma = 0;
		// PEGAR APENAS NUMAROS PARES DO VETOR
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				soma++;
			}
		}
		
		System.out.println( );
		System.out.println(soma);
		
		sc.close();
	}

}
