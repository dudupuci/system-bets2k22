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

public class WithdrawView extends JFrame {

	private JPanel contentPane;
	private JTextField ttxtPlayerId;
	private JTextField txtQuantity;
	private JTextField txtCaptcha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawView frame = new WithdrawView();
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
	public WithdrawView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Withdraw your money!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(95, 11, 278, 56);
		contentPane.add(lblNewLabel);
		
		ttxtPlayerId = new JTextField();
		ttxtPlayerId.setBounds(162, 78, 86, 20);
		contentPane.add(ttxtPlayerId);
		ttxtPlayerId.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(162, 125, 86, 20);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		txtCaptcha = new JTextField();
		txtCaptcha.setBounds(162, 169, 86, 20);
		contentPane.add(txtCaptcha);
		txtCaptcha.setColumns(10);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.setBounds(159, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPlayerId = new JLabel("Player id:");
		lblPlayerId.setForeground(Color.WHITE);
		lblPlayerId.setBounds(95, 81, 57, 14);
		contentPane.add(lblPlayerId);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setBounds(95, 128, 57, 14);
		contentPane.add(lblQuantity);
		
		JLabel lblCaptcha = new JLabel("Captcha:");
		lblCaptcha.setForeground(Color.WHITE);
		lblCaptcha.setBounds(95, 172, 57, 14);
		contentPane.add(lblCaptcha);
	}
}
