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

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setTitle("Chương Trình Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel =new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 45, 123, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNhpSTh.setBounds(22, 93, 123, 23);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setBounds(155, 48, 228, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(155, 96, 228, 19);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnCong.setBounds(27, 173, 85, 32);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnTru.setBounds(122, 173, 85, 32);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNhan.setBounds(222, 173, 85, 32);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnChia.setBounds(319, 173, 85, 32);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblKtQuTnh.setBounds(22, 230, 123, 23);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(155, 233, 228, 19);
		contentPane.add(txtKetQua);
	}
	void HamXuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double tong = soA +soB;
		
		txtKetQua.setText(String.valueOf(tong));

	}
	void HamXuLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double tru = soA -soB;
		
		txtKetQua.setText(String.valueOf(tru));
	}
	void HamXuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double nhan = soA * soB;
		
		txtKetQua.setText(String.valueOf(nhan));
	}
	void HamXuLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double chia = soA / soB;
		
		txtKetQua.setText(String.valueOf(chia));
	}
}
