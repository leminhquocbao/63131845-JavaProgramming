/**
 * 
 */
package til.edu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 */
public class Lab5Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
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
				xuat(list);
				break;
			case 3:
				ngaunhien(list);
				break;
			case 4:
				sapxep(list);
				break;
			case 5:
				xoa(list,scanner);
				break;
			case 6:
				System.out.print("Kết thúc chương trình");
				return;
			default:
				System.out.print("Lựa chọn không hợp lệ. vưi lòng chọn từ 1 đến 6");
			}
		}
	}
	public static void menu() {
	    System.out.println("1. Nhập danh sách họ và tên");
        System.out.println("2. Xuất danh sách vừa nhập");
        System.out.println("3. Xuất danh sách ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
        System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
        System.out.println("6. Kết thúc");
        System.out.print("Lựa chọn của bạn: ");
	}
	public static void nhap(ArrayList<String> list,Scanner scanner) {
		System.out.print("Nhập họ và tên");
		String name= scanner.nextLine();
		list.add(name);
	}
	public static void xuat(ArrayList<String> list) {
		System.out.println("Danh sách họ và tên");
		for(String name : list) {
			System.out.println(name);
		}
	}
	public static void sapxep(ArrayList<String> list) {
		Collections.sort(list,Collections.reverseOrder());
		xuat(list);
	}
	public static void ngaunhien(ArrayList<String> list) {
		Collections.shuffle(list);
		xuat(list);
	}
	public static void xoa(ArrayList<String> list,Scanner scanner) {
		System.out.print("Nhập họ và tên cần xóa");
		String name = scanner.nextLine();
		if(list.remove(name)) {
			System.out.print("Đã xóa " + name + " ra khỏi danh sách");
		}else {
			System.out.print("Không tìm thấy " + name + " trong danh sách");
		}
	}

}
