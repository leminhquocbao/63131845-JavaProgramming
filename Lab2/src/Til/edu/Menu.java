/**
 * 
 */
package Til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			menu();
			int chon = scanner.nextInt();
			switch(chon) {
			case 1:
				PTbac1();
				break;
			case 2:
				PTbac2();
				break;
			case 3:	
				TienDien();
				break;
			case 4:
				System.out.println("Kết thúc chương trình. Cảm ơn bạn đã sử dụng!");
				System.exit(0);
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
			}
			
		}
		
	}
	 public static void menu() {
	        System.out.println("\n+---------------------------------------------------+");
	        System.out.println("1. Giải phương trình bậc nhất");
	        System.out.println("2. Giải phương trình bậc 2");
	        System.out.println("3. Tính tiền điện");
	        System.out.println("4. Kết thúc");
	        System.out.println("+---------------------------------------------------+");
	        System.out.print("Chọn chức năng: ");
	    }
	public static void PTbac1() {
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
	public static void PTbac2() {
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
	public static void TienDien() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số điện tháng này: ");
		double soDien = scanner.nextDouble();
		
		if(soDien >=0 && soDien <=50) {
			double Tien = soDien*1000;
			System.out.printf("Số tiền phải trả là : %.2f", Tien);
		}
		else if(soDien> 50) {
			double Tien = (soDien-50)*1200 + 50*1000;
			System.out.printf("Số tiền phải trả là : %.2f", Tien);
		}
		else {
			System.out.print("Số điện phải dương chứ không được âm");
		}
	}
}
