package edu.umb.cs680.hw11;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StartupCar
{
	public static void main(String[] args)
	{
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(Car.createCar("Mazda", "Miata", 3200, 2015, 200000.00f));
		cars.add(Car.createCar("Jaguar", "F-Type", 120000, 2020, 160000.f));
		cars.add(Car.createCar("Honda", "Element", 1500, 2007, 29995.00f));
		cars.add(Car.createCar("GMC", "Yukon", 25300, 2003, 2200.00f));
		int ranking;

		Collections.sort(cars, new YearComparator());
		System.out.println("--Year comparison--\n");
		ranking = 1;
		for (Car carByYear: cars) {
			System.out.println("#" + ranking);
			System.out.println(carByYear + "\n");
			ranking++;	
		}

		Collections.sort(cars, new MileageComparator());
		System.out.println("--Mileage comparison--\n");
		ranking = 1;
		for (Car carByMileage: cars) {
			System.out.println("#" + ranking);
			System.out.println(carByMileage + "\n");
			ranking++;	
		}

		Collections.sort(cars, new PriceComparator());
		System.out.println("--Price comparison--\n");
		ranking = 1;
		for (Car carByPrice: cars) {
			System.out.println("#" + ranking);
			System.out.println(carByPrice + "\n");
			ranking++;	
		}

		// for (Car carByPareto: cars) {
		// 	carByPareto.setDominationCount(cars);
		// }
		// Collections.sort(cars, new ParetoComparator());
		// System.out.println("--Pareto comparison--\n");
		// ranking = 1;
		// for (Car carByPareto: cars) {
		// 	System.out.println("#" + ranking);
		// 	System.out.println(carByPareto + "\n");
		// 	ranking++;	
		// }
	}
}

