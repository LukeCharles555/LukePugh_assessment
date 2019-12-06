package com.bae.javaAssessment;

public class WinCondition {

	boolean result = true;
	
	public boolean winCondition() {
		if (RandomPoint.randPoint() < 1) {
			System.out.println("Well done! You see an old box sitting on the ground. You open it up to find... TREASURE! You win.");
			return result;
		} else {
			result = false;
			return result;
		}
	}
}
