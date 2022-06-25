import java.util.Scanner;

public class uri1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		
		
		// contagem ordem crescente
		while (x != 0) {
			for (int i=1; i<=x; i++) {
				
				// print do ultimo numero
				if (i == x) {
					System.out.println(i);
				}
				// primeiros numeros
				else {
					System.out.print(i + " ");
				}
			}
			
			x = sc.nextInt();
		}
		
		
		sc.close();

	}

}
