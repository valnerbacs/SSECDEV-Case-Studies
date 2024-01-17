package Controller;

import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;

import org.mindrot.jbcrypt.BCrypt;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SQLite {
    
    public int DEBUG_MODE = 0;
    String driverURL = "jdbc:sqlite:" + "database.db";
    
    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(driverURL)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Database database.db created.");
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createHistoryTable() {
        String sql = "CREATE TABLE IF NOT EXISTS history (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL,\n"
            + " name TEXT NOT NULL,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createLogsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS logs (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " event TEXT NOT NULL,\n"
            + " username TEXT NOT NULL,\n"
            + " desc TEXT NOT NULL,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createProductTable() {
        String sql = "CREATE TABLE IF NOT EXISTS product (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " name TEXT NOT NULL UNIQUE,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " price REAL DEFAULT 0.00\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createUserTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL UNIQUE,\n"
            + " password TEXT NOT NULL,\n"
            + " role INTEGER DEFAULT 2,\n"
            + " locked INTEGER DEFAULT 0\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropHistoryTable() {
        String sql = "DROP TABLE IF EXISTS history;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropLogsTable() {
        String sql = "DROP TABLE IF EXISTS logs;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropProductTable() {
        String sql = "DROP TABLE IF EXISTS product;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropUserTable() {
        String sql = "DROP TABLE IF EXISTS users;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addHistory(String username, String name, int stock, String timestamp) {
        String sql = "INSERT INTO history(username,name,stock,timestamp) VALUES('" + username + "','" + name + "','" + stock + "','" + timestamp + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addLogs(String event, String username, String desc, String timestamp) {
        String sql = "INSERT INTO logs(event,username,desc,timestamp) VALUES('" + event + "','" + username + "','" + desc + "','" + timestamp + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addProduct(String name, int stock, double price) {
        String sql = "INSERT INTO product(name,stock,price) VALUES('" + name + "','" + stock + "','" + price + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void editProduct(String newName, int newStock, double newPrice, int id) {
        String sql = "UPDATE product SET name = '" + newName + "', stock = " + newStock + ", price = " + newPrice + " WHERE id = " + id;

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void deleteProduct(int id) {
        String sql = "DELETE FROM product WHERE id = '" + id + "'";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }
    
//    id, username, role, locked

    public void lockUnlockUser (int newStatus, int id)   {
        String sql = "UPDATE users SET locked = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, newStatus);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public ArrayList<History> getHistory(){
        String sql = "SELECT id, username, name, stock, timestamp FROM history";
        ArrayList<History> histories = new ArrayList<History>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                histories.add(new History(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return histories;
    }
    
    public ArrayList<History> getUserHistory(String u) {
        String sql = "SELECT id, name, stock, timestamp FROM history WHERE username = ?";
        ArrayList<History> histories = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, u);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    histories.add(new History(rs.getInt("id"),
                            u,
                            rs.getString("name"),
                            rs.getInt("stock"),
                            rs.getString("timestamp")));
                }
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return histories;
    }
    
    public ArrayList<Logs> getLogs(){
        String sql = "SELECT id, event, username, desc, timestamp FROM logs";
        ArrayList<Logs> logs = new ArrayList<Logs>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                logs.add(new Logs(rs.getInt("id"),
                                   rs.getString("event"),
                                   rs.getString("username"),
                                   rs.getString("desc"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return logs;
    }
    
    public ArrayList<Logs> getUnsuccessfulAttempts(String username){
        String TOKEN = "login attempt unsuccessful";
        String sql = "SELECT id, event, username, desc, timestamp FROM logs WHERE username = '" + username + "' AND " + "desc = '" + TOKEN +"'";
        ArrayList<Logs> logs = new ArrayList<Logs>();
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                logs.add(new Logs(rs.getInt("id"),
                                   rs.getString("event"),
                                   rs.getString("username"),
                                   rs.getString("desc"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return logs;

    }
    
    public ArrayList<Product> getProduct(){
        String sql = "SELECT id, name, stock, price FROM product";
        ArrayList<Product> products = new ArrayList<Product>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                products.add(new Product(rs.getInt("id"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return products;
    }
    
    public ArrayList<User> getUsers(){
        String sql = "SELECT id, username, password, role, locked FROM users";
        ArrayList<User> users = new ArrayList<User>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                users.add(new User(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("password"),
                                   rs.getInt("role"),
                                   rs.getInt("locked")));
            }
        } catch (Exception ex) {}
        return users;
    }

    // Helper function to convert bytes to hexadecimal
    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    public void addUser(String username, String password, int role) {
        // Check password complexity
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1,username);
            pst.setString(2,hashedPassword);
            pst.setInt(3,role);
            pst.executeUpdate();
            pst.close();
            
            
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void editRole (int newRole, int id)   {
        String sql = "UPDATE users SET role = " + newRole + " WHERE id = " + id;

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    //Checks Password Complexity
    public int isPasswordComplex(String password) {
        if (password.length() < 8) {
            return 1; // Password should have at least 8 characters
        }

        if (!password.matches(".*[A-Z].*")) {
            return 2; // Password should contain at least one uppercase letter
        }

        if (!password.matches(".*[a-z].*")) {
            return 3; // Password should contain at least one lowercase letter
        }

        if (!password.matches(".*\\d.*")) {
            return 4; // Password should contain at least one numerical digit
        }

        if (!password.matches(".*[!@#$%^&*()].*")) {
            return 5; // Password should contain at least one special character
        }

        return 6;
    }

    //Modifies Password
    public synchronized void modPassword(String u, String p) {
        String sql = "UPDATE users SET password=? WHERE username=?;";
        String hashedPassword = BCrypt.hashpw(p, BCrypt.gensalt(12));
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1,hashedPassword);
            pst.setString(2,u);
            pst.executeUpdate();
            pst.close();
            
        }
    catch(SQLException e){
        System.out.println(e.getMessage());
        }
    }

    //Function to find User
    public synchronized boolean findUser(String u){
        boolean userExists = false;
        String stmt = "SELECT * FROM users WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(stmt)) {
            pst.setString(1, u);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Username '" + u + "' found!");
                userExists = true;
            }
            rs.close();
            pst.close();

        } catch (Exception e) {
            System.out.print(e);
        }
        return userExists;
    }
    
    public User getUser(String username){
        String stmt = "SELECT * FROM users WHERE username = ?";
        User user = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(stmt)) {
                pst.setString(1, username);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    System.out.println("Username '" + username + "' found!");
                    user = new User(rs.getInt("id"),
                                       rs.getString("username"),
                                       rs.getString("password"),
                                       rs.getInt("role"),
                                       rs.getInt("locked"));
                }
                rs.close();
                pst.close();
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public void removeUser(String username) {
       String sql = "DELETE FROM users WHERE username = '" + username + "'";

       try (Connection conn = DriverManager.getConnection(driverURL);
           Statement stmt = conn.createStatement()) {
           stmt.executeUpdate(sql);
       } catch (Exception ex) {
           System.out.print(ex);
       }
   }
    
    public Product getProduct(String name){
        String sql = "SELECT name, stock, price FROM product WHERE name=?;";
        Product product = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, name);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    product = new Product(rs.getString("name"),
                                       rs.getInt("stock"),
                                       rs.getFloat("price"));
                }
                rs.close();
                pst.close();
                
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return product;
    }
    
    public void setUserLockedStatus(String username, int lockedStatus) {
        String sql = "UPDATE users SET locked = ? WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, lockedStatus);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public static String getCurrentTimeStamp() {
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String date = sdf.format(new Date());
        return date;
    }
}