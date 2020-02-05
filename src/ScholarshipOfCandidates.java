import java.io.*;
import java.util.*;

public class ScholarshipOfCandidates {

	static class Pair implements Comparable<Pair> {

		public String country;
		public int freq;
		
		public Pair(String country,int freq) {
			this.country = country;
			this.freq = freq;
		}
		
		@Override
		public int compareTo(Pair arg0) {
			if (freq < arg0.freq) {
				return -1;
			} else {
				if (freq > arg0.freq) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		
	}
	
	public static final String NAME_OF_FILE = "Colfuturo-Seleccionados.csv";
	
	public static void main(String[] args) throws IOException {

		Map<String, Integer> map = getMapFromFile();
		List<Pair> list = new ArrayList<Pair>();
		for (String country: map.keySet()) {
			int freq = map.get(country);
			Pair pair = new Pair(country, freq);
			list.add(pair);
		}
		Collections.sort(list);
		
		for (Pair pair: list) {
			System.out.println(pair.country + ", " + pair.freq);
		}
	}

	private static Map<String, Integer> getMapFromFile() throws IOException{
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(
					new FileReader(NAME_OF_FILE));
			String line;
			reader.readLine();
			while ((line = reader.readLine()) != null ) {
				String[] items = line.split(",");
				String country = items[6];
				Integer freq = map.get(country);
				map.put(country, freq == null ? 1 : freq + 1);
			}
			return map;
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
}
