package br.com.blaze.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.DelayQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(194, 49, 100, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(194, 105, 100, 14);
		contentPane.add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("Password as sent to your email");
		txtPassword.setBounds(156, 130, 127, 20);
		contentPane.add(txtPassword);

		txtUsername = new JTextField();
		txtUsername.setToolTipText("Your username");
		txtUsername.setBounds(156, 74, 127, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		JButton btnLogin = new JButton("Access");
		btnLogin.setToolTipText("Try connect");
		btnLogin.setBounds(177, 171, 89, 23);
		contentPane.add(btnLogin);

		JLabel loginResponse = new JLabel("");
		loginResponse.setForeground(Color.WHITE);
		loginResponse.setBounds(138, 216, 215, 14);
		contentPane.add(loginResponse);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();

				if (username.equals("blaze") & password.equals("101099")) {
					loginResponse.setText("Successfully login!");
					loginResponse.setForeground(Color.GREEN);
					txtUsername.setText("");
					txtPassword.setText("");
					try {
						Thread.sleep(10000000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					BetsView bets = new BetsView();
					bets.setVisible(true);
					bets.isVisible();

				} else {
					loginResponse.setText("Username or password incorrect.");
					loginResponse.setForeground(Color.RED);
				}
			}
		});

	}

}
