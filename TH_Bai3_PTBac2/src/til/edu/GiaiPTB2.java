package til.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtc;
	private JTextField txtKetQua;
	private JTextField txtb;
	private JTextField txta;

	
	public GiaiPTB2() {
		setTitle("Giải Phương Trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbla = new JLabel("Nhập hệ số a:");
		lbla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbla.setBounds(10, 67, 118, 26);
		contentPane.add(lbla);
		
		JLabel lbb = new JLabel("Nhập hệ số b:");
		lbb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbb.setBounds(10, 103, 118, 26);
		contentPane.add(lbb);
		
		JLabel lblc = new JLabel("Nhập hệ số c:");
		lblc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblc.setBounds(10, 153, 118, 26);
		contentPane.add(lblc);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(154, 155, 242, 26);
		contentPane.add(txtc);
		
		JLabel lblNhpHS_1_1 = new JLabel("Kết quả:");
		lblNhpHS_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNhpHS_1_1.setBounds(10, 309, 118, 26);
		contentPane.add(lblNhpHS_1_1);
		
		txtKetQua = new JTextField();
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(154, 263, 242, 115);
		contentPane.add(txtKetQua);
		
		JButton btnGiai = new JButton("Giải Phương Trình");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyKetQua();
			}
		});
		btnGiai.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnGiai.setBounds(175, 211, 185, 42);
		contentPane.add(btnGiai);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(154, 105, 242, 26);
		contentPane.add(txtb);
		
		txta = new JTextField();
		txta.setColumns(10);
		txta.setBounds(154, 66, 242, 26);
		contentPane.add(txta);
	}
	void XuLyKetQua() {
		String str_SoA= txta.getText();
		String str_SoB= txtb.getText();
		String str_SoC= txtc.getText();
		
		double soA = Double.parseDouble(str_SoA);
		double soB = Double.parseDouble(str_SoB);
		double soC = Double.parseDouble(str_SoC);
		
		double delta = soB *soB - 4 *soA * soC;
		if(delta <0) {
			txtKetQua.setText(String.valueOf("Phương Trinh vô nghiệm"));
		}else if(delta ==0) {
			double x =-soB/(2*soA);
			txtKetQua.setText(String.valueOf("Phương trình có nghiệm kép x1 = x2 = "+x));
		}else {
			double sqrtDelta = Math.sqrt(delta);
			double x1 =(-soB + sqrtDelta) / (2*soA);
			double x2 =(-soB - sqrtDelta) / (2*soA);
			txtKetQua.setText(String.valueOf("Phương trình có 2 nghiệm phân biệt là: x1= " +x1 +" x2= " +x2));
		}
	}
}
