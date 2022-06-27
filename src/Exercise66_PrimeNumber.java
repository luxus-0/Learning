/*
 * Write a Java program to compute the sum of the first 100 prime numbers;
 * */

public class Exercise66_PrimeNumber {

    private static void sumPrimeNumber() {
        int sum = 1;
        int ctr = 0;
        int n = 0;

        while(ctr < 100) {
            n++;
            if(n % 2 != 0) {
                if(isPrime(n)){
                    sum += n;
                }
            }
            ctr++;
        }
        System.out.println("Sum prime number till 100: " + sum);
    }

    private static boolean isPrime(int n) {
        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        sumPrimeNumber();
    }

}
