package br.com.blaze.views;

import java.time.LocalDate;

import br.com.blaze.enums.Rank;

public class Player {

	private Integer id;
	private String name;
	private Double balance;
	private Rank rankLevel;
	private LocalDate dateRegister;

	public Player() {

	}

	public Player(Integer id, String name, Double balance, Rank rankLevel, LocalDate dateRegister) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.rankLevel = rankLevel;
		this.dateRegister = dateRegister;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateRegister() {
		return dateRegister;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double withdraw(Double amount) {
		double total = 0.0;
		if (amount <= balance) {
			total = balance - amount;
		} else {
			System.out.println("No enough cash!");
		}
		return total;
	}

	public Rank getRank() {
		return rankLevel;
	}

	public void setRank(Rank rankLevel) {
		this.rankLevel = rankLevel;
	}

}
