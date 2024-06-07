package comlogin.logic;

import comlogin.model.Menu;
import comlogin.utilities.dbConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class menulogic {

    public boolean MenulogicQuery(Menu Toppings) throws SQLException {
        boolean init = true;
        Statement stmt = dbConnector.getConnection().createStatement();
        String query = "SELECT * from Toppings where productname = '" + Toppings.getProductname() + "' and price = '" + Toppings.getPrice() + "'";
        ResultSet rs = stmt.executeQuery(query);
        init = rs.next();
        dbConnector.getConnection().close();
        return init;
    }

    public boolean Menulogicquery (Menu IceCreamProducts) throws SQLException {
        boolean init = true;
        Statement stmt = dbConnector.getConnection().createStatement();
        String query = "SELECT * from IceCreamProducts where name = '" + IceCreamProducts.getName() + "' and price = '" + IceCreamProducts.getBase_price() + "'";
        ResultSet rs = stmt.executeQuery(query);
        init = rs.next();
        dbConnector.getConnection().close();
        return init;


    }
}
