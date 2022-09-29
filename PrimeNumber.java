public class PrimeNumber{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 101;
        boolean isPrime = true; // assume n is prime

        // check if number is prime
        for(int i = 2; i<Math.sqrt(n);i++){
            if(n % i == 0){  // if n % i == 0 then it is not prime number.
                isPrime = false;  // set isPrime to false if n is not prime
                break;
            }
        }

        if(isPrime){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        // print all prime numbers from 1 to n      
        for(int i = 2; i<=n;i++){
            int count1 = 0;
            for(int j = 1; j<=i;j++){
                if(i % j == 0){
                    count1++;
                    // break;
                }
            }
            if(count1 == 2){
                System.out.print(i+" ");
            }
        }

        


    }
}