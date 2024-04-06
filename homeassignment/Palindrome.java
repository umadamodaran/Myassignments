package week1.homeassignment;

public class Palindrome {

	public static void main(String[] args) {
		int input = 12321; 
        
        int tmp = input; 
        int output = 0; 
        while (tmp > 0) {
            int rem = tmp % 10; 
            output = output * 10 + rem; 
            tmp = tmp / 10; 
        }
        if (input == output) {
            System.out.println("Input: " + input + " -> Output: It is a Palindrome");
        } else {
            System.out.println("Input: " + input + " -> Output: It is not a Palindrome");
        }
    }
}