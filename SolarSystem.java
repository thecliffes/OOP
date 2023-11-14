/*
SPECIFIC FEEDBACK
>Named all the varaiables appropriatly to make sure they were as helpful as possible
>Made sure that all indentations were correct 
>put comments talking about block code before the code

RUBIC CUBE FEEDBACK
For identifiers in CW1 i got level 2 so to ensure i get level 3 this time all variables are named
appropriatly and clearly

For comments in CW2 i got level 2 so to ensure i get level 3 for this CW i have tried comments
everything necessary and not do it excessivly 
*/
public class SolarSystem{
	private String name; //holds name of solar system
	private double luminosity; //holds luminosity of star of solar system
	private String message = ""; //holds message which will be returned in toString() 
	
	//method to return the message which will be output to user
	public String toString() {
		return getName() + " has luminosity: " + getLuminosity() + "\n" + getMessage();
	}
	
	//method to take input values and use them to create output message
	public void addPlanet(String name, double mass, double radius, double distance) {
		String habitability = "no"; //string to output if planet is habitable
		double luminosityFactor = Math.sqrt(luminosity); 
		//constants
		final double smallluminositymultiplier = 0.75;
		final double largeluminositymultiplier = 2.0;
		final double smallmass = 0.6;
		final double largemass = 7.0;
		//if statement to test if planet is habitable
		if (smallluminositymultiplier * luminosityFactor <= distance 
		    && distance <= largeluminositymultiplier * luminosityFactor) { 
			if (smallmass <= mass && mass <= largemass) {
				habitability = "yes";
			}
		}
		//constants
		final int integerthousand = 1000;
		final double doublethousand = 1000.0;
		//message to be displayed to user by combining old message with data of new planet
		setMessage(getMessage() + name + " has a mass of " + mass  
				+ " Earths with a surface gravity of " 
				+ Math.round(((mass/(radius*radius)))*integerthousand)/doublethousand + "g" 
				+ ", is "+ Math.round(distance*integerthousand)/doublethousand + "AU from its star, "
				+ "and orbits in " 
				+ Math.round((Math.sqrt(distance*distance*distance))*integerthousand)/doublethousand  
				+ " years: could be habitable? " + habitability + "\n");
		
	}
	
	//constructor
	public SolarSystem(String name, double luminosity) {
		setName(name);
		setLuminosity(luminosity);
	}
	
	//setName sets the name
	public void setName(String name1) {
		name = name1;
	}
	
	//setLuminosity sets the luminosity
	public void setLuminosity(double luminosity1) {
		luminosity = luminosity1;
	}
	
	//setMessage sets the message
	public void setMessage(String message1) {
		message = message1;
	}
	
	//get methods
	public String getMessage() {
		return message;
	}
	
	public String getName() {
		return name;
	}
	
	public double getLuminosity() {
		return luminosity;
	}
}
