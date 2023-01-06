// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===>> ");
        try {
            final int MAX = input.nextInt();
            boolean primes[] = new boolean[MAX];

            computePrimes(primes);
            displayPrimes(primes);
        } catch (Exception e) {
            if (e.hashCode() == 1836019240) { // input mismatch
                System.out.println("Please ensure that you entered in an integer, and not a character or a very large integer");
            } else {
                throw e;
            }
        }
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        for(int i = 2; i < primes.length; i++) {
            for (int k = i * 2; k < primes.length; k += i) {
                primes[k] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        int counter = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                if (counter >= 15) {
                    counter = 0;
                    System.out.println();
                }
                counter++;
                System.out.print(i + " ");
            }
        }
    }

}



