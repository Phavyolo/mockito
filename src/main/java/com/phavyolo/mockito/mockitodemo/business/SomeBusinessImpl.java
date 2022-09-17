package com.phavyolo.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;

	public int findTheGreatestFromAllData() {

		int[] data = dataService.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestValue)
				greatestValue = value;
		}

		return greatestValue;
	}

}

interface DataService {
	int[] retrieveAllData();
}
