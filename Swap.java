public class Swap {
    public static void main(String[] args) {
        
        // using third variable
        int a = 3;
        int b = 4;

        int temp = a;
        a = b;
        b =temp;

        System.out.println(a+" "+b);


        //1. without using third variable
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+" "+b);

        // 2. using / and *

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println(a+" "+b);


        // 3. using XOR (more efficient)

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a+" "+b);
    }
}
