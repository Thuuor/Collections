import java.util.*;

public class Freq {

	public static void main(String[] args) {

		Map<String,Integer> m = new HashMap<String, Integer>();
		for (String s: args) {
			Integer freq = m.get(s);
			m.put(s, freq == null ? 1 : freq + 1 );
			
			/*if (freq == null) {
				m.put(s, 1);
			} else {
				m.put(s, freq + 1);
			}*/
		}
		System.out.println(m);
	}

}
