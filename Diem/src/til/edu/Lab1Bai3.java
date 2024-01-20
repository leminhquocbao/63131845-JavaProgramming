/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Nhập cạnh hình chữ nhật");
		double canh = scanner.nextDouble();
		
		double lapPhuong= Math.pow(canh, 3);
		
		System.out.printf("Hình lập phương: %.2f", lapPhuong);
	}

}
