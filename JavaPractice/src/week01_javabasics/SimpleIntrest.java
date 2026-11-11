package week01_javabasics;

public class SimpleIntrest {
	
	public static void main(String[] args) {

        double principal = 2000000;
        double rate = 9.99;
        int years = 5;

        double interest = principal * rate * years / 100;
        double total = principal + interest;

        System.out.printf("Principal : ₹%.2f%n", principal);
        System.out.printf("Interest  : ₹%.2f%n", interest);
        System.out.printf("Total     : ₹%.2f%n", total);
    }

}
