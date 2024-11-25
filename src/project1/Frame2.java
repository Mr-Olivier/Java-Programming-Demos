package project1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Frame2 {

	private JFrame frame;
	private JTextField T1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/RockerImage.png"));
		label.setIcon(img);
		label.setBounds(213, 16, 231, 261);
		frame.getContentPane().add(label);
		
		JLabel L1 = new JLabel("Username:");
		L1.setFont(new Font("Tahoma", Font.BOLD, 14));
		L1.setBounds(149, 288, 93, 14);
		frame.getContentPane().add(L1);
		
		T1 = new JTextField();
		T1.setBounds(239, 287, 198, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L2 = new JLabel("Password:");
		L2.setFont(new Font("Tahoma", Font.BOLD, 14));
		L2.setBounds(149, 333, 93, 14);
		frame.getContentPane().add(L2);
		
		P1 = new JPasswordField();
		P1.setBounds(239, 332, 198, 20);
		frame.getContentPane().add(P1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(299, 396, 144, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton B1 = new JButton("SignIn");
		B1.setFont(new Font("Tahoma", Font.BOLD, 13));
		B1.setBounds(153, 396, 89, 23);
		frame.getContentPane().add(B1);
		
		frame.setVisible(true);
		frame.getContentPane().add(L1);
		
	}
}
