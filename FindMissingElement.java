package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

    public static void main(String[] args) {
        int[] num = {1, 4, 3, 2, 8, 6, 7}; // Input array
        Arrays.sort(num); // Sort the array

        System.out.println("Sorted Array: " + Arrays.toString(num));

        // Loop through the sorted array to find the missing number
        for (int i = 0; i < num.length; i++) {
            // Check if the expected number (i + 1) does not match the current array value
            if (i +1 != num[i]) {
                System.out.println("Missing number: " + (i + 1));
                break; // Exit the loop once the missing number is found
            }
        }
    }
}
