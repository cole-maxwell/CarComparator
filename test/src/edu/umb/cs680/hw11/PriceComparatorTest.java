package edu.umb.cs680.hw11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PriceComparatorTest {

	@Test
	public void verifyPriceRanking() {

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(Car.createCar("Mazda", "Miata", 3200, 2015, 200000.00f));
		cars.add(Car.createCar("Jaguar", "F-Type", 120000, 2020, 160000.00f));
		cars.add(Car.createCar("Honda", "Element", 1500, 2007, 29995.00f));
		cars.add(Car.createCar("GMC", "Yukon", 25300, 2003, 2200.00f));
	
		Collections.sort(cars, new PriceComparator());
		
		ArrayList<Float> price = new ArrayList<Float>();
		for (Car carByPrice: cars) {
			price.add(carByPrice.getPrice());	
		}
		Object[] expected = {2200.00f, 29995.00f, 160000.00f, 200000.00f};
		Object[] actual = price.toArray();
		assertArrayEquals(expected, actual);
	}
}