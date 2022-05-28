import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i=0; i<n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		
		int maior = 0;
		int posicao = 0;
		// Achar a maior idade e a posição
		for (int i=0; i<n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posicao++;
			} 
		}
		
		System.out.println("Pessoa mais velha: " + nomes[posicao]);
		
		
		sc.close();
	}

}
