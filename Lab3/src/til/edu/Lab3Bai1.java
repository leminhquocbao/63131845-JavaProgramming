/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên");
		int n=scanner.nextInt();
		boolean ok= true;
		for(int i =2;i<n-1;i++) {
			if(n%i==0) {
				ok=false;
				break;
			}
		}
		if(ok) {
			System.out.print(n + " Là số nguyên tố");
		}else {
			System.out.print(n + " Không phải là số nguyên tố");
		}
		
	}

}
