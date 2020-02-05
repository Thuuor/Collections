import java.io.*;
import java.util.*;

public class SortFile {

	public static void main(String[] args) throws IOException{
		
		if (args.length == 0) {
			System.err.println("Usage: SortFile <fileName>");
			System.exit(1);
		}
		sortFile(args[0]);
	}

	private static void sortFile(String fileName) throws IOException {
		File inputFile = new File(fileName);
		File outputFile = new File("temp.txt");
		
		BufferedReader input = null;
		PrintWriter output = null;
		
		try {
			input = new BufferedReader(new FileReader(inputFile));
			output = new PrintWriter(new FileWriter(outputFile));
		
			List<String> list = new ArrayList<String>();
			String line;
			while((line = input.readLine()) != null) {
				list.add(line);
			}
			Collections.sort(list);
			for (String s: list) {
				output.print(s);
			}
			
			outputFile.renameTo(inputFile);
		} finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}
	}

}
