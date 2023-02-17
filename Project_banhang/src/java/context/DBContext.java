
package context;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    
    private final String serverName = "QUYH\\SQLEXPRESS";
    private final String dbName = "Wish";
    private final String portNumber = "1433";
    private final String instance = "";
    private final String userID = "sa";
    private final String password = "12345";
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName +":"+ portNumber + "\\" + instance+";databaseName="+dbName;
        if (instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber+";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    
    public static void main(String[] args) {
        DBContext db = new DBContext();
        try {
             System.out.println(db.getConnection());
        } catch (Exception e) {
        }
    }
}
 