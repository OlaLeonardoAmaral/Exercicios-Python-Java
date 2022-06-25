import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtde = sc.nextInt();
		
		for (int i=0; i<qtde; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double calc = (double) x / y;
				System.out.printf("%.1f%n", calc);
			}
		}
		
		
		sc.close();

	}

}
