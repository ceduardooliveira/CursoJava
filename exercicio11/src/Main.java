import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				
		
		int codigoProduto = sc.nextInt();
		int quantidadeProduto = sc.nextInt();
		double total;
		
		if(codigoProduto == 1) {			
			total = quantidadeProduto * 4.00;
		}
		else if(codigoProduto == 2) {			
			total = quantidadeProduto * 4.50;
		}
		else if(codigoProduto == 3) {			
			total = quantidadeProduto * 5.00;
		}
		else if (codigoProduto == 4) {
			total = quantidadeProduto * 2.00;
		}
		else {
			total = quantidadeProduto * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);		
		sc.close();

	}
}
