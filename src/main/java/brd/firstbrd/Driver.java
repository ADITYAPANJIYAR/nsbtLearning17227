package brd.firstbrd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static brd.firstbrd.DataValidator.*;

public class Driver {
    private static final Logger log= LogManager.getLogger(Driver.class);
    public static void main(String[] args) {
        String customerId1 = "HDFC123456";
        if (isDataType(customerId1, "Numeric") && isValidLength(customerId1, 10))
            log.info("Customer ID is valid.");
        else
            log.info("Customer ID is not valid.");

        String customerId2 = "HDFC12345";
        if (isDataType(customerId2, "String") && isValidLength(customerId2, 10))
            log.info("Customer ID is valid.");
        else
            log.info("Customer ID is not valid.");

        String dayInWeek = "Monday";
        if (isValidDomainValue(dayInWeek, new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"})) {
            log.info("Day in week is valid.");
        }

        String dateValue = "2024-03-09";
        if (isValidFormat(dateValue, "\\d{4}-\\d{2}-\\d{2}")) {
            log.info("Date format is valid.");
        }

        String email = "example.8mi@example.com";
        if (isValidEmail(email)) {
            log.info("Email is valid.");
        }
        else {
            log.info("Email is not valid.");
        }
    }
}
