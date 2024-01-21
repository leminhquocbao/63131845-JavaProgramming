/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab4Bai1 {

	/**
	 * @param args
	 */
	
		private String tensp;
		private double donGia;
		private double giamGia;
		
		public Lab4Bai1(String tensp,double donGia,double giamGia) {
			this.tensp = tensp;
	        this.donGia = donGia;
	        this.giamGia = giamGia;
		}
		public double thueNK(){
			return donGia *0.1;
		}
		public void Xuat() {
			System.out.println("Tên sản phẩm : "+tensp);
			System.out.println("Giá sản phẩm: "+donGia);
			System.out.println("Giảm giá: "+giamGia);
			 System.out.println("Thuế nhập khẩu: " + thueNK());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        String tensp = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        double donGia = scanner.nextDouble();
        System.out.println("Nhập giảm giá:");
        double giamGia = scanner.nextDouble();
        Lab4Bai1 sp = new Lab4Bai1(tensp, donGia, giamGia);
        sp.Xuat();
	}

}
