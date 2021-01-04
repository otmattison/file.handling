package file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.out.println("Hello World");

		String filePath = "src/main/resources/SampleText";
		File file = new File(filePath);
		Scanner scan = new Scanner(file);

		// System.out.println(scan.nextLine());
		System.out.println("---------original file-------------");
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

		System.out.println("---------original file^-------------");

		Path fromFile = Paths.get("src/main/resources/SampleText");
		Path toFile = Paths.get("src/main/resources/copy");

		Files.copy(fromFile, toFile);
		String copyFile = "src/main/resources/copy";
		File copy = new File(copyFile);
		FileEdit s = new FileEdit();
		s.Append();

		Scanner scanner2 = new Scanner(copy);

		System.out.println("---------re-open sample text-------------");
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

		s.Write();

		System.out.println("---------check copy.txt in project directory-------------");
		/*while (scanner2.hasNextLine()) {
			System.out.println(scan.nextLine());
		}*/

	}
}
