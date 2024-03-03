package til.edu;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class Button extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Button() {
		setTitle("FlowLayout");
		setSize(300,	250);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		setResizable(false);	
		setLayout(new FlowLayout());
		for (int i	=	1;	i	<=20;	i++)	{
		add(new JButton("Button	"+i));
		}
	}

}
