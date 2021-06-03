package day.three;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIODemo {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader sampleFileReader = new BufferedReader(new FileReader("src/day/three/SampleTextFile"));

			int charCount = 0;
			String line = sampleFileReader.readLine();
			while (line != null) {
				System.out.println(line);
				charCount += line.length();
				line = sampleFileReader.readLine();
			}
			
			System.out.println("Sample file has " + charCount + " characters.");
			sampleFileReader.close();

		}
		catch (FileNotFoundException e) {
			System.out.print(e);
		}
	}

}
