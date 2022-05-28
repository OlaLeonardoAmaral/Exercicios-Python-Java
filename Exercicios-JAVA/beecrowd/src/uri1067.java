import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		// pega apenas os numeros impares entre x
		for (int i=1; i<=x; i++) {
			System.out.println(i);
			i = i + 1;
		}
		
		
		sc.close();

	}

}
