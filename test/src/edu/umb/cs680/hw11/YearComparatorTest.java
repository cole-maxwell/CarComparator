package edu.umb.cs680.hw11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class YearComparatorTest {

	@Test
	public void verifyYearRanking() {

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(Car.createCar("Mazda", "Miata", 3200, 2015, 200000.00f));
		cars.add(Car.createCar("Jaguar", "F-Type", 120000, 2020, 160000.f));
		cars.add(Car.createCar("Honda", "Element", 1500, 2007, 29995.00f));
		cars.add(Car.createCar("GMC", "Yukon", 25300, 2003, 2200.00f));
	
		Collections.sort(cars, new YearComparator());
		
		ArrayList<Integer> years = new ArrayList<Integer>();
		for (Car carByYear: cars) {
			years.add(carByYear.getYear());	
		}
		Object[] expected = {2020, 2015, 2007, 2003};
		Object[] actual = years.toArray();
		assertArrayEquals(expected, actual);
	}
}