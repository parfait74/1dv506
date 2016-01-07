package fs222mh_lab4;

import java.util.Random;

public class RandomWalk {
	private int x;
	private int y;
	private int maxSteps;
	private int currentSteps;
	private int size;
	
	public RandomWalk(int maxSteps, int size) {
		this.maxSteps = maxSteps;
		this.size = size;
		this.currentSteps = 0;
		this.x = 0;
		this.y = 0;
	}
	
	public String toString() {
		String status = "Antal gjorda steg " +currentSteps + ". Position: ("+x+"," +y+").";
		return status;		
	}
	
	public void takeStep() {
		if(moreSteps() && isBounds()) {	//Check if there are more steps to take and the position are within the bounds
			Random randomNumber = new Random();		
			int randomStep = randomNumber.nextInt(100) + 1;		// create random number to decide which way to take a step depending on actual generated number.
			if (randomStep < 25) {
				x = x + 1;
			} else if ( randomStep < 50) {
				x = x- 1;
			} else if ( randomStep < 75){
				y = y +1;
			} else {
				y = y - 1;
			}
			 currentSteps += 1;
		}
	}
	
	public boolean moreSteps() {
		if (currentSteps < maxSteps) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBounds() {
		if( Math.abs(x) <= size && Math.abs(y) <= size) {	//Check absolute number since they can negative as well.
		return true;
		} else {
			return false;
		}
	}
	
	public void walk() {
		while (isBounds() && moreSteps()){
			takeStep();
		}
	}
	
	
}
