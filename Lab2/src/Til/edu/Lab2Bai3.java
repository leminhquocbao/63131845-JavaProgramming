/**
 * 
 */
package Til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
