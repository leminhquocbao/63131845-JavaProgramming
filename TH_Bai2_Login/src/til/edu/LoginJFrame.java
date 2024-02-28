package til.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDangNhap;
	private JPasswordField txtMatKhau;

	
	public LoginJFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 47, 147, 34);
		lblNewLabel.setEnabled(false);
		contentPane.add(lblNewLabel);
		
		JLabel lblngNhp = new JLabel("Mật khẩu: ");
		lblngNhp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblngNhp.setEnabled(false);
		lblngNhp.setBounds(10, 118, 147, 34);
		contentPane.add(lblngNhp);
		
		txtDangNhap = new JTextField();
		txtDangNhap.setBounds(167, 47, 202, 29);
		contentPane.add(txtDangNhap);
		txtDangNhap.setColumns(10);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDangNhap.setBounds(187, 183, 118, 34);
		contentPane.add(btnDangNhap);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(167, 118, 202, 29);
		contentPane.add(txtMatKhau);
	}
	void XuLyDangNhap() {
		String strTen = txtDangNhap.getText();
		String strMK = txtMatKhau.getText();
		
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			HomeJFrame homePage = new HomeJFrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}else {
			txtDangNhap.setText("");
			txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
