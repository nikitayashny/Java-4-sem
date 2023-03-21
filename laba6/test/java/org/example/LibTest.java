package org.example;

import org.example.DBO.DAOConnection;
import org.example.DBO.Request;
import org.example.Planet.Planet;
import org.junit.Ignore;
import org.junit.Test;
import java.sql.Connection;
import java.util.List;
import static org.junit.Assert.assertNotNull;

public class LibTest {
    @Ignore
    @Test
    public void testObj()
    {
        Planet a = new Planet();
        assertNotNull(a);
    }
    @Test
    public void testConnection() throws Exception
    {
        DAOConnection dao = new DAOConnection();
        dao.Connect();
    }

    @Test
    public void testSqlQuery() throws Exception
    {
        var manager = new DAOConnection();
        var connection = manager.Connect();
        var requests = new Request(connection);

        requests.getPlanetsWithLife();
    }
}
