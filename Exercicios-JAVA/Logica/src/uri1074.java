import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdeValores = sc.nextInt();
		
		for (int i=1; i<=qtdeValores; i++) {
			int numero = sc.nextInt();
			if (numero > 0 && numero % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			}
			else if (numero < 0 && numero % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			}
			else if (numero > 0 && numero % 2 != 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (numero < 0 && numero % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			}
			else {
				System.out.println("NULL");
			}
		}
		
		
		sc.close();

	}

}
