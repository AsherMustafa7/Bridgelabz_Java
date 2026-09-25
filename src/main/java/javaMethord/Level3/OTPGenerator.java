/*
Question:
7. Write a program to generate a six-digit OTP number using Math.random. Validate the numbers are unique by generating the OTP number 10 times and ensuring all 10 OTPs are not the same.

Hints:
1. Write a method to generate a 6 digit OTP using Math.random.
2. Create an array to save the OTP numbers generated 10 times.
3. Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class OTPGenerator {

    // Generate a six digit OTP.
    public int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check whether all generated OTP values are unique.
    public boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Generate ten OTP values.
    public int[] generateOTPArray(int size) {
        int[] otps = new int[size];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        OTPGenerator generator = new OTPGenerator();

        // Store the number of OTP values to generate.
        int otpCount = 10;

        // Generate the OTP array.
        int[] otps = generator.generateOTPArray(otpCount);

        // Display all generated OTP values.
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check and display uniqueness.
        System.out.println("All OTPs are unique: " + generator.areUnique(otps));

        // Close the scanner.
        sc.close();
    }
}
