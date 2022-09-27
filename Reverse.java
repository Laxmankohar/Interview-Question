public class Reverse {
    public static void main(String[] args) {
        int n =1234;

            int ans = 0;

        while (n>0) {
            int rem = n % 10;
            ans = ans*10 + rem;
            n /= 10;

        }

        System.out.println(ans);

        System.out.println(reverseString("apple"));
    }

    private static String reverseString(String s) {
        String rev = "";
        int i = s.length();
        while (i-->0) {
            rev = rev+s.charAt(i);
        }
        return rev;
    }


}
