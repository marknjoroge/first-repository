package karis;

public class FootballTeam {
	private String tName;
	private int wins, losers;
	
	FootballTeam(String tName, int wins, int losers) {
		this.tName = tName;
		this.wins = wins;
		this.losers = losers;
	}
	
	FootballTeam(String tName) {
		this.tName = tName;
		this.losers = 0;
		this.wins = 0;
	}
	
	public String getStoff() {
		return (tName);
	}
	
	protected void incWins() {
		wins++;
	}
	
	protected void incLosers() {
		losers++;
	}
	
	public void goodRecord() {
		if(wins > losers) {
			System.out.println("good results");
		}
	}
	
	public static void main(String args[]) {
		FootballTeam mmust = new FootballTeam("MMUST", 3, 5);
		mmust.goodRecord();

		int i = 0;
		while(i < 3) {
			mmust.incWins();
			i++;
		}
		mmust.goodRecord();
	}
}
