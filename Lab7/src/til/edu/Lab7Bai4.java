/**
 * 
 */
package til.edu;
import java.util.*;

/**
 * 
 */
abstract class SinhVienPol{
	String hoTen,nganh;
	SinhVienPol(String hoTen,String nganh){
		this.hoTen=hoTen;
		this.nganh=nganh;
	}
	abstract double getDiem();
	
	 String getHocLuc() {
	        double diem = getDiem();
	        if (diem < 5) {
	            return "Yếu";
	        } else if (diem < 6.5) {
	            return "Trung bình";
	        } else if (diem < 7.5) {
	            return "Khá";
	        } else if (diem < 9) {
	            return "Giỏi";
	        } else {
	            return "Xuất sắc";
	        }
	    }
	 void xuat() {
		 System.out.println("Họ tên: "+this.hoTen+",Ngành: " + this.nganh);
		 System.out.println("Điểm: "+getDiem()+",Học Lục: " + getHocLuc());
	 }
}
class SinhVienITt extends SinhVienPol {
    double diemJava, diemCss, diemHtml;

    SinhVienITt(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem() {
        return (2 * this.diemJava + this.diemCss + this.diemHtml) / 4;
    }
}

class SinhVienBizz extends SinhVienPol {
    double diemMarketing, diemSales;

    SinhVienBizz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * this.diemMarketing + this.diemSales) / 3;
    }
}

public class Lab7Bai4 {

	/**
	 * @param args
	 */
	static List<SinhVienPol> sinhvienList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.println("Chọn chức năng: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
            case 1:
            	nhap();
            	break;
            case 2:
            	xuat();
            	break;
            case 3:
            	SVGioi();
            	break;
            case 4:
            	SapXep();
            	break;
            case 5:
            	System.out.println("Kết thcú chương trình");
            	break;
            default:
            	System.out.println("Chỉ nhập từ 1 đến 5");
            	break;
            }
		}while(choice != 5);
            scanner.close();
	}
	static void nhap() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhập số lượng sinh viên");
		int n= scanner.nextInt();
		for(int i =0;i<n;i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
			System.out.println("CHọn ngành 1 là IT, 2 là Biz");
			int choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhập họ tên: ");
			String hoTen= scanner.nextLine();
			if(choice == 1) {
				System.out.println("Nhập diểm Java: ");
				double diemJava= scanner.nextDouble();
				System.out.println("Nhập điểm CSS: ");
                double diemCss = scanner.nextDouble();
                System.out.println("Nhập điểm HTML: ");
                double diemHtml = scanner.nextDouble();
                sinhvienList.add(new SinhVienITt(hoTen,"IT",diemJava,diemCss,diemHtml));
			}else if(choice == 2) {
				System.out.println("Nhập điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.println("Nhập điểm Sales: ");
                double diemSales = scanner.nextDouble();
                sinhvienList.add(new SinhVienBizz(hoTen, "Biz", diemMarketing, diemSales));
			}
		}
	}
	static void xuat() {
		for(SinhVienPol sv : sinhvienList) {
			sv.xuat();
		}
	}
	static void SVGioi() {
		for(SinhVienPol sv : sinhvienList) {
			if(sv.getHocLuc().equals("Giỏi")) {
				sv.xuat();
			}
		}
	}
	static void SapXep() {
		Collections.sort(sinhvienList,new Comparator<SinhVienPol>() {
			@Override
			public int compare(SinhVienPol sv1,SinhVienPol sv2) {
				if(sv1.getDiem() > sv2.getDiem()) {
					return -1;
				}else {
					if((sv1.getDiem() == sv2.getDiem())) {
						return 0;
					}else {
						return 1;
					}
				}
			}
		});
	}
}
