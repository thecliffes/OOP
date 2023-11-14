import java.util.Scanner;

public class CoordSystem2 {
	static double[][] coordArray = {{81.3, 33.47},{-18.14, 12.85},{85.53, 88.51},{43.11, 68.76},{-26.5, -78.84},{-1.46, 74.22},{-4.69, 82.13},{-30.9, -84.95},{-88.62, -78.23},{42.96, -70.21},{-16.28, 40.57},{-12.02, 35.25},{76.23, -69.44},{-33.02, 20.14},{-65.51, -31.04},{69.3, 39.75},{-60.43, -74.43},{-82.72, 68.44},{-32.82, -75.75},{54.48, 83.93},{69.25, 2.96},{24.93, 77.46},{-67.14, 4.72},{69.79, 44.43},{-40.64, -80.2},{6.01, 31.2},{7.31, 46.5},{76.14, -45.43},{71.88, -84.77},{-38.9, 7.6},{45.19, -64.13},{-74.59, -34.1},{59.65, -9.18},{-42.94, 46.49},{7.23, -23.89},{59.6, -36.37},{-87.69, 60.21},{-12.55, 77.91},{-71.76, -50.6},{-55.23, -54.09},{53.32, 73.17},{-57.79, 35.6},{-86.86, -66.25},{84.7, -29.16}};
	public static void main(String[] args){
		process();
	}
	
	
	public static void process() {
		int R = 6371;
		double result = 0;
		for (int i = 0; i < (coordArray.length - 1); i++) {
			double latDistance = Math.toRadians(coordArray[i+1][0] - coordArray[i][0]);
			double lonDistance = Math.toRadians(coordArray[i+1][1] - coordArray[i][1]);
			double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)+ Math.cos(Math.toRadians(coordArray[i][0])) * Math.cos(Math.toRadians(coordArray[i+1][0]))* Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
			double c = 2 * Math.asin(Math.sqrt(a));
			result += c * R;
		}
		System.out.println(result);
	}
	
}
