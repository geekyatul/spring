package com.spring.ioc.IOC_Assignment2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player {
	
	private String playerId;
	private String playerName;
	
	@Autowired
	private Country country;
	
	public Player() {}

	public Player(String playerId, String playerName, Country country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	};
	
	
	
	
	

}
