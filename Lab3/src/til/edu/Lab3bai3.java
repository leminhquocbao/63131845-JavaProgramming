/**
 * 
 */
package til.edu;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 */
public class Lab3bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử: ");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Nhập phần tử n: ");
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Mảng sau khi sắp xếp: ");
		
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		 int min = arr[0];
	        for(int i = 1; i < n; i++) {
	            min = Math.min(min, arr[i]);
	        }
		System.out.printf("\nPhần tử nhỏ nhất trong mảng : %d", min);
		int sum =0;
		int count =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%3==0) {
				sum+=arr[i];
				count++;
			}
		}
		if(count>0) {
			double tbc=(double)sum/count;
			System.out.printf("\nTrung bình cộng chia hết cho 3 là : " + tbc);
		}
		else {
			System.out.print("\nKhông có số chia hết cho 3");
		
		}
	}

}
