public class Recursion {
    public static void main(String[] args){
        //Recursion is a programming technique where a method calls itself to solve a problem.
        //Base case – the condition that stops the recursion.
        //Recursive case – where the method calls itself with a smaller or simpler input.
        System.out.println(factorial(5));

        System.out.println(sumOfNumbers(5));
    }

    private static int factorial(int n){
        if ( n == 1){ // Base case
            return 1;
        }
        return n * factorial (n -1 ); // Recursive case
    }

    private static int sumOfNumbers(int n){
        if ( n == 1){
            return 1;
        }
        return n + sumOfNumbers(n -1);
    }
}
