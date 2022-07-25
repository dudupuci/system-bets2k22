package br.com.blaze.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.blaze.enums.Rank;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;

public class ProfileView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileView frame = new ProfileView();
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
	public ProfileView() {
		Player player = new Player(1, "Eduardo", 2000.00, Rank.PRO, LocalDate.of(2022, 07, 24));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player ID: "+player.getId());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 185, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player informations");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 58, 185, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name: "+player.getName());
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(10, 95, 104, 14);
		contentPane.add(lblName);
		
		JLabel lblRank = new JLabel("Rank: " +player.getRank());
		lblRank.setForeground(Color.WHITE);
		lblRank.setBounds(10, 120, 104, 14);
		contentPane.add(lblRank);
		
		JLabel lblBalance = new JLabel("Balance: $"+player.getBalance());
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setBounds(10, 145, 120, 14);
		contentPane.add(lblBalance);
		
		JLabel lblPlayingSince = new JLabel("Playing since: "+player.getDateRegister());
		lblPlayingSince.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPlayingSince.setForeground(Color.WHITE);
		lblPlayingSince.setBounds(10, 170, 185, 14);
		contentPane.add(lblPlayingSince);
	}

}
