import java.text.DecimalFormat;

public class SolarSystem{
	private String name;
	private double luminosity;
	private String message = "";
	
	/*
	public static void main(String[] args){
		SolarSystem ourSystem = new SolarSystem("Our System", 1.0);
		ourSystem.addPlanet("Mercury", 0.06, 0.38, 0.39);
        ourSystem.addPlanet("Venus", 0.82, 0.95, 0.72);
        ourSystem.addPlanet("Earth", 1.0, 1.0, 1.0);
        ourSystem.addPlanet("Mars", 0.10, 0.52, 1.52);
        ourSystem.addPlanet("Jupiter", 317.83, 10.97, 5.20);
        ourSystem.addPlanet("Saturn", 95.2, 9.140, 9.58);
        ourSystem.addPlanet("Uranus", 14.5, 3.98, 19.20);
        ourSystem.addPlanet("Neptune", 17.1, 3.87, 30.05);
		System.out.println(ourSystem.toString());
	}
	*/
	
	public String toString() {
		return getName() + " has luminosity: " + getLuminosity() + "\n" + getMessage();
	}
	
	public void addPlanet(String name, double mass, double radius, double distance) {
		String habitability = "no";
		double luminosityFactor = Math.sqrt(luminosity);
		if(0.75*luminosityFactor <= distance && distance <= 2.0*luminosityFactor) {
			if(0.6 <= mass && mass <= 7.0) {
				habitability = "yes";
			}
		}
		setMessage(getMessage() + name + " has a mass of " + mass  
				+ " Earths with a surface garvity of " + Math.round(((mass/(radius*radius)))*1000)/1000.0 + "g" 
				+ ", is "+ Math.round(distance*1000)/1000.0 + "AU from its stars, "
				+ "and orbits in " + Math.round((Math.sqrt(distance*distance*distance))*1000)/1000.0   
				+ " years: could it be habitable? " + habitability + "\n");
		
	}
	
	public SolarSystem(String Name, double Luminosity) {
		setName(Name);
		setLuminosity(Luminosity);
	}
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void setLuminosity(double Luminosity) {
		luminosity = Luminosity;
	}
	
	public void setMessage(String Message) {
		message = Message;
	}
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
