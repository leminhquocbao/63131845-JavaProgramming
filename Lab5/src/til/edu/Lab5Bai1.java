/**
 * 
 */
package til.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class Lab5Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		ArrayList<Double> list= new ArrayList<>();
		
		double sum =0;
		while(true) {
			System.out.print("Nhập số thực: ");
			Double x= scanner.nextDouble();
			list.add(x);
			sum+=x;
			scanner.nextLine();
			System.out.print("Nhập thêm không: Nhập Y nếu tiếp tục và N nếu dừng lại");
			if(scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.print("Danh sách số thực vừa nhập:");
		for(Double num : list) {
			System.out.println(num);
		}
		System.out.println("Tổng của danh sách : " + sum);
	}

}
