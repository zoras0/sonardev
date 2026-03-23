import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class App {

    private static final String DB_PASSWORD = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String userInput = scanner.nextLine();

        // ===== DUPLICATE BLOCK 1 =====
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", DB_PASSWORD);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs.next()) {
                System.out.println("User found: " + rs.getString("username"));
            }

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs2.next()) {
                System.out.println("User found again: " + rs2.getString("username"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ===== DUPLICATE BLOCK 2 (COPY PASTE EXACTLY) =====
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", DB_PASSWORD);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs.next()) {
                System.out.println("User found: " + rs.getString("username"));
            }

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs2.next()) {
                System.out.println("User found again: " + rs2.getString("username"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ===== DUPLICATE BLOCK 3 (AGAIN SAME) =====
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", DB_PASSWORD);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs.next()) {
                System.out.println("User found: " + rs.getString("username"));
            }

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

            while (rs2.next()) {
                System.out.println("User found again: " + rs2.getString("username"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Command Injection
        try {
            Runtime.getRuntime().exec("cmd.exe /c dir " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}