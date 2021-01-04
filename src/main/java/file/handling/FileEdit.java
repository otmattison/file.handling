package file.handling;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileEdit {
	String filePath = "src/main/resources/SampleText";
	String filePath2 = "src/main/resources/copy";
	File file = new File(filePath);

	public void Append() throws IOException {

		String textToAdd = "appended text to file";

		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
		writer.write(textToAdd);
		writer.close();

	}

	public void Write() throws IOException {

		String textToWrite = "overwritten file";

		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2));
		writer.write(textToWrite);
		writer.close();

	}

}
