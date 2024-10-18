package week1.day3;

public class FindIntersection {

    public static void main(String[] args) {
        
        int a[] = {3, 2, 11, 4, 6, 7};
        int b[] = {1, 2, 8, 4, 9, 7};
        
        // Loop through the first array
        for (int i = 0; i < a.length; i++) {
        	
            // Loop through the second array
            for (int j = 0; j < b.length; j++) {
                // Check for matching elements
                if (a[i] == b[j]) {
                    // Print the matching element
                    System.out.println("Matching element: " + a[i]);
                }
            }
        }
    }
}
