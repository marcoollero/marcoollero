package comlogin.logic;

import comlogin.model.Login;
import comlogin.utilities.dbConnector;

import java.sql.*;



public class login {
    public boolean loginQuery(Login useraccounts) throws SQLException {
        boolean init = true;
        Statement stmt= dbConnector.getConnection().createStatement();
        String query = "SELECT * from useraccounts where username = '" + useraccounts.getUsername() + "' and password = '" + useraccounts.getPassword() + "'";
        ResultSet rs=stmt.executeQuery(query);
        init = rs.next();
        dbConnector.getConnection().close();
        return init;
    }
}
