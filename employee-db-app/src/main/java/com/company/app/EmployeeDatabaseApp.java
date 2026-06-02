package com.company.app;
import java.util.*;
import java.sql.*;

public class EmployeeDatabaseApp {

	
	 private static final String URL = "jdbc:mysql://localhost:3308/companydb?useSSL=false&serverTimezone=Asia/Kolkata";
	 private static final String USER = "root";       
	 private static final String PASSWORD = "root";
	 
	 private Connection connect() throws SQLException {
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }

	    public void addEmployee(String name, String position, double salary) {
	        String sql = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
	        try (Connection conn = connect();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, position);
	            pstmt.setDouble(3, salary);
	            pstmt.executeUpdate();
	            System.out.println("✅ Employee added successfully.");
	        } catch (SQLException e) {
	            printSqlError(e);
	        }
	    }

	    public void viewEmployees() {
	        String sql = "SELECT * FROM employees";
	        try (Connection conn = connect();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            System.out.println("ID\tName\t\tPosition\tSalary");
	            while (rs.next()) {
	                System.out.printf("%d\t%s\t\t%s\t%.2f%n",
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getString("position"),
	                        rs.getDouble("salary"));
	            }
	        } catch (SQLException e) {
	            printSqlError(e);
	        }
	    }

	    public void updateEmployee(int id, String name, String position, double salary) {
	        String sql = "UPDATE employees SET name=?, position=?, salary=? WHERE id=?";
	        try (Connection conn = connect();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, position);
	            pstmt.setDouble(3, salary);
	            pstmt.setInt(4, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println(rows > 0 ? "✅ Employee updated." : "⚠️ Employee not found.");
	        } catch (SQLException e) {
	            printSqlError(e);
	        }
	    }

	    public void deleteEmployee(int id) {
	        String sql = "DELETE FROM employees WHERE id=?";
	        try (Connection conn = connect();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println(rows > 0 ? "✅ Employee deleted." : "⚠️ Employee not found.");
	        } catch (SQLException e) {
	            printSqlError(e);
	        }
	    }

	    private void printSqlError(SQLException e) {
	        System.err.println("SQLState: " + e.getSQLState());
	        System.err.println("ErrorCode: " + e.getErrorCode());
	        System.err.println("Message : " + e.getMessage());
	        e.printStackTrace();
	    }

	    public static void main(String[] args) {
	        EmployeeDatabaseApp app = new EmployeeDatabaseApp();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n=== Employee Database Menu ===");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");

	            int choice = -1;
	            try {
	                choice = Integer.parseInt(sc.nextLine());
	            } catch (NumberFormatException ex) {
	                System.out.println("❌ Enter a number 1-5.");
	                continue;
	            }

	            try {
	                switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter position: ");
	                    String position = sc.nextLine();
	                    System.out.print("Enter salary: ");
	                    double salary = Double.parseDouble(sc.nextLine());
	                    app.addEmployee(name, position, salary);
	                    break;

	                case 2:
	                    app.viewEmployees();
	                    break;

	                case 3:
	                    System.out.print("Enter employee ID: ");
	                    int idUpdate = Integer.parseInt(sc.nextLine());
	                    System.out.print("Enter new name: ");
	                    String newName = sc.nextLine();
	                    System.out.print("Enter new position: ");
	                    String newPosition = sc.nextLine();
	                    System.out.print("Enter new salary: ");
	                    double newSalary = Double.parseDouble(sc.nextLine());
	                    app.updateEmployee(idUpdate, newName, newPosition, newSalary);
	                    break;

	                case 4:
	                    System.out.print("Enter employee ID: ");
	                    int idDelete = Integer.parseInt(sc.nextLine());
	                    app.deleteEmployee(idDelete);
	                    break;

	                case 5:
	                    System.out.println("🚪 Exiting...");
	                    sc.close();
	                    return; // ends main method

	                default:
	                    System.out.println("❌ Invalid choice. Try again.");
	                }
	            } catch (NumberFormatException nfe) {
	                System.out.println("❌ Invalid number. Try again.");
	            }
	        }
	    }
}
