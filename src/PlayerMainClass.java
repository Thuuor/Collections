import java.util.*;

public class PlayerMainClass {

	public static void main(String[] args) {

		Queue<Player> queue = new PriorityQueue<Player>();
		queue.add(new Player("Patrick", 60));
		queue.add(new Player("Victor", 100));
		queue.add(new Player("José", 40));
		queue.add(new Player("Roberto", 80));
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
