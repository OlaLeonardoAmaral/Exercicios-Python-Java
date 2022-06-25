import java.util.Scanner;

public class uri1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int cont = 0;
		
		
		for (int i=1; i<=y; i++) {
			
			cont = cont + 1;	
			
			if (cont == x) {
				System.out.printf("%s%n", i);
				cont = cont - x;
			}
			else {
				System.out.print("" + i + " ");
			
			}
		}
				
		sc.close();

	}

}
