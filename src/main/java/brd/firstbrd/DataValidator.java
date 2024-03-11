package brd.firstbrd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    public static boolean isDataType(Object value, String dataType) {
        try {
            switch (dataType) {
                case "Numeric":
                    Double.parseDouble(value.toString());  // Try parsing as double
                    break;
                case "Integer":
                    Integer.parseInt(value.toString());  // Try parsing as integer
                    break;
                case "String":
                    String.valueOf(value);  // Convert to string
                    break;
                case "Boolean":
                    String stringValue = value.toString().toLowerCase();
                    return  (stringValue.equals("true") || stringValue.equals("false"));
                default: return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Data Length Validation
    public static boolean isValidLength(Object value, int maxLength) {
        return String.valueOf(value).length() <= maxLength;
    }

    // Special Characters Validation
    public static boolean hasSpecialCharacters(String value, String specialCharacters) {
        for (char c : specialCharacters.toCharArray()) {
            if (value.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;

    }

    // Domain Value Validation
    public static boolean isValidDomainValue(String value, String[] validValues) {
        for (String validValue : validValues) {
            if (value.equalsIgnoreCase(validValue)) {
                return true;
            }
        }
        return false;
    }

    // Format Validation
    public static boolean isValidFormat(String value, String formatRegex) {
        return value.matches(formatRegex);
    }

    // Email Validation
    public static boolean isValidEmail(String email) {
        // Regular expression to validate email
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}