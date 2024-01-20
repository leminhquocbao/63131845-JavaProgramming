/**
 * 
 */
package Til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập a: ");
		double a= scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.print("Phương trình có vô số nghiệm");
			}
			else {
				System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			double x= -b/a;
			System.out.printf("Nghiệm của phương trình bậc 1: %.2f",x);
		}

	}

}
