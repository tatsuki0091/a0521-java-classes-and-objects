package test;

public class excercise {

	public static void main(String[] args) {
		// Q1
		int x=3;
		int y=4;
		System.out.println(totalSum(x,y));
		
		// Q2
		int marks = 40;
		System.out.println(getGrades(marks));
		
		// Q3
		int a = 6;
		System.out.println(factorial(a));
		
		// Q4
		int line = 13;
		System.out.println(area(line));
		System.out.println();
		
		

	}
	
	// Q1
	public static int totalSum(int x, int y) {
		return x+y;
	}
	
	// Q2
	public static String getGrades(int marks) {
		if(marks >= 41 && marks <= 50) {
			return "D-";
		} else if(marks >= 51 && marks <= 60) {
			return "C+";
		} else if(marks >= 61 && marks <= 70) {
			return "B-";
		} else if(marks >= 71 && marks <= 80) {
			return "B+";
		} else if(marks >= 81 && marks <= 90) {
			return "A-";
		} else if(marks >= 91 && marks <= 100) {
			return "A+";
		} else if(marks > 100) {
			return "Over Marks inpur another marks again";
		}
		
		return "Fail";
	}
	
	// Q3
	public static int factorial(int num) {
		if(num == 0){
			return 0;
		}else {
			int result = 1;
			for(int i =1; i<=num; i++) {
				result*=i;
			}
			return result;
		}
	}
	
	// Q4
	public static float area(int line1) {
		float area = (float)(Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * line1 * line1) / 4;
		return area;
	}

}
