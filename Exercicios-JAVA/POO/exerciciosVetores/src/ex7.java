import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i=0; i<n; i++) {
			aluno[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		
		// guardar a média de cada aluno
		double[] media = new double[n];

		// aprovados a media >= 6
		for (int i=0; i<n; i++) {
			media[i] = nota1[i] + nota2[i];
		}
		
		// alunos com a media maior ou igual a 6
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			if (media[i] / 2 >= 6.0) {
				System.out.println(aluno[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
