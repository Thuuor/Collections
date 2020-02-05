
public class Player implements Comparable<Player>{

	private String name;
	private int strength;
	
	public Player(String name,int strength) {
		this.name = name;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return name + "(" + strength + ")";
	}

	public int compareTo(Player p) {

		return strength - p.strength;
	}
	
}
