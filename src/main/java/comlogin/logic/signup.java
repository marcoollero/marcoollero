package comlogin.logic;

import comlogin.model.Login;
import comlogin.model.Signup;
import comlogin.utilities.dbConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class signup {

    public boolean signupQuery(Signup useraccounts) throws SQLException {
        boolean init = true;
        Statement stmt= dbConnector.getConnection().createStatement();
        String query = "INSERT INTO users (user_id, first_name, last_name, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        ResultSet rs=stmt.executeQuery(query);
        init = rs.next();
        dbConnector.getConnection().close();
        return init;
    }
}
