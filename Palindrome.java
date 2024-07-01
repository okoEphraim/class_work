package classwork;

public class Palindrome {
  public static boolean isPalindrome(String word) {
      if (word.length() <= 1) {
        return true;
      }
      int left = 0;
      int right = word.length() - 1;
  
      while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
          return false;
        }
        left++;
        right--;
      }
      return true;
    }
  
    public static void main(String[] args) {
      String word = "wow";
  
      if (isPalindrome(word)) {
        System.out.println("It is a palindrome");
      } else {
        System.out.println("It is not a palindrome");
      }
    }
}
