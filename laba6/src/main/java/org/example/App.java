package org.example;

import org.example.DBO.DAOConnection;
import org.example.DBO.Request;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class App 
{
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(String.valueOf(App.class));

    public static void main( String[] args ) throws ClassNotFoundException, SQLException, IOException {
        FileHandler fh;
        fh = new FileHandler("C:\\Users\\User\\Desktop\\TPI\\laba6\\Log.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Started main");
        var manager = new DAOConnection();
        var connection = manager.Connect();
        var requests = new Request(connection);

        requests.getPlanetsWithLife();
        requests.getPlanetsWithMinRadius();
        requests.getSputnicsWithMaxRadius();
        requests.req("test",99999);
        manager.Disconnect(connection);
    }
}
