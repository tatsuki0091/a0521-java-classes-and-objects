package JavaLabThree;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> q1 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		scan.close();
		for(int i=0; i<10; i++) {
			q1.add(random.nextInt(random.nextInt(50) + 1));	
		}
		
		for (int num : q1) {
            if(num == inputNum) {
            	result.add(inputNum);	
            } 
        }
		if(result.size() >0) {
			System.out.println("the number is in the list.");
		} else {
			System.out.println("the number is not in the list.");
		}
	}

}
