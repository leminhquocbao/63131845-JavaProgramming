/**
 * 
 */
package stil.edu;
import java.util.*;
/**
 * 
 */
public class Lab8Bai1 {
	public final class XPoly{
		public static double sum(double...x) {
			double sum = 0;
			for(double num : x) {
				sum+=num;
			}
			return sum;
		}
		public static double min(double...x) {
			double min = x[0];
			for(double num: x) {
				if(num<min) {
					min=num;
				}
			}
			return min;
		}
		public static double max(double...x) {
			double max=x[0];
			for(double num :x) {
				if(num>max) {
					max=num;
				}
			}
			return max;
		}
		public static String toUpperFirstChar(String s) {
			String[] words = s.split(" ");
			for(int i=0;i<words.length;i++) {
				char firstChar = words[i].charAt(0);
				String upperFirstChar =String.valueOf(firstChar).toUpperCase();
				words[i]=upperFirstChar+words[i].substring(1);
			}
			return String.join(" ", words);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double[] numbers = new double[5];
		System.out.println("Nhập vào 5 số: ");
		for(int i =0;i<5;i++) {
			System.out.println("Nhập số thứ " + (i+1)+": ");
			numbers[i]=scanner.nextDouble();
		}
	
		double result = XPoly.sum(numbers);
		double resultMin = XPoly.min(numbers);
		double resultMax = XPoly.max(numbers);
		System.out.println("Tổng của các số là: "+result);
		System.out.println("số nhỏ nhất của các số là: "+resultMin);
		System.out.println("số lớn nhất của các số là: "+resultMax);
		scanner.nextLine();
		
		System.out.println("Nhập vào một chuỗi: ");
		String input=scanner.nextLine();
		String resultString = XPoly.toUpperFirstChar(input);
		System.out.print("Chuỗi sau khi chuyển đôi: " + resultString);
	}

}
