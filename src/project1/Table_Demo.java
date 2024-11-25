package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Table_Demo {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=-20,-11
	 */
	private final JPanel panel_1 = new JPanel();
	private JTextField id;
	private JTextField name;
	private JTextField contact;
	private JTextField course;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_Demo window = new Table_Demo();
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
	public Table_Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 829, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(37, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(37, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact:");
		lblNewLabel_2.setBounds(37, 75, 51, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Course:");
		lblNewLabel_3.setBounds(37, 100, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(98, 22, 194, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setBounds(98, 47, 194, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(98, 72, 194, 20);
		frame.getContentPane().add(contact);
		contact.setColumns(10);
		
		course = new JTextField();
		course.setBounds(99, 97, 193, 20);
		frame.getContentPane().add(course);
		course.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(309, 23, 445, 477);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				
				if(i>=0)
				{
					id.setText(model.getValueAt(i, 0).toString());
					name.setText(model.getValueAt(i, 1).toString());
					contact.setText(model.getValueAt(i, 2).toString());
					course.setText(model.getValueAt(i, 3).toString());
					JOptionPane.showMessageDialog(null, "Updated Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
			}
		});
		table.setBackground(new Color(240, 248, 255));
		model = new DefaultTableModel();
		Object[] column = {"ID", "Name", "Contact", "Course"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( id.getText().equals("") || name.getText().equals("") || contact.getText().equals("") || course.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				else
				{
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = contact.getText();
					row[3] = course.getText();
					model.addRow(row);
					
					id.setText("");
					name.setText("");
					contact.setText("");
					course.setText("");	
					
					JOptionPane.showMessageDialog(null, "Saved Successfully");
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(37, 297, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow() ;
				//if(i == table.getSelectedRow()) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(name.getText(), i, 1);
					model.setValueAt(contact.getText(), i, 2);
					model.setValueAt(course.getText(), i, 3);
				//} else {
					//JOptionPane.showMessageDialog(null, "Please Select a Row First");
				//}

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(203, 297, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(37, 354, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				name.setText("");
				contact.setText("");
				course.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(203, 354, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
