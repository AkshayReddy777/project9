package lms.db;

import lms.books.Book;

import java.sql.*;


public class DBHelper {

    protected final static String DB_URL = "jdbc:mysql://18.119.44.49:3306/ZODHA_LMS?autoReconnect=true&useSSL=false";
    protected static String dbUserID = "root";
    protected static String dbUserPassword = "Abc123!@";
    protected static boolean isConnected = false;
    protected static Connection conn = null;
    protected boolean changes = true;


    public static boolean connect() {

        System.out.println("Trying to connect to DB at " + DB_URL + " with User ID: " + dbUserID + " and password: " + dbUserPassword);

        try {
            //Class.forName("com.mysql.jdbc");
            conn = DriverManager.getConnection(DB_URL, dbUserID, dbUserPassword);
        } catch (SQLException ex) {
            System.out.println("Connection failed and the message for DB server is " + ex.getMessage() + "\nStack trace: " );
            ex.printStackTrace();
            return false;
        }

        isConnected = true;
        return isConnected;
    }

    public static boolean dbInsertBook(Book book) {
        if (!isConnected) {
            connect();
        }
        String insertSqlStmt = "INSERT INTO books (book_title, AUTHORS, isbn, category, book_label) values('"
                + book.getTitle() + "', '" + book.getAuthorsAsString()
                + "', '" + book.getISBN() + "', '" + book.getCategory()
                + "', '" + book.getBookLabel() + "')";

        return dbExecuteStmt(insertSqlStmt);
    }

    public static boolean dbInsertUser(User user) {
        if (!isConnected) {
            connect();
        }
        String insertSqlStmt = "INSERT INTO user (user_title, AUTHORS, isbn, category, book_label) values('"
                + book.getTitle() + "', '" + book.getAuthorsAsString()
                + "', '" + book.getISBN() + "', '" + book.getCategory()
                + "', '" + book.getBookLabel() + "')";

        return dbExecuteStmt(insertSqlStmt);
    }

    private static boolean dbExecuteStmt(String sqlStmt) {
        System.out.println("Executing actual sql, " + sqlStmt + " on the database.");

        try {
            Statement stmt = conn.createStatement();
            boolean isSuccess = stmt.execute(sqlStmt);
        } catch (SQLException ex) {
            System.out.println("Executing SQL failed and the message for DB server is " + ex.getMessage());
            return false;
        }

        return true;
    }


}
