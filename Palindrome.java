package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121; // Change this value to test with different numbers
        int output = 0; // This will hold the reversed number
        int rem; //
        for(int i=input;i>0;i=i/10) {
        	rem=i%10;
        	output=(output*10)+rem;
        }
        if (input==output) {
        	System.out.println("Number is Palindrome");
        
        }else {
        	System.out.println("Not palindrome");
        	
        	
        	
        }

	}

}