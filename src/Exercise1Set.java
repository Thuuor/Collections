import java.util.*;

public class Exercise1Set {

	public static void main(String[] args) {

		String[] s = new String[10];
		
		s[0] = "Uno";
		s[1] = "Dos";
		s[2] = "Tres";
		s[3] = "Dos";
		s[4] = "Uno";
		s[5] = "Seis";
		s[6] = "Siete";
		s[7] = "Uno";
		s[8] = "Dos";
		s[9] = "Diez";
		
		printNoDuplicate(s);
		System.out.println("------------------");
		printDuplicate(s);
		
	}

	public static void printSet(Set<Integer> s) {
		for (Integer i: s) {
			System.out.println(i);
		}
	}
	
	public static Set<Integer> increment(Set<Integer> s){
		Set<Integer> snew = new HashSet<Integer>();
		
		for (Integer i: s) {
			snew.add(i + 1);
		}
		
		return snew;
	}
	
	public static void printNoDuplicate(String[] s) {
		
		List<String> listString = Arrays.asList(s);

		Set<String> n = new HashSet<String>(listString);
		
		for (String i: n) {
			System.out.println(i);
		}
		
	}
	
	public static void printDuplicate(String[] array) {
		Set<String> set = new HashSet<String>();
		Set<String> duplicates = new HashSet<String>();
		
		for (String s: array) {
			if (!set.add(s)) {
				duplicates.add(s);
			}
		}
		for (String s: duplicates) {
			System.out.println(s);
		}
	}
	
	public static <E> Set<E> intersection(Set<E> s1, Set<E> s2){
		
		Set<E> intersection = new HashSet<E>(s1);
		intersection.retainAll(s2);
		return intersection;

	}
}
