import java.util.Scanner;

public class uri1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// o primeiro valor vai ser considerado o maior
		int maior = sc.nextInt();
		int posicao = 1;
		
		// agora vamos ler o segundo numero atpe o centésimo
		for (int i=2; i<=100; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();

	}

}
