public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
    //Этот метод реверсирует строку
    public static String reverseString(String Strings) {
        String x = "";
        int lengthOfString = Strings.length();
        for (int j = lengthOfString - 1; j >= 0; j--) {
            x += Strings.charAt(j);
        }
        return x;
    }
    //Этот метод проверяет является ли слово палиндромом
    public static boolean isPalindrome(String s) {
        String s2 = reverseString(s);
        return s.equals(s2);
    }
}
