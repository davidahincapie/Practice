/**
 * @author David
 *
 */
public class Main {

	public static void main(String[] args) {
		int maxSpeed = RaceCar.getMaxSpeedForAll();
		int raceLength = 1000;
		
		RaceCar andretti = new RaceCar(60,"Andretti");
		
		andretti.setSpeed(100);
		
	
		//andretti.getMaxSpeedForAll(); 
		// not good practice dont call static with name of an object
		//its misleading makes you think something is happening to an object when it isnt
		//call static by using the class
		//objects are not used to call static methods classes are

		while(andretti.getLocation()<raceLength){
			System.out.println(andretti + "is in first place!");
		}//end of while
		
	}//end of main

}//end of Main class
