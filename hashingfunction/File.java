package hashingfunction;

import java.io.BufferedReader;
import java.io.FileReader;

public class File {
	int[] intArray;
	String[] stringArray;

	public int[] integerFileReader() {
		try {
			String intFile = new String();
			FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\integer.txt");
			BufferedReader bufferReader = new BufferedReader(file);
			String string;

			while ((string = bufferReader.readLine()) != null) {
				intFile += string;
			}

			stringArray = intFile.split(",");
			intArray = new int[stringArray.length];

			for (int i = 0; i < intArray.length; i++) {
				try {
					intArray[i] = Integer.parseInt(stringArray[i]);
				} catch (NumberFormatException e) {
					System.out.println(e);
				}
			}
		} catch (Exception obj) {
			System.out.println("e");
		}
		return intArray;
	}
}
