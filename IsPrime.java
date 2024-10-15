package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int number = 5; 
		        boolean prime = true; 
		        // Check for factors from 2 to n-1
		        for (int n = 2; n < 5; n++) {
		            if (5 % n == 0) {
		                prime = false; 
		            }
		        }
		        if (prime==true) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }}

	


	


