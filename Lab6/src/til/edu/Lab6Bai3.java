/**
 * 
 */
package til.edu;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 
 */
class SinhVien{
	String hoTen;
	String email;
	String SDT;
	String cmnd;
	
	SinhVien(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		this.hoTen = scanner.nextLine();
		
		while(true) {
			System.out.print("Nhập email: ");
			this.email=scanner.nextLine();
			 if (Pattern.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$", this.email)) {
	                break;
	            } else {
	                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
	            }
		}
		while(true) {
			System.out.print("Nhập số điện thoại: ");
			this.SDT=scanner.nextLine();
			if (Pattern.matches("^0[0-9]{9,10}$", this.SDT)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
		}
		while(true) {
			System.out.print("Nhập CMND: ");
			this.cmnd=scanner.nextLine();
			if (Pattern.matches("^[0-9]{9,12}$", this.cmnd)) {
                break;
            } else {
                System.out.println("CMND không hợp lệ. Vui lòng nhập lại.");
            }
		}
	}
}
public class Lab6Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> list = new ArrayList<>();
		for(int i =0;i<5;i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ":");
			list.add(new SinhVien());
		}
		System.out.println("\nThông tin sinh viên: ");
		for(SinhVien sv : list) {
			System.out.println("Họ tên: " + sv.hoTen);
            System.out.println("Email: " + sv.email);
            System.out.println("Số điện thoại: " + sv.SDT);
            System.out.println("CMND: " + sv.cmnd);
            System.out.println();
		}
	}

}
