/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
abstract class SinhVienPoly{
	String hoTen, nganh;
	SinhVienPoly(String hoTen, String nganh){
		this.hoTen= hoTen;
		this.nganh=nganh;
	}
	abstract double getDiem();
	String getHocLuc() {
		double diem = getDiem();
		if(diem <5) {
			return "Yếu";
		}else if(diem <6.5) {
			return "Trung bình";
		}else if(diem<7.5) {
			return "Khá";
		}else if(diem <9) {
			return "Giỏi";
		}else {
			return "Xuất sắc";
		}
	}
	void xuat() {
		System.out.println("Họ tên: " + this.hoTen+", Ngành: "+this.nganh);
		System.out.println("Điểm: "+ getDiem()+",Học lực: "+getHocLuc());
	}
}
class SinhVienCNTT extends SinhVienPoly{
	double diemJava;
	SinhVienCNTT(String hoTen,String nganh, double diemJava){
		super(hoTen,nganh);
		this.diemJava=diemJava;
	}
	@Override
	double getDiem() {
		return this.diemJava;
	}
}
public class Lab7Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhập họ tên,ngành và điểm java của sinh viên");
		String hoTen= scanner.nextLine();
		String nganh=scanner.nextLine();
		double diemJava=scanner.nextDouble();
		SinhVienPoly sv = new SinhVienCNTT(hoTen, nganh,diemJava);
		sv.xuat();
		scanner.close();
	}

}
