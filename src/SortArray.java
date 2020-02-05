import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		String[] sArray = {"Milan","London","San Francisco","Tokyo","New Delhi"};
		sortArray(sArray);
		for (String s: sArray) {
			System.out.println(s);
		}
	}

	public static <E extends Comparable<E>> void sortArray(E[] array) {
		List<E> list = Arrays.asList(array);
		
		Collections.sort(list);
		list.toArray();
	}

}
