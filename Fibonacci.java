public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;           // 0,1,1,2,3,5,8


        // iterative number
        int a = 0;
        int b = 1;

        int sum  = 0;

        System.out.print(a +" "+b+" ");
        for (int i = 0; i < n; i++) {
            sum = a+b;
            a = b;
            b = sum;

            //System.out.print(sum +" ");  //print every number
        }
        // System.out.println(sum); // print sum to n 











        // Recursive way

        System.out.println(fibo(n));
    }


    public static int fibo(int n){

        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
        
    }
}
