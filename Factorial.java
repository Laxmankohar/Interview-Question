public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        

        // iterative method
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact =  fact*i;
        }
        // System.out.println(fact);

        // Recursive method
        System.out.println(factorial(n));
    }


    public static int factorial(int n){

        if (n == 1) { // base case
            return 1;
        }
        else{
            return n*factorial(n-1); // general case    
            }
        
    }
}
