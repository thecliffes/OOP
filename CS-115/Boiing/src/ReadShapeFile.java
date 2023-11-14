
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;


public class ReadShapeFile {

	// TODO: You will likely need to write four methods here. One method to
	// construct each shape
	// given the Scanner passed as a parameter. I would suggest static
	// methods in this case.
	
	public static Circle ReadCircle(String circle) {
		String[] splited = circle.split("\\s+");
		Circle circle1 = new Circle(Integer.parseInt(splited[10]), Integer.parseInt(splited[1]), Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[6]), Color.rgb(Integer.parseInt(splited[7]),Integer.parseInt(splited[8]),Integer.parseInt(splited[9])), Boolean.parseBoolean(splited[5]));
		return circle1;
	}
	
	public static Oval ReadOval(String oval) {
		String[] splited = oval.split("\\s+");
		Oval oval1 = new Oval(Integer.parseInt(splited[11]), Integer.parseInt(splited[1]), Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[6]), Integer.parseInt(splited[7]), Color.rgb(Integer.parseInt(splited[8]),Integer.parseInt(splited[9]),Integer.parseInt(splited[10])), Boolean.parseBoolean(splited[5]));
		return oval1;
	}
	
	public static Square ReadSquare(String square) {
		String[] splited = square.split("\\s+");
		Square square1 = new Square(Integer.parseInt(splited[10]), Integer.parseInt(splited[1]), Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[6]), Color.rgb(Integer.parseInt(splited[7]),Integer.parseInt(splited[8]),Integer.parseInt(splited[9])), Boolean.parseBoolean(splited[5]));
		return square1;
	}
	
	public static Rect ReadRect(String rect) {
		String[] splited = rect.split("\\s+");
		Rect rect1 = new Rect(Integer.parseInt(splited[11]), Integer.parseInt(splited[1]), Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[6]), Integer.parseInt(splited[7]), Color.rgb(Integer.parseInt(splited[8]),Integer.parseInt(splited[9]),Integer.parseInt(splited[10])), Boolean.parseBoolean(splited[5]));
		return rect1;
	}
	
	public static Triangle ReadTriangle(String triangle) {
		String[] splited = triangle.split("\\s+");
		Triangle triangle1 = new Triangle(Integer.parseInt(splited[11]), Integer.parseInt(splited[1]), Integer.parseInt(splited[2]), Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[6]), Integer.parseInt(splited[7]), Color.rgb(Integer.parseInt(splited[8]),Integer.parseInt(splited[9]),Integer.parseInt(splited[10])), Boolean.parseBoolean(splited[5]));
		return triangle1;
	}
	
	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readLineByLine(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
		
		while(in.hasNextLine()) {
			if(in.hasNext("circle")) {
				shapeQueue.enqueue(ReadCircle(in.nextLine()));
			}
			else if(in.hasNext("oval")){
				shapeQueue.enqueue(ReadOval(in.nextLine()));
			}
			else if(in.hasNext("square")) {
				shapeQueue.enqueue(ReadSquare(in.nextLine()));
			}
			else if(in.hasNext("rect")) {
				shapeQueue.enqueue(ReadRect(in.nextLine()));
			}
			else if(in.hasNext("triangle")) {
				shapeQueue.enqueue(ReadTriangle(in.nextLine()));
			}
			
		}

		return shapeQueue;
	}
	
	
	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
		File inputFile = new File (filename);
		Scanner in = null;
		try {
			in = new Scanner (inputFile);
		}
		catch (FileNotFoundException e) {
			System.out.println ("Cannot open " + filename);
			System.exit (0);
		}
		return ReadShapeFile.readLineByLine(in);
	}
}
