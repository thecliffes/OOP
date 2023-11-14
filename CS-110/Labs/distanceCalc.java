import java.util.Scanner;

public class distanceCalc {
	public static void main(String[] args){
		
		double serviceInterval_car1 = 15000.0;
		double kmPerLitre_car1 = 20.0;
		double serviceCost_car1 = 100.0;
		double fuelCostPerLitre_car1 = 1.1;
		double carCost_car1 = 12000;
		
		double serviceInterval_car2 = 25000.0;
		double kmPerLitre_car2 = 35.0;
		double serviceCost_car2 = 200.0;
		double fuelCostPerLitre_car2 = 1.4;
		double carCost_car2 = 18000.0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("How far will you travel");
		double distanceTravelled = in.nextDouble();
		
		double serviceTotalCost_car1 = ((distanceTravelled / serviceInterval_car1) * serviceCost_car1);
		double fuelTotalCost_car1 = ((distanceTravelled / kmPerLitre_car1) * fuelCostPerLitre_car1);
		double car1Total = (carCost_car1 + serviceTotalCost_car1 + fuelTotalCost_car1);
		
		double serviceTotalCost_car2 = ((distanceTravelled / serviceInterval_car2) * serviceCost_car2);
		double fuelTotalCost_car2 = ((distanceTravelled / kmPerLitre_car2) * fuelCostPerLitre_car2);
		double car2Total = (carCost_car2 + serviceTotalCost_car2 + fuelTotalCost_car2);
		
		System.out.println("The total cost of car 1 is " + car1Total + " after travlling " + (int)distanceTravelled + "km");
		System.out.println("The total cost of car 2 is " + car2Total + " after travlling " + (int)distanceTravelled + "km");
		 
	}
}