public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        if(n % 2 == 0)
            return false;

        for(int i = 3; i <= n / 2; i += 2)
            if(n % i == 0)  
                return false;
        
        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        //this algorithm determines the index of 1 as 1
        int a = 0, b = 1, counter = 0;
        while(b < n){
            b += a; a = b - a; counter++;
        }
        if(n < 2)
            return n;
        if(b == n)
            return counter + 1;
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n){
            char[][] tri = new char[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j <= i; j++)
                    tri[i][j] = ((j == 0 || j == i || i == n - 1) ? '*' : ' ');
            return tri;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
