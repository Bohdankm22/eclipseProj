package bohdan.Databases;

import java.sql.*;

/**
 * Created by bohdansharipov on 2016-12-15.
 */
public class ProjDataAccess {

    private static Connection connection = getConnection();
    private static final String dbUserName = "COMP214_F16_006_N_6";
    private static final String dbUserPassword = "password";
    private static final String dbServerName = "oracle1.centennialcollege.ca";

    public static boolean registerNewUser(String userName, String userPassword) {
        try {
            Statement query = connection.createStatement();
            query.executeQuery(String.format("INSERT INTO NEW_TABLE VALUES ('%s', '%s', 0)", userName, userPassword));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static boolean checkUserCredentials(String userName, String userPassword) {
        try {
            Statement query = connection.createStatement();
            ResultSet rs = query.executeQuery(String.format("Select * from NEW_TABLE WHERE USERNAME='%s' " +
                    "and USERPASS='%s'", userName, userPassword));
            rs.next();
            return rs.getString(1).equals(userName);
        } catch (SQLException e) {
            return false;
        }
    }

    public static int getUserScore(String userName) {
        int score;
        try {
            Statement query = connection.createStatement();
            ResultSet rs = query.executeQuery(String.format("Select * from NEW_TABLE WHERE USERNAME='%s'", userName));
            rs.next();
            score = rs.getInt(3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return score;
    }

    public static boolean updateScore(String userName, int score) {
        try {
            Statement query = connection.createStatement();
            query.executeQuery(String.format("UPDATE NEW_TABLE set USERSCORE = %d WHERE USERNAME='%s'", score, userName));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(String.format("jdbc:oracle:thin:@%s:1521:SQLD", dbServerName),
                    dbUserName, dbUserPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(checkUserCredentials("adsfas", "fadsfasfd"));
        System.out.println(getUserScore("adsfas"));
        System.out.println(updateScore("adsfas", 20));
        System.out.println(getUserScore("adsfas"));

    }

}
