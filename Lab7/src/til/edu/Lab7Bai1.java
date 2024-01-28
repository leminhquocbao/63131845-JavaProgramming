/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
class ChuNhat{
	double rong,dai;
	ChuNhat(double dai,double rong){
		this.dai=dai;
		this.rong=rong;
	}
	double getChuVi() {
		return (this.dai + this.rong) *2;
	}
	double getDienTich() {
		return this.dai * this.rong;
	}
	void xuat() {
		System.out.println("Chiều dài: "+ this.dai + "Chiều rộng: " +this.rong);
		System.out.println("Diện tích: " + getChuVi()+"Diện tích: "+getDienTich());
	}
}
class Vuong extends ChuNhat{
	Vuong(double canh){
		super(canh,canh);
	}
	@Override
	void xuat() {
		System.out.println("Cạnh: " + this.dai);
		System.out.println("Diện tích: "+ getDienTich()+"Chu vi: "+getChuVi());
	}
}
public class Lab7Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật");
		double dai = scanner.nextDouble();
		double rong = scanner.nextDouble();
		ChuNhat cn = new ChuNhat(dai,rong);
		System.out.println("Nhập cạnh hình vuông: ");
		double canh = scanner.nextDouble();
		ChuNhat vu = new Vuong(canh);
		cn.xuat();
		vu.xuat();
		scanner.close();
	}

}
