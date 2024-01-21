/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
 class SanPham {
	 String TenSP;
	 double GiaSP;
	
	void nhap() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		TenSP=scanner.nextLine();
		System.out.print("Nhập giá sản phẩm");
		GiaSP=scanner.nextDouble();
		
	}
	void xuat() {
		System.out.println("Tên sản phẩm : "+ TenSP);
		System.out.println("Giá sản phẩm: " + GiaSP);
	}
}
public class Lab4Bai2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		
		System.out.println("Nhập thông tin sản phẩm 1: ");
		sp1.nhap();
		System.out.println("Nhập thông tin sản phẩm 2: ");
		sp2.nhap();
		
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat();
	}

}
