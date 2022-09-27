import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";  

        boolean isAnagram = true;  // assume they are anagrams

        int al[] = new int[256];   // 256 ASCII characters
        int bl[] = new int[256];

        for (char c : s1.toCharArray()) {
            int index = (int) c;   //store the ascii value of the character
            al[index]++;  //increment the value of the index
        }
// al[] = {97:1, 101:1, 105:1, 108:1, 110:1, 115:1, 116:1}
        for (char c : s2.toCharArray()) {
            int index = (int) c;   //store the ascii value of the character
            bl[index]++;   //increment the value of the index
        }

        // bl[] = {97:1, 101:1, 105:1, 108:1, 110:1, 115:1, 116:1}

        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {  //compare the values of the index
                isAnagram = false;  //if the values are not equal then the strings are not anagrams
                break;
            }
        }

        if (isAnagram) { //if the strings are anagrams
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }








        // 2nd method

        if(s1.length() == s2.length()){
            s1 = s1.toLowerCase();  //convert the strings to lowercase
            s2 = s2.toLowerCase();


            char[] s1Array = s1.toCharArray();  //convert the strings to char arrays
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);  //sort the char arrays
            Arrays.sort(s2Array);

            boolean rslt  = Arrays.equals(s1Array, s2Array);   //compare the char arrays

            if(rslt){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
