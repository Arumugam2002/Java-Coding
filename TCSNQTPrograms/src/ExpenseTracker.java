import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> expenses = new HashMap<>();

        // Taking income input
        System.out.print("Enter income: ");
        int income = scanner.nextInt();

        int totalExpenses = 0;
        scanner.nextLine(); // Consume newline

        // Taking expenses input
        while (true) {
            System.out.print("Enter expense type or 'done': ");
            String expenseType = scanner.nextLine();

            if (expenseType.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter price of expense: ");
            int expenseAmount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            expenses.put(expenseType, expenses.getOrDefault(expenseType, 0) + expenseAmount);
            totalExpenses += expenseAmount;
        }

        // Calculating savings
        int savings = income - totalExpenses;

        // Displaying output
        System.out.println("\nSummary of expenses:");
        System.out.println("Total income: " + income + "$");
        System.out.println("Total expenses: " + totalExpenses + "$");
        System.out.println("Total savings: " + savings + "$");

        System.out.println("\nAnalysis:");
        System.out.println("Expense and price:");
        for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + "$");
        }

        scanner.close();
    }
}
