import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int novoGrenal = 1;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		
		while (novoGrenal == 1) {
			novoGrenal += 1;
			int inter = sc.nextInt();
			int gremio = sc.nextInt();
			
			if (inter > gremio) {
				vitoriasInter += 1;
			} 
			else if (inter < gremio) {
				vitoriasGremio += 1;
			} 
			else {
				empates += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();

		}
		
		int total = vitoriasGremio + vitoriasInter + empates; 
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		
		
		sc.close();

	}

}
