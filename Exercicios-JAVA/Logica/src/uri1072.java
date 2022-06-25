import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdeVezes = sc.nextInt();
		int intervalo = 0;
		int out = 0;
		
		
		for (int i=1; i<=qtdeVezes; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				intervalo += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(intervalo + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
