import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		// vetor que recebe a soma de A e B na posição I
		int[] c = new int[n];
		
		// valor que esta na posição i do vetor A + valor que esta na posição i do vetor b.
		for (int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
		}
		
		for (int i=0; i<n; i++) {
			System.out.print(c[i] + " ");
		}
		
		
		sc.close();
	}

}
