/**

 * 
 */

package til.edu;
import java.util.Scanner;
/**
 * 
 */

public class Lab1Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = scanner.nextLine();

   
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();

       
        System.out.printf("%s %f điểm", hoTen, diemTB);
	}

}
