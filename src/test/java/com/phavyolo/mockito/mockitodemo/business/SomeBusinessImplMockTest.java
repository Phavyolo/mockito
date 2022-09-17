package com.phavyolo.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

	@Test
	void findTheGreatestFromAllData_Basic() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(25, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_OneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(35, someBusinessImpl.findTheGreatestFromAllData());
	}

}

