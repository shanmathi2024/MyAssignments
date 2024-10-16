package week1.day3;

public class Fibonacciseries {

    public static void main(String[] args) {
        int range = 8; 
        int firstnum = 0;
        int secondnum = 1;
        System.out.print("Fibonacci Series:" +firstnum + ", " + secondnum);
        for (int i = 2; i < range; i++) { 
            int nextnum = firstnum + secondnum; 
           System.out.print(", " + nextnum); 
            firstnum = secondnum;
            secondnum = nextnum;
        }

        System.out.println(); 
    }
}
