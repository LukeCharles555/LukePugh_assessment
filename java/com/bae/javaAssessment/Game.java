package com.bae.javaAssessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	static int x = 0;
	static int y = 0;
	static List<Integer> coords = new ArrayList<Integer>();
	
	
	public static String game() {
		System.out.println("Your magic dial says " + RandomPoint.randPoint());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to go NORTH, EAST, SOUTH or WEST?");
		String direction = scan.nextLine();
		System.out.println("How far would you like to go in that direction in metres?");
		Integer distance = scan.nextInt();
		scan.close();
		NESW playerDirection;
		
		
		
		String resultMessage = "";
		if (direction.equals("NORTH") || direction.equals("EAST") || direction.equals("SOUTH") || direction.equals("WEST")) {
			playerDirection = DirectionCases.playerDirection(direction); 		
			} else {
				resultMessage = "Please provide a valid direction";
				return resultMessage;
			}
		
		if (direction.equals("NORTH")) {
			y = y + distance;
			return "Your position is " + coords;
		} else if (direction.equals("EAST")) {
			x = x + distance;
			return "Your position is " + coords;
		} else if (direction.equals("SOUTH")) {
			y = y - distance;
			return "Your position is " + coords;
		} else if (direction.equals("WEST")) {
			x = x - distance;
			return "Your position is " + coords;
		}
		System.out.println(coords);
		return "Your position is " + coords;
		
		
		
		
			
		
		
		
		
		
	}
}
