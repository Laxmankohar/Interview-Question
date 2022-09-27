public class ArmStrong {
    public static void main(String[] args) {
        int n = 372;
        int n1 = n;
        
        int ans = 0;
        while (n>0) {
            int digit = n%10;
             ans += digit*digit*digit;
             n = n/10;
        }

        if(ans == n1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("NOt armstrong");
        }
    
    }
}
