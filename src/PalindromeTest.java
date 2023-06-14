public class PalindromeTest {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String palindrome = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String nPalindrome = "";
        char eachChar;
        System.out.println(palindrome);

        for(int i = 0;i < palindrome.length(); i++) {
            eachChar = palindrome.charAt(i);
            nPalindrome = eachChar + nPalindrome;
        }
        System.out.println(nPalindrome);
        if(palindrome.equals(nPalindrome)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
