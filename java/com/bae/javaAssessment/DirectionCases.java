package com.bae.javaAssessment;

public class DirectionCases {

	static NESW playerDirection(String direction) {
		NESW playerDirection = null;
		switch (direction) {
		case "NORTH":
			playerDirection = NESW.NORTH;
			break;
		case "EAST":
			playerDirection = NESW.EAST;
			break;
		case "SOUTH":
			playerDirection = NESW.SOUTH;
			break;
		case "WEST":
			playerDirection = NESW.WEST;
			break;
		}
		return playerDirection;
	}
}
