package edu.umb.cs680.hw11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParetoComparatorTest {

	@Test
	public void verifyMileageRanking() {

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(Car.createCar("Mazda", "Miata", 3200, 2015, 200000.00f));
		cars.add(Car.createCar("Jaguar", "F-Type", 120000, 2020, 160000.f));
		cars.add(Car.createCar("Honda", "Element", 1500, 2007, 29995.00f));
		cars.add(Car.createCar("GMC", "Yukon", 25300, 2003, 2200.00f));
	
		for (Car carByPareto: cars) {
			carByPareto.setDominationCount(cars);
		}
		Collections.sort(cars, new ParetoComparator());
		
		ArrayList<Integer> dominationCounts = new ArrayList<Integer>();
		for (Car carByPareto: cars) {
			dominationCounts.add(carByPareto.getDominationCount());	
		}
		Object[] expected = {0, 0, 1, 2};
		Object[] actual = dominationCounts.toArray();
		assertArrayEquals(expected, actual);
	}
}