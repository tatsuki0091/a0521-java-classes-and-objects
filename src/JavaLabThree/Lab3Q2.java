package JavaLabThree;

import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> q2 = new ArrayList<Integer>();
		Random random = new Random();

		for(int i=0; i<10; i++) {
			q2.add(random.nextInt(random.nextInt(50) + 1));	
		}
		
		ArrayList<Integer> q2Copy = new ArrayList<Integer>();
		q2Copy.addAll(q2);
		q2Copy.set(q2Copy.size()-1, -5);
		System.out.println(q2);
		System.out.println(q2Copy);


	}

}
