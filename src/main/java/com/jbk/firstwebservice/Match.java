package com.jbk.firstwebservice;

public class Match {
	
	int runs;
	int overs;
	int balls;
	int wicket;
	int player;
	public Match(int runs, int overs, int balls, int wicket, int player) {
		super();
		this.runs = runs;
		this.overs = overs;
		this.balls = balls;
		this.wicket = wicket;
		this.player = player;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	@Override
	public String toString() {
		return "Match [runs=" + runs + ", overs=" + overs + ", balls=" + balls + ", wicket=" + wicket + ", player="
				+ player + "]";
	}
	

}
