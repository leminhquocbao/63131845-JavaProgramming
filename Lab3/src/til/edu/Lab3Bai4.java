/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên");
		int n = scanner.nextInt();
		
		scanner.nextLine();
		String[] tenSV= new String[n];
		double[] DiemSV= new double[n];
		System.out.print("Nhập họ và tên và điểm của sinh viên");
		for(int i=0;i<n;i++) {
			System.out.println("\nSinh viên " +(i+1)+ ":");
			tenSV[i]=scanner.nextLine();
			DiemSV[i]=scanner.nextDouble();
			scanner.nextLine();
		}
		for(int i=0;i<n;i++) {
			String HocLuc;
			if(DiemSV[i] <5 ) {
				HocLuc = "Yếu";
			}
			else if(DiemSV[i]<6.5) {
				HocLuc="Trung Bình";
			}
			else if(DiemSV[i] <7.5) {
				HocLuc="Khá";
			}else if(DiemSV[i] <9) {
				HocLuc= "Giỏi";
			}else {
				HocLuc="Xuất sắc";
			}
			System.out.println("Họ tên: "+tenSV[i]);
			System.out.println("Điểm của sinh viên: "+DiemSV[i]);
			System.out.println("Học lực: "+HocLuc);
			
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(DiemSV[i]>DiemSV[j]) {
					double tempDiem=DiemSV[i];
					DiemSV[i]=DiemSV[j];
					DiemSV[j]=tempDiem;
					
					String tempTen=tenSV[i];
					tenSV[i]=tenSV[j];
					tenSV[j]=tempTen;
				}
			}
		}
		System.out.print("Danh sách sinh viên sau khi đã sắp xếp");
		for(int i=0;i<n;i++) {
			System.out.println("\nHọ tên: " + tenSV[i]);
            System.out.println("Điểm: " + DiemSV[i]);
		}
		
	}

}
