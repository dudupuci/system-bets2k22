package br.com.blaze.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.blaze.enums.Rank;

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
		Player player = new Player(1, "Eduardo", 2000.00, Rank.PRO, LocalDate.of(2022, 07, 24));
		String words[] = { "blaze", "deposit", "verify", "money", "love", "earn", "cash", "rich" };
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(words));

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
		lblPlayerId.setBounds(116, 0, 247, 67);
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
		txtCaptcha.setText("Type ");
		txtCaptcha.setForeground(Color.LIGHT_GRAY);
		contentPane.add(txtCaptcha);
		txtCaptcha.setColumns(10);

		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(170, 196, 89, 23);
		contentPane.add(btnDeposit);

		JLabel lblResponse = new JLabel("");
		lblResponse.setHorizontalAlignment(SwingConstants.CENTER);
		lblResponse.setForeground(Color.WHITE);
		lblResponse.setBounds(58, 230, 316, 14);
		contentPane.add(lblResponse);

		btnDeposit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Integer id = Integer.parseInt(txtPlayerId.getText());
				double quantity = Double.parseDouble(txtQuantity.getText());

				if (id == player.getId()) {
					lblResponse.setForeground(Color.GREEN);
					lblResponse.setText("Deposited " + quantity + " to player " + player.getName());
				}

			}
		});

	}

}
