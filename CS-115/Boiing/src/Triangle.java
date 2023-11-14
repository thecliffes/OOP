import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends ClosedShape {

	private int width, height;
	
	protected Triangle(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);
		this.width = width;
		this.height = height;
	}

	public void draw(GraphicsContext g) {
		g.setFill (colour);
		g.setStroke( colour );
		if (isFilled) {
			g.fillPolygon(new double[] {(double) x, (double) x + getWidth(), (double) x + getWidth()/2}, new double[] {(double) y, (double) y, (double) y - getHeight()}, 3);
		} 
		else {
			g.strokePolygon(new double[] {(double) x, (double) x + getWidth(), (double) x + getWidth()/2}, new double[] {(double) y, (double) y, (double) y - getHeight()}, 3);
		}
	}
	
	public String toString () {
    	String result = "This is a triangle\n";
    	result += super.toString ();
	result += "Its width is " + this.width + " and its height is " + this.height + "\n";
    	return result;
    }
	
	public double[] getXCoords () {
		double[] xCoord = {(double) x, (double) x + getWidth(), (double) x + getWidth()/2};
		return xCoord;
	}
	
	public double[] getYCoords () {
		double[] yCoord = {(double) y, (double) y, (double) y + getHeight()};
		return yCoord;
	}

	public void setWidth (int width) {
		this.width = width;
	}

 	/**
 	 * @param height Resets the height.
 	 */
 	public void setHeight (int height) {
		this.height = height;
	}

 	/**
 	 * @return The width of the oval.
 	 */
 	public int getWidth() {
		return width;
	}

 	/**
 	 * @return The height of the oval.
 	 */
 	public int getHeight() {
		return height;
	}
}
