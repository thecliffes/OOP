import java.io.FileNotFoundException;

public class FileReaderMain {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader f = new FileReader();
		
		f.readProfileSet("Users.txt").printAlphabeticalASC();
	}
}
