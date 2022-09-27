public class LCM {
    public static void main(String[] args) {
        int n1 = 72;
        int n2 = 120;
        int lcm = 0;

        lcm = (n1> n2)? n1:n2;

        while (true) {
            if(lcm % n1 == 0 && lcm % n2 == 0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
