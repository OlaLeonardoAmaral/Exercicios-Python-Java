import java.util.Scanner;

public class uri1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int soma = 0;
		
		
		// caso m ou n seja <= 0 o sistema finaliza 
		while (!(m <= 0 || n <= 0)) {
			
			// pegar o menor numero e contar até o maior
			if (m > n) {
				for (int i = n; i <= m; i++) {
					System.out.print(i + " ");
					soma = soma + i;
				}
				System.out.println("Sum=" + soma);
			} 
			
			else if (n > m) {
				for (int i = m; i <= n; i++) {
					System.out.print(i + " ");
					soma = soma + i;
				}
				System.out.println("Sum=" + soma);
			}
			soma = 0;
			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();

	}

}
