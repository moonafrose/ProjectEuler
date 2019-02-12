/*

https://projecteuler.net/problem=1
https://www.hackerrank.com/contests/projecteuler/challenges/euler001

*/
public class Solution {
    private static long result(long n) {
        long sum = 0;
        long n3 = (n - 1) / 3; // count of numbers divisible by 3
        long n5 = (n - 1) / 5;
        long n15 = (n - 1) / 15;

        // using sum of fist n natural numbers=> n(n+1)/2
        sum = 3 * n3 * (n3 + 1) / 2 + 5 * n5 * (n5 + 1) / 2 - 15 * n15 * (n15 + 1) / 2;
        return sum;
    }

    // This gives TLE for large inputs
    private static long resultII(long n) {
        long sum = 0;
        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) { // basically check if any number is divisible by either 3 or 5.
                sum += i;
            }
        }
        return sum;
    }
}