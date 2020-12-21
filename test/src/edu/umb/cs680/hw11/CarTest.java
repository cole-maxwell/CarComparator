package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {

	private String[] carToStringArray(Car c)
	{
		String[] actual = {c.getMake(), c.getModel(), Integer.toString(c.getYear())};
		return actual;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear()
	{
		String[] expected = {"Toyota", "RAV4", "2018"};
		Car actual = Car.createCar("Toyota", "RAV4", 32000, 2018, (float)25000.0);
		assertArrayEquals(expected, carToStringArray(actual));
	}

}