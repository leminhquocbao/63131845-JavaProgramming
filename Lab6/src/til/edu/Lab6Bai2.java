/**
 * 
 */
package til.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */

public class Lab6Bai2 {
		String tensp;
		double donGia;
		String hang;
		Lab6Bai2(){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập tên sản phẩm: ");
			this.tensp=scanner.nextLine();
			System.out.println("Nhập đơn giá: ");
			this.donGia=scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Nhập tên hàng: ");
			this.hang=scanner.nextLine();
		}
		void xuat() {
			 System.out.println("Tên sản phẩm: " + this.tensp);
		        System.out.println("Đơn giá: " + this.donGia);
		        System.out.println("Hãng: " + this.hang);
		}
		public String getHang() {
	        return hang;
	    }
	/**
	 * @param args
	 */
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Lab6Bai2> list = new ArrayList<>();
		for(int i =0;i<5;i++) {
			System.out.println("Nhập thông tin sản phẩm thứ " + (i+1) + " :");
			list.add(new Lab6Bai2());
		}
		System.out.println("\nSản phẩm của hãng Nokia: ");
		for(Lab6Bai2 sp : list) {
			if(sp.getHang().equalsIgnoreCase("Nokia")) {
				sp.xuat();
				System.out.println("----------------");
			}
		}
	}

}
