/**
 * 
 */
package Til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập a: ");
		double a= scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b= scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.print("Phương trình bậc 1 có vô số nghiệm");
			}
			else {
				System.out.print("Phương trình bậc 1 vô nghiệm");
			}
		}
		else if(a!=0) {
			double delta = Math.pow(b, 2)-4*a*c;
			if(delta <0) {
				System.out.print("Phương trình vô nghiệm");
			}
			else if(delta==0) {
				double x= -b/(2*a);
				System.out.printf("Phương trình có 1 nghiệm: %.2f",x);
			}
			else {
				double X1 = (-b+Math.sqrt(delta))/(2*a);
				double X2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt: %.2f \t %.2f",X1,X2);
				
			}
		}
		else {
			double f= -b/a;
			System.out.printf("Nghiệm của phương trình bậc 1: %.2f",f);
		}
	}

}
