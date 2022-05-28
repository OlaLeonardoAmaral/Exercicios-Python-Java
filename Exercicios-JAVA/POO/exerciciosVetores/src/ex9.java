import java.util.Locale;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] produto = new String[n];
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];
		
		for (int i=0; i<n; i++) {
			produto[i] = sc.next();
			precoCompra[i] = sc.nextDouble();;
			precoVenda[i] = sc.nextDouble();
		}
		
		
		
		// quantidade de lucros em porcentagem
		int menorDez = 0;
		int entreDezEVinte = 0;
		int acimaVinte = 0;
		
		for (int i=0; i<n; i++) {
			
			double lucro = precoVenda[i] - precoCompra[i]; 
			double porcentagem = lucro / precoCompra[i] * 100.00;
		
			
			if (porcentagem < 10.0) {
				menorDez++;
			} 
			else if (porcentagem >= 10.0 && porcentagem <= 20.0) {
				entreDezEVinte++;
			}
			else {
				acimaVinte++;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + menorDez);
		System.out.println("Lucro entre 10% e 20%: " + entreDezEVinte);
		System.out.println("Lucro acima de 20%: " + acimaVinte);
		
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		
		for (int i=0; i<n; i++) {
			totalCompra = totalCompra + precoCompra[i];
			totalVenda = totalVenda + precoVenda[i];
		}
		
		double totalLucro = totalVenda - totalCompra;
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		
		
		sc.close();
	}

}
