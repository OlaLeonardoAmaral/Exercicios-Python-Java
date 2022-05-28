import java.util.Scanner;

public class uri1144_prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
			System.out.printf("%d %d %d%n", i, segundo + 1, terceiro + 1);
		}
		
		sc.close();

	}

}
