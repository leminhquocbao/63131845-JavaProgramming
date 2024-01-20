/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập canh a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập cạnh b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập cạnh c: ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b, 2)-4*a*c;
		double canDelta = Math.sqrt(delta);
		
		System.out.printf("Delta = %.2f\n", delta);
        System.out.printf("Căn delta = %.2f\n", canDelta);
	}

}
