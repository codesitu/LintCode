Description
Write a function that add two numbers A and B.
There is no need to read data from standard input stream. Both parameters are given in function aplusb, you job is to calculate the sum and return it.

Problem Correction
Clarification
Are a and b both 32-bit integers?

Yes.
Can I use bit operation?

Sure you can.
Example
Given a=1 and b=2 return 3.
Challenge
Of course you can just return a + b to get accepted. But Can you challenge not do it like that?(You should not use + or any arithmetic operators.)

public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int sumWithoutCarry;
        int carry;
        while (b != 0) {
            sumWithoutCarry = a ^ b;
            carry = (a & b) << 1;
            a = sumWithoutCarry;
            b = carry;
        }

        return a;
    }
}
