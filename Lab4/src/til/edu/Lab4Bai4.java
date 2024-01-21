/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */

public class Lab4Bai4 {
	
		private String TenSP;
		private double GiaSP;
		private double GiamGia;
		
		public Lab4Bai4(String TenSP, double GiaSP, double GiamGia) {
			this.TenSP=TenSP;
			this.GiaSP=GiaSP;
			this.GiamGia=GiamGia;
		}
		public Lab4Bai4(String TenSP, double GiaSP) {
	        this(TenSP, GiaSP, 0);
	    }
		public String getTenSP() {
			return this.TenSP;
		}
		public void getTenSP(String TenSP) {
			this.TenSP=TenSP;
		}
		
		public double getGiaSP() {
			return this.GiaSP;
		}
		public void getGiaSP(double GiaSP) {
			this.GiaSP=GiaSP;
		}
		
		public double getGiamGia() {
			return this.GiamGia;
		}
		public void getGiamGia(double GiamGia) {
			this.GiamGia=GiamGia;
		}
		 private double getThueThuNhap() {
		        return 0.1 * GiaSP;
		    }
		 public void xuat() {
		        System.out.println("Tên sản phẩm: " + getTenSP());
		        System.out.println("Giá sản phẩm: " + getGiaSP());
		        System.out.println("Giảm giá: " + getGiamGia());
		        System.out.println("Thuế thu nhập: " + getThueThuNhap());
		    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4Bai4 sp1 = new Lab4Bai4("Sản phẩm 1", 10000, 500);
		Lab4Bai4 sp2 = new Lab4Bai4("Sản phẩm 2", 20000);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
	}

}
