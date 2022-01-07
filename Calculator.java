package calculator_app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JFormattedTextField;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {
	private JTextField txtJtextfield;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JLabel lblNewLabel;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void disable() {
		txtJtextfield.setEnabled(false);
		
		rdbtnNewRadioButton.setEnabled(true);
		rdbtnNewRadioButton_1.setEnabled(false);
		
		btnNewButton.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		button.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
	}
	
	public void enable() {
		txtJtextfield.setEnabled(true);
		
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton_1.setEnabled(true);
		
		btnNewButton.setEnabled(true);
		btnNewButton_1.setEnabled(true);
		button.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		button_7.setEnabled(true);
		button_8.setEnabled(true);
		button_9.setEnabled(true);
		button_10.setEnabled(true);
		button_11.setEnabled(true);
		button_12.setEnabled(true);
		button_13.setEnabled(true);
		button_14.setEnabled(true);
		button_15.setEnabled(true);
	}
	
	double num,ans;
	int calculation;
	
	public void arithmetic_operation() {
		switch(calculation) {
			
		case 1: //addition
			ans = num + Double.parseDouble(txtJtextfield.getText());
			txtJtextfield.setText(Double.toString(ans));
			break;
			
		case 2: //subtraction
			ans = num - Double.parseDouble(txtJtextfield.getText());
			txtJtextfield.setText(Double.toString(ans));
			break;
			
		case 3: //multiplication
			ans = num * Double.parseDouble(txtJtextfield.getText());
			txtJtextfield.setText(Double.toString(ans));
			break;
			
		case 4: //division
			ans = num / Double.parseDouble(txtJtextfield.getText());
			txtJtextfield.setText(Double.toString(ans));
			break;
		
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setLocation(new Point(500, 250));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 324);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtJtextfield = new JTextField();
		txtJtextfield.setEditable(false);
		txtJtextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJtextfield.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtJtextfield.setBounds(6, 23, 283, 46);
		contentPane.add(txtJtextfield);
		txtJtextfield.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("ON");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(6, 70, 55, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(false); //on button
		
		rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable();
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(6, 91, 55, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length=txtJtextfield.getText().length();
				int number=txtJtextfield.getText().length() - 1;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder(txtJtextfield.getText());
					back.deleteCharAt(number);
					store=back.toString();
					txtJtextfield.setText(store);
				}
			}
		});
		btnNewButton.setBounds(67, 68, 80, 38);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(167, 70, 55, 38);
		contentPane.add(btnNewButton_1);
		
		button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtJtextfield.getText());
				calculation =1;
				txtJtextfield.setText("");
				lblNewLabel.setText(num + "+");
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(234, 70, 55, 38);
		contentPane.add(button);
		
		button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "7");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(16, 116, 55, 38);
		contentPane.add(button_1);
		
		button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "8");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(92, 116, 55, 38);
		contentPane.add(button_2);
		
		button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "9");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(167, 116, 55, 38);
		contentPane.add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "4");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(16, 166, 55, 38);
		contentPane.add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "5");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(92, 166, 55, 38);
		contentPane.add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "6");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(167, 166, 55, 38);
		contentPane.add(button_6);
		
		button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "1");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(16, 216, 55, 38);
		contentPane.add(button_7);
		
		button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "2");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(92, 216, 55, 38);
		contentPane.add(button_8);
		
		button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "3");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(167, 216, 55, 38);
		contentPane.add(button_9);
		
		button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtJtextfield.getText());
				calculation =2;
				txtJtextfield.setText("");
				lblNewLabel.setText(num + "-");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(234, 116, 55, 38);
		contentPane.add(button_10);
		
		button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtJtextfield.getText());
				calculation =3;
				txtJtextfield.setText("");
				lblNewLabel.setText(num + "*");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(234, 166, 55, 38);
		contentPane.add(button_11);
		
		button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtJtextfield.getText());
				calculation =4;
				txtJtextfield.setText("");
				lblNewLabel.setText(num + "/");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(234, 216, 55, 38);
		contentPane.add(button_12);
		
		button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + "0");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(16, 265, 55, 38);
		contentPane.add(button_13);
		
		button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(txtJtextfield.getText() + ".");
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(92, 265, 55, 38);
		contentPane.add(button_14);
		
		button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				lblNewLabel.setText("");
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(167, 265, 122, 38);
		contentPane.add(button_15);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(185, 6, 93, 16);
		contentPane.add(lblNewLabel);
	}
}
