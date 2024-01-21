/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập bảng cửu chương");
		int n = scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d=%d\n",n,i,n*i);
		}
		
	}

}
