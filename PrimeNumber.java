public class PrimeNumber{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 50;
        int count = 0;

        // check if number is prime
        for(int i = 2; i<Math.sqrt(n);i++){
            if(n % i == 0){  // if n % i == 0 then it is prime number.
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        // print all prime numbers from 1 to n      
        for(int i = 2; i<=n;i++){
            int count1 = 0;
            for(int j = 2; j<Math.sqrt(i);j++){
                if(i % j == 0){
                    count1++;
                    break;
                }
            }
            if(count1 == 0){
                System.out.print(i+" ");
            }
        }


    }
}