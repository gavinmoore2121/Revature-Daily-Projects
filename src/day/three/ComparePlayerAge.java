package day.three;

import java.util.Comparator;

public class ComparePlayerAge implements Comparator<Player> {


	@Override
	public int compare(Player o1, Player o2) {
		if (o1.age > o2.age) return 1;
		else if (o1.age < o2.age) return -1;
		return 0;
	}

}
