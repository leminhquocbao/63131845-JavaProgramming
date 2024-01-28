/**
 * 
 */
package til.edu;
import java.util.*;

/**
 * 
 */

abstract class SinhVienPoli{
	String hoTen,nganh;
	SinhVienPoli(String hoTen,String nganh){
		this.hoTen=hoTen;
		this.nganh=nganh;
	}
	
	  abstract double getDiem();
	
	String getHocLuc() {
		 double diem = getDiem();
	        if (diem < 5) {
	            return "Yếu";
	        } else if (diem < 6.5) {
	            return "Trung bình";
	        } else if (diem < 7.5) {
	            return "Khá";
	        } else if (diem < 9) {
	            return "Giỏi";
	        } else {
	            return "Xuất sắc";
	        }
	}
	 void xuat() {
	        System.out.println("Họ tên: " + this.hoTen + ", Ngành: " + this.nganh);
	        System.out.println("Điểm: " + getDiem() + ", Học lực: " + getHocLuc());
	    }
}
class SinhVienIT extends SinhVienPoli{
	double diemJava,diemCss,diemHtml;
	SinhVienIT(String hoTen, String nganh,double diemJava,double diemCss,double diemHtml){
		super(hoTen,nganh);
		this.diemJava=diemJava;
		this.diemCss = diemCss;
        this.diemHtml = diemHtml;
	}
	
	@Override
	double getDiem() {
		return(2*this.diemJava + this.diemCss + this.diemHtml)/4;
	}
}
class SinhVienBiz extends SinhVienPoli{
	double diemMarketing,diemSales;
	SinhVienBiz(String hoTen,String nganh, double diemMarketing, double diemSales){
		super(hoTen,nganh);
		 this.diemMarketing = diemMarketing;
	        this.diemSales = diemSales;
	}
	@Override
	double getDiem() {
		return(2*this.diemMarketing + this.diemSales)/3;
	}
}
public class Lab7Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập họ tên, ngành và diểm Java,Css,Html của sinh viên IT:");
		String hoTenIT = scanner.nextLine();
        String nganhIT = scanner.nextLine();
        double diemJava = scanner.nextDouble();
        double diemCss = scanner.nextDouble();
        double diemHtml = scanner.nextDouble();
        SinhVienIT svIT =new SinhVienIT(hoTenIT,nganhIT,diemJava,diemCss,diemHtml);
        scanner.nextLine();
        System.out.println("Nhập họ tên, ngành và điểm Marketing,Sales của sinh viên Biz");
        String hoTenBiz = scanner.nextLine();
        String nganhBiz = scanner.nextLine();
        double diemMarketing = scanner.nextDouble();
        double diemSales = scanner.nextDouble();
        SinhVienBiz svBiz = new SinhVienBiz(hoTenBiz, nganhBiz, diemMarketing, diemSales);
        svIT.xuat();
        svBiz.xuat();

        scanner.close();
	}

}
