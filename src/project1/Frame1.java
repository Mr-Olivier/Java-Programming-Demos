package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frame;
	private JLabel IbiMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ADD = new JButton("Show Message");
		ADD.setForeground(Color.BLUE);
		ADD.setBackground(Color.LIGHT_GRAY);
		ADD.setFont(new Font("Tahoma", Font.BOLD, 20));
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null,"Hi, I'm Olivier");
				IbiMessage.setText("Hi, YouTube........");
			}
		});
		ADD.setBounds(302, 247, 187, 70);
		frame.getContentPane().add(ADD);
		
		IbiMessage = new JLabel("Name");
		IbiMessage.setBounds(104, 125, 217, 47);
		frame.getContentPane().add(IbiMessage);
	}
}
