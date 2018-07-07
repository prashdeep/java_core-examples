package com.edureka.contract;

public class AwesomeCaterers implements DinnerContract {

	@Override
	public String[] starters() {
		return new String[]{"AwesomeCaterers-Starter1", "AwesomeCaterers-Starter2", "AwesomeCaterers-Starter3"};
	}

	@Override
	public String[] mainCourse() {
		return new String[]{"AwesomeCaterers-Main course1", "AwesomeCaterers-Main course2", "AwesomeCaterers-Main course3"};
	}

	@Override
	public String[] desserts() {
		return new String[]{"AwesomeCaterers-Dessert1", "AwesomeCaterers-Dessert2", "AwesomeCaterers-Dessert3"};
	}
	
	public String complementaryDrink() {
		return "AwesomeCaterers-Complementary Drink";
	}

}
