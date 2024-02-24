/**
 * 
 */
package stil.edu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 */
public class HelloJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Ví dụ Title");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(500,600);
		f.setLayout(new FlowLayout());
	JButton btnOK=new JButton("Nhấn tôi đi");
	
	btnOK.addActionListener (new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó");
			dialog.setSize(220,120);
			dialog.show();
		}
	});
	
	JButton btnKhac = new JButton("Nhấn em đi");
	
	f.add(btnOK);
	f.add(btnKhac);
	f.show();
	}
	
}
