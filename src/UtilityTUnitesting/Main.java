package UtilityTUnitesting;

public class Main {
    public static void main(String[] args) {
        
        // Test the add method
        int num1 = 5;
        int num2 = 10;
        int sum = MathUtility.add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " +sum);
    }
}
