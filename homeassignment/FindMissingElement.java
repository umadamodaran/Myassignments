package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] num = {1, 4, 3, 2, 8, 6, 7}; 
        Arrays.sort(num); 

        int n = num.length + 1; 

        for (int i = 0; i < n - 1; i++) {
            if (num[i] != i + 1) { 
                System.out.println("Missing number is: " + (i + 1)); 
                break;
            }
        }
    }
}



