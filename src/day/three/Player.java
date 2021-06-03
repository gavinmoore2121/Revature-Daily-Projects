package day.three;

public class Player implements Comparable<Player> {
	int ranking;
	int age;
	String name;
	
	
	/**
	 * @param ranking
	 * @param age
	 * @param name
	 */
	public Player(int ranking, int age, String name) {
		super();
		this.ranking = ranking;
		this.age = age;
		this.name = name;
	}


	@Override
	public int compareTo(Player player) {
		if (this.ranking > player.ranking) {
			return 1;
		}
		else if (this.ranking < player.ranking) {
			return -1;
		}
		else return 0;
	}
	
	@Override
	public String toString() {
		return name + ", age " + age + ", rank " + ranking + ".";
	}
	
}
