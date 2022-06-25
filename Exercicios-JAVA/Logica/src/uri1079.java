import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtde = sc.nextInt();
		
		// valores do peso para o calculo
		int a = 2;
		int b = 3;
		int c = 5;
		
		for (int i=0; i<qtde; i++) {
			double a1 = sc.nextDouble();
			double b1 = sc.nextDouble();
			double c1 = sc.nextDouble();
			
			double MEDIA = (double) ((a * a1) + (b * b1) + (c * c1)) / (a + b + c);
			
			System.out.printf("%.1f%n", MEDIA);
			
		}
		
		
		
		sc.close();
	}

}
