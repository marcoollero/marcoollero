package comlogin.logic;

import comlogin.model.Login;
import comlogin.utilities.dbConnector;

import java.sql.*;



public class login {
    public boolean loginQuery(Login user_accounts) throws SQLException {
        boolean init = true;
        Statement stmt= dbConnector.getConnection().createStatement();
        String query = "SELECT * from user_accounts where username = '" + user_accounts.getUsername() + "' and password = '" + user_accounts.getPassword() + "'";
        ResultSet rs=stmt.executeQuery(query);
        init = rs.next();
        dbConnector.getConnection().close();
        return init;
    }
}
