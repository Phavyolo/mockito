package com.phavyolo.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllData_basic() {
		DataService dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
		assertEquals(25, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_withOneValue() {
		DataService dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
		assertEquals(35, someBusinessImpl.findTheGreatestFromAllData());
	}

}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
	
}

class DataServiceStub2 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {35};
	}
	
}
