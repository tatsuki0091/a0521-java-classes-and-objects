package JavaLabThree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("TOYOTA", "S1", 2020));
		carList.add(new Car("NISSAN", "F2", 2010));
		carList.add(new Car("FORD", "D3", 2017));
		Comparator<Car> compare = Comparator.comparing(Car::getYear);
		carList.sort(compare);
		for (Car e : carList) {
            System.out.println(e.getYear());
        }

	}

}
