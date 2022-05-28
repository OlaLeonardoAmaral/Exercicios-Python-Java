import java.util.Scanner;

public class uri1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int terceiro = 1;
		
		
		for (int i=1; i<=n; i++) {
			
			segundo = primeiro * primeiro;
			terceiro = primeiro * segundo;
			
			System.out.printf("%s %s %s%n", primeiro, segundo, terceiro);
			
			segundo++;
			terceiro++;
			
			System.out.printf("%s %s %s%n", primeiro, segundo, terceiro);
			
			primeiro++;
		}
		
		
		sc.close();

	}

}
