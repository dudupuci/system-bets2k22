package br.com.blaze.views;

import br.com.blaze.enums.Rank;

public class Player {

	private Integer id;
	private String name;
	private Double balance;
	private Rank rankLevel;

	public Player() {

	}

	public Player(Integer id, String name, Double balance, Rank rankLevel) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.rankLevel = rankLevel;
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

	
	public Double getBalance() {
		return balance;
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
