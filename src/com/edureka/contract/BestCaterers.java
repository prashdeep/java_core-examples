package com.edureka.contract;

public class BestCaterers implements DinnerContract, CommuteContract {

	@Override
	public String[] starters() {
		return new String[]{"BestCaterers-Starter1", "BestCaterers-Starter2", "BestCaterers-Starter3"};
	}

	@Override
	public String[] mainCourse() {
		return new String[]{"BestCaterers-Main course1", "BestCaterers-Main course2", "BestCaterers-Main course3"};
	}

	@Override
	public String[] desserts() {
		return new String[]{"BestCaterers-Dessert1", "BestCaterers-Dessert2", "BestCaterers-Dessert3"};
	}

	@Override
	public void commute() {
		System.out.println("Food and travel - Everything delivered..");
	}

}
