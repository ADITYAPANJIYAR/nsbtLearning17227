package fouthdayassignment;

public class StringReversal {
    public static void main(String[] args) {
        String input = "Aditya";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return it
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Recursive call: reverse the substring from the second character to the end,
        // then concatenate the first character to the end of the reversed substring
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

