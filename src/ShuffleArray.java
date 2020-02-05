import java.util.*;

public class ShuffleArray {

	public static void main(String[] args) {
		String[] sArray = {"Milan","London","San Francisco","Tokyo","New Delhi"};
		shuffleArray(sArray);
		for (String s: sArray) {
			System.out.println(s);
		}
	}

	public static <E> void shuffleArray(E[] array) {
		List<E>list = Arrays.asList(array);
		Collections.shuffle(list);
		list.toArray();
	}

}
