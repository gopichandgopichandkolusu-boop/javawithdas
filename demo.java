import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean opposite = ((a^b)<0);
        System.out.println("opposite");
    }
}
=======================================
  factorial number
  class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact =fact*i;
        }
        return fact;
        
    }
}
=========================================
  spy is sum number is equal to product of number 

  is reading from keybaord we can using the scanner class using the package is import java.util.*;

  class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum=0;
        int mutl=1;
        while(n>0)
        {
            int digit = n%10;
            sum = sum+digit;
            mutl = mutl*digit;
            n = n/10;
        }
        return sum==mutl;
        
    }
}
