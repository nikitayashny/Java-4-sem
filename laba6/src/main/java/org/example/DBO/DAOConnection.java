package org.example.DBO;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class DAOConnection {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(String.valueOf(DAOConnection.class));

    public java.sql.Connection Connect() throws ClassNotFoundException {
        java.sql.Connection con = null;
        String userName = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/planet";
        Class.forName("com.mysql.jdbc.Driver");
        try{
            FileHandler fh;
            fh = new FileHandler("C:\\Users\\User\\Desktop\\TPI\\laba6\\Log.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            con = DriverManager.getConnection(connectionUrl,userName,password);
            logger.info("Connected");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return con;
    }
    public void Disconnect(java.sql.Connection con){
        try{
            FileHandler fh;
            fh = new FileHandler("C:\\Users\\User\\Desktop\\TPI\\Log.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            con.close();
        }
        catch(SQLException | IOException e){
            e.printStackTrace();
        }
        logger.info("Disconnected");
    }
}
