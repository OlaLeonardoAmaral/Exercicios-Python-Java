import java.util.Locale;
import java.util.Scanner;

public class uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nTeste = sc.nextInt();
		
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		
		for (int i=1; i<=nTeste; i++) {
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if (tipo == 'C') {
				coelhos = coelhos + quantia;
			} 
			else if (tipo == 'R') {
				ratos = ratos + quantia;
			} 
			else {
				sapos = sapos + quantia;
			}
		}
		
		int total = coelhos + ratos + sapos;
		double porcentagemC = (double) coelhos / total * 100;
		double porcentagemR = (double) ratos / total * 100;
		double porcentagemS = (double) sapos / total * 100;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemC);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemR);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemS);
		
		
		
		sc.close();

	}

}
