package com.edureka.contract;

import java.util.Scanner;

public class HostingParty {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CommuteContract commuteContract = null;
		System.out.println("Please enter 1 for AwesomeCaterers and 2 for Best Caterers");
		int option = sc.nextInt();
		DinnerContract contract = null;
		if (option == 1) {
			contract = new AwesomeCaterers();
			commuteContract = new CityRiders();
		} else {
			BestCaterers bestContract = new BestCaterers();
			contract = bestContract;
			commuteContract = bestContract;
		}
		
		commuteContract.commute();

		String[] starters = contract.starters();
		for (String starter : starters) {
			System.out.println(starter);
		}
		
		sc.close();
	}

}
