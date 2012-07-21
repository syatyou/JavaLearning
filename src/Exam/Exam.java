package Exam;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 70) {
		  System.out.println("‡ŠiI");
		} else {
		  System.out.println("•s‡ŠiI");
		}
	}
}
