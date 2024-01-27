/**
 * 
 */
package til.edu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 */
public class Lab5Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			menu();
			int choice = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				nhap(list,scanner);
				break;
			case 2:
				sapxep(list);
				break;
			case 3:
				xoa(list,scanner);
				break;
			case 4:
				xuatGTB(list);
				break;
			case 5:
				System.out.print("Kết thúc chương trình");
				return;
			default:
				System.out.print("Vui lòng chỉ nhập từ 1 đến 5");
			}
		}
	}
	public static void menu() {
		System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.print("Lựa chọn của bạn: ");
	}
	public static void nhap(ArrayList<SanPham> list,Scanner scanner) {
		System.out.print("Nhập tên sản phẩm: ");
		String ten= scanner.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		Double donGia= scanner.nextDouble();
		list.add(new SanPham(ten,donGia));
	}
	public static void sapxep(ArrayList<SanPham> list) {
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham o1,SanPham o2) {
				return o2.donGia.compareTo(o1.donGia);
			}
		};
		Collections.sort(list,comp);
		xuat(list);
	}
	public static void xoa(ArrayList<SanPham> list,Scanner scanner) {
		System.out.print("Nhập tên sản phẩm cần xóa");
		String ten = scanner.nextLine();
		list.removeIf(sp -> sp.ten.equals(ten));
	}
	public static void xuatGTB(ArrayList<SanPham> list) {
		double sum =0;
		for(SanPham sp : list) {
			sum +=sp.donGia;
		}
		double avg= sum / list.size();
		System.out.print("Giá trung bình của các sản phẩm: " + avg);
	}
	public static void xuat(ArrayList<SanPham> list) {
		System.out.println("Danh sách sản phẩm: ");
		for(SanPham sp : list) {
			System.out.println("Tên: " + sp.ten+", Đơn giá:  "+sp.donGia);
		}
	}
}
class SanPham {
    String ten;
    Double donGia;

    SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }
}