package br.com.blaze.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.blaze.enums.Rank;

public class BetsView extends JFrame {

	private static final long serialVersionUID = 1L;
	Scanner read = new Scanner(System.in);
	private JPanel contentPane;
	private JTextField txtNumber;
	private JLabel question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BetsView frame = new BetsView();
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
	public BetsView() {
		Player player = new Player(1, "Eduardo", 2000.00, Rank.PRO, LocalDate.of(2022, 07, 24));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 364);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenuItem menuItemProfile = new JMenuItem("Profile");
		menuItemProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfileView pv = new ProfileView();
				pv.setVisible(true);
				pv.isVisible();
				pv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}

		});

		menuBar.add(menuItemProfile);

		JMenuItem menuItemDeposit = new JMenuItem("Deposit");
		menuItemDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositView dv = new DepositView();
				dv.setVisible(true);
				dv.isVisible();
				dv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

			}

		});
		menuBar.add(menuItemDeposit);

		JMenuItem menuItemWithdraw = new JMenuItem("Withdraw");
		menuItemWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawView wv = new WithdrawView();
				wv.setVisible(true);
				wv.isVisible();
				wv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		menuBar.add(menuItemWithdraw);

		JMenuItem menuItemHelp = new JMenuItem("Help");
		menuBar.add(menuItemHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label labelBalance = new Label("BALANCE = $" + player.getBalance().toString());
		labelBalance.setBounds(10, 264, 127, 22);
		labelBalance.setBackground(Color.GRAY);
		labelBalance.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(labelBalance);

		JLabel lblNewLabel = new JLabel("Player name: " + player.getName());
		lblNewLabel.setBounds(10, 11, 150, 14);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);

		JLabel lblRank = new JLabel("Rank: " + player.getRank().toString());
		lblRank.setBounds(195, 12, 105, 14);
		lblRank.setForeground(Color.WHITE);
		lblRank.setFont(new Font("Arial Black", Font.BOLD, 11));
		contentPane.add(lblRank);

		JRadioButton radioBtnPlaying = new JRadioButton("Playing");
		radioBtnPlaying.setBounds(317, 7, 73, 23);
		contentPane.add(radioBtnPlaying);

		JRadioButton radioBtnOffline = new JRadioButton("Offline");
		radioBtnOffline.setBounds(408, 8, 73, 23);
		contentPane.add(radioBtnOffline);

		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 471, 250);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblQuestion = new JLabel("Bet on a number!");
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblQuestion.setBounds(138, 11, 177, 23);
		panel.add(lblQuestion);

		txtNumber = new JTextField();
		txtNumber.setBounds(176, 91, 102, 35);
		panel.add(txtNumber);
		txtNumber.setColumns(10);

		JButton btnBet = new JButton("Bet");
		btnBet.setBounds(176, 137, 102, 23);
		panel.add(btnBet);

		question = new JLabel("");
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(176, 45, 102, 14);
		panel.add(question);

		JLabel lblResultQuestion = new JLabel("");
		lblResultQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultQuestion.setBounds(82, 183, 298, 14);
		panel.add(lblResultQuestion);

		btnBet.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Random random = new Random();
				String txt = txtNumber.getText();
				int number = Integer.parseInt(txt);

				int generate = random.nextInt(number - 10, number + 11);
				try {
					if (generate == number) {
						lblResultQuestion.setText("System rolled " + generate + " YOU WIN! +$50USD");
						lblResultQuestion.setForeground(Color.GREEN);
						Thread.sleep(250);

					} else {
						lblResultQuestion.setText("System rolled " + generate + " YOU LOSE! -$2USD");
						lblResultQuestion.setForeground(Color.RED);
						Thread.sleep(250);

					}
				} catch (InterruptedException err) {
					err.printStackTrace();
				}

			}

		});

	}
}
