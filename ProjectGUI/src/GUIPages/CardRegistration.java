package GUIPages;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import CurrentClient.CurrentAccount;
import cardManagement.CardAdder;

public class CardRegistration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardRegistration window = new CardRegistration();
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
	public CardRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(163, 55, 261, 20);
		frame.getContentPane().add(formattedTextField);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(21, 58, 63, 14);
		frame.getContentPane().add(lblCardNumber);
		
		JSpinner monthSpinner = new JSpinner();
		monthSpinner.setBounds(197, 109, 36, 20);
		frame.getContentPane().add(monthSpinner);
		
		JSpinner yearSpinner = new JSpinner();
		yearSpinner.setBounds(253, 109, 56, 20);
		frame.getContentPane().add(yearSpinner);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date");
		lblExpirationDate.setBounds(21, 112, 102, 14);
		frame.getContentPane().add(lblExpirationDate);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(163, 162, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnExit = new JButton("Back");
		btnExit.setBounds(163, 200, 89, 23);
		frame.getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindowClient.main(new String[0]);
				
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardAdder adder = new CardAdder();
				
				adder.addCard(formattedTextField.getText(), monthSpinner.getValue() +" "+yearSpinner.getValue() );
				
			}
		});
		
		JLabel lblCardregistration = new JLabel("Card Registration");
		lblCardregistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardregistration.setBounds(163, 21, 89, 14);
		frame.getContentPane().add(lblCardregistration);
	}
}
