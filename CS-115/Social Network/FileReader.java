import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	
	public BST readProfileSet(String filename) throws FileNotFoundException {
		BST bt = new BST();
		ArrayList<String> nodes = new ArrayList<String>();
		readFile(filename, nodes);
		for(int i = 0;i<nodes.size();i++) {
			bt.addProfile(lineFormat(nodes.get(i)));
		}
		return bt;
	}
	
	public Profile lineFormat(String line) {
		String[] splited = line.split(",");
		String Intrests[] = splited[6].split(";");
		String Activities[] = splited[7].split(";");
		
		Profile p = new Profile(splited[1], splited[0], Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), splited[5], Intrests, Activities);
		return p;
	}
	
	public ArrayList<String> readFile(String filename, ArrayList<String> array) throws FileNotFoundException {
		File inputFile = new File (filename);
		Scanner in = null;
		try {
			in = new Scanner (inputFile);
		}
		catch (FileNotFoundException e) {
			System.out.println ("Cannot open " + filename);
			System.exit (0);
		}
		while(in.hasNext()) {
			array.add(readLine(in));
		}
		in.close();
		return array;
	}
	
	public String readLine(Scanner in) {
		String returnVal = "";
		if(in.hasNextLine()) {
			returnVal = in.nextLine();
		} else {
			returnVal = null;
		}
		return returnVal;
	}
	
}

