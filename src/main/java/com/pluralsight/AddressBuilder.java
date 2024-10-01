/*
A new application that accepts user input for customer information such
as billing and shipping addresses. The input information should be
concatenated into a single variable.
 */
package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user fo their Billing and shipping addresses

        // Prompt user to enter billing information and append it to customer info
        System.out.print("Please provide the following information: \n" +
                "Full name: ");
        StringBuilder customerInfo = new StringBuilder();
        customerInfo.append(scanner.nextLine() + "\n\n");

        customerInfo.append("Billing Address: \n");

        System.out.print("Billing Street: ");
        customerInfo.append(scanner.nextLine() + "\n");

        System.out.print("Billing City: ");
        customerInfo.append(scanner.nextLine()  + ", ");

        System.out.print("Billing State: ");
        customerInfo.append(scanner.nextLine()  + " ");

        System.out.print("Billing Zip: ");
        customerInfo.append(scanner.nextLine() + "\n\n");


        // Prompt user to enter shipping information and append it to customer info
        customerInfo.append("Shipping Address: \n");
        System.out.print("Shipping Street: ");
        customerInfo.append(scanner.nextLine() + "\n");

        System.out.print("Shipping City: ");
        customerInfo.append(scanner.nextLine() + ", ");

        System.out.print("Shipping State: ");
        customerInfo.append(scanner.nextLine() + " ");

        System.out.print("Shipping Zip: ");
        customerInfo.append(scanner.nextLine());

        // Display the customer information
        String customerInfoString = customerInfo.toString();
        System.out.print(customerInfoString);
    }
}
