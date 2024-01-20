/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 System.out.print("Nhập chiều dài: ");
	        double dai = scanner.nextDouble();
	     System.out.print("Nhập chiều rộng: ");
	        double rong = scanner.nextDouble();
	        
	      double chuvi=(dai+rong)*2;
	      
	      double dientich= dai * rong;
	      
	      double canhNho = Math.min(dai,rong);
	     System.out.printf("Chu vi : %.2f", chuvi); 
	     System.out.printf("Chu vi : %.2f", dientich); 
	     System.out.printf("Chu vi : %.2f", canhNho); 
	     
	}

}
