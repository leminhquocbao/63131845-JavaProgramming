/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab6Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String hoTen = scanner.nextLine();
		int ChuSoDauTien= hoTen.indexOf(" ");
		int ChuSoCuoi= hoTen.lastIndexOf(" ");
		
		String ho = hoTen.substring(0,ChuSoDauTien).toUpperCase();
		String ten = hoTen.substring(ChuSoCuoi+1).toUpperCase();
		String TenDem= hoTen.substring(ChuSoDauTien + 1,ChuSoCuoi);
		
		System.out.println("Họ: "+ho);
		System.out.println("Tên đệm: "+TenDem);
		System.out.print("Tên: " + ten);
	}
}
