package br.com.blaze.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DepositView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlayerId;
	private JTextField txtQuantity;
	private JTextField txtCaptcha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositView frame = new DepositView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepositView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayerId = new JLabel("Deposit your money!");
		lblPlayerId.setForeground(Color.WHITE);
		lblPlayerId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlayerId.setBounds(106, 0, 247, 80);
		contentPane.add(lblPlayerId);
		
		JLabel lblNewLabel_1 = new JLabel("Player id:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(106, 79, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setBounds(106, 122, 57, 14);
		contentPane.add(lblQuantity);
		
		JLabel lblCaptcha = new JLabel("Captcha");
		lblCaptcha.setForeground(Color.WHITE);
		lblCaptcha.setBounds(106, 168, 62, 14);
		contentPane.add(lblCaptcha);
		
		txtPlayerId = new JTextField();
		txtPlayerId.setBounds(173, 76, 86, 20);
		contentPane.add(txtPlayerId);
		txtPlayerId.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(173, 119, 86, 20);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		txtCaptcha = new JTextField();
		txtCaptcha.setBounds(173, 165, 86, 20);
		contentPane.add(txtCaptcha);
		txtCaptcha.setColumns(10);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(170, 214, 89, 23);
		contentPane.add(btnDeposit);
	}

}
