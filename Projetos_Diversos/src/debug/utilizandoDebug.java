package debug;
import java.util.Scanner;


public class utilizandoDebug {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.println(area);
		System.out.println(preco);
		sc.close();
	}
}
