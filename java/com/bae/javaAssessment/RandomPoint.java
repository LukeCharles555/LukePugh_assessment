package com.bae.javaAssessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPoint {

	static int x;
	static int y;
	static Random rand = new Random();
	static Random rand2 = new Random();
	
	public static double randPoint() {
		List<Integer> endPointCoords = new ArrayList<Integer>();
		x = rand.nextInt(20);
		y = rand2.nextInt(20);
		endPointCoords.add(x);
		endPointCoords.add(y);
		double dist = Math.hypot(x, y);
		return dist;
	}
	

	public static double getX() {
		return x;
	}

	public static void setX(int x) {
		RandomPoint.x = x;
	}

	public static double getY() {
		return y;
	}

	public static void setY(int y) {
		RandomPoint.y = y;
	}
	
}
	
		
	

