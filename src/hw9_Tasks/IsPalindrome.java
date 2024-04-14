package hw9_Tasks;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeRegEx("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
        System.out.println(isPalindrome("race a car"));
    }

    // 13 ms
    public static boolean isPalindromeRegEx(String s) {
        char[] letters = s.toLowerCase().replaceAll("[\\W_]", "").toCharArray();
        int lastIndex = letters.length - 1;
        for (char c : letters) {
            if (c != letters[lastIndex]) return false;
            lastIndex--;
            if(lastIndex == letters.length/2 - 1) break;
        }
        return true;
    }

    // 6 ms
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char currChar;
        for (int i = 0; i < s.length(); i++) {
            currChar = s.charAt(i);
            if (!Character.isDigit(currChar) && !Character.isLetter(currChar)){
                s = s.replace(Character.toString(currChar), "");
                i--;
            }
        }

        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        if (s.length() == 1 || s.isEmpty()) return true;
        while(rightIndex >= leftIndex){
            if (s.charAt(leftIndex) != s.charAt(rightIndex))
                return false;
            rightIndex--;
            leftIndex++;
        }
        return true;
    }
}
