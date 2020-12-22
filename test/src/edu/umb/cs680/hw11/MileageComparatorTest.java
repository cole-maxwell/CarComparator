package edu.umb.cs680.hw11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MileageComparatorTest {

	@Test
	public void verifyMileageRanking() {

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(Car.createCar("Mazda", "Miata", 3200, 2015, 200000.00f));
		cars.add(Car.createCar("Jaguar", "F-Type", 120000, 2020, 160000.f));
		cars.add(Car.createCar("Honda", "Element", 1500, 2007, 29995.00f));
		cars.add(Car.createCar("GMC", "Yukon", 25300, 2003, 2200.00f));
	
		Collections.sort(cars, new MileageComparator());
		
		ArrayList<Integer> mileages = new ArrayList<Integer>();
		for (Car carByMileage: cars) {
			mileages.add(carByMileage.getMileage());	
		}
		Object[] expected = {1500, 3200, 25300, 120000};
		Object[] actual = mileages.toArray();
		assertArrayEquals(expected, actual);
	}
}