package day.three;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerComparisonsDemo {

	public static void main(String[] args) {
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player(1, 30, "Player One"));
		playerList.add(new Player(2, 28, "Player Two"));

		// Sort via compareTo
		Collections.sort(playerList);
		for(Player player: playerList) {
			System.out.println(player);
		}
		System.out.println();
		
		// Sort via Comparator
		Collections.sort(playerList, new ComparePlayerAge());
		for(Player player: playerList) {
			System.out.println(player);
		}
	}

}
