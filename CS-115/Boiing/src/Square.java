import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends ClosedShape {

	private int width;
	
	public Square(int insertionTime, int x, int y, int vx, int vy, int width, Color colour, boolean isFilled) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);
		this.width = width;
	}

	public void draw(GraphicsContext g) {
		g.setFill (colour);
		g.setStroke( colour );
		if (isFilled) {
			g.fillRect( x, y, width, width);
		} 
		else {
			g.strokeRect( x, y, width, width );
		}
	}
	
	public String toString () {
    	String result = "This is a square\n";
    	result += super.toString ();
	result += "Its side is " + this.width + "\n";
    	return result;
    }

	public void setWidth (int width) {
		this.width = width;
	}


 	/**
 	 * @return The width of the oval.
 	 */
 	public int getWidth() {
		return width;
	}
 	
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
