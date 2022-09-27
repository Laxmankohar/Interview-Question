public class Pallindrome {
    public static void main(String[] args) {


        // for integer
        int n = 121;
        int n1 = n;

        int rev = 0;
        while (n>0) {
             int rem = n%10;
             rev = rev*10+rem;
             n = n/10;
        }

        if(rev == n1){
            System.out.println("Yes, pallindrome");
        }
        else{
            System.out.println("No, pallindrome");
        }






        // for String
        String s = "aba";
        String ans = "";

        for(int i = s.length()-1; i>=0;i--){
            ans += s.charAt(i);
        }

        System.out.println(ans);

        if(s.equals(ans)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
