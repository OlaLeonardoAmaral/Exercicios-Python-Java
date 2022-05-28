import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 1;

		
		for (int i=1; i<=n; i++){
			
		    for (int j=1; j<=3; j++){
		    	System.out.print(cont + " ");
		    	cont++;
		    }
		    cont++;
		    
		    System.out.println("PUM");
		
		}
		
		sc.close();

	}

}
