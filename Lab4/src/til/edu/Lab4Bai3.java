/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab4Bai3 {

	/**
	 * @param args
	 */
	private String TenSP;
	private double GiaSP;
	private double GiamGia;
	
	
	private double getThueThuNhap() {
		return 0.1 * GiaSP;
		
	}
	public void nhap1() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		TenSP=scanner.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		GiaSP=scanner.nextDouble();
		System.out.println("Nhập giảm giá sản phẩm: ");
		GiamGia=scanner.nextDouble();
		
	}
	public void xuat1() {
		System.out.println("Tên sản phẩm: "+TenSP);
		System.out.println("Giá sản phẩm : "+GiaSP);
		System.out.println("Giảm giá: "+GiamGia);
		System.out.println("Thuế nhập khẩu: "+getThueThuNhap());
		
	}
	public void nhap2() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		TenSP=scanner.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		GiaSP=scanner.nextDouble();
		
	}
	public void xuat2() {
		System.out.println("Tên sản phẩm: "+TenSP);
		System.out.println("Giá sản phẩm : "+GiaSP);
		System.out.println("Thuế nhập khẩu: "+getThueThuNhap());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4Bai3 sp1 =new Lab4Bai3();
		Lab4Bai3 sp2 = new Lab4Bai3();
		System.out.println("Nhập thông tin sản phẩm 1: ");
		sp1.nhap1();
		System.out.println("Nhập thông tin sản phẩm 2: ");
		sp2.nhap2();
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat1();
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat2();
	}

}
