import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ResourceBundle;

public class Database {
    private DataSource dataSource;

    public Database(String jndiname) {
        try {
            dataSource = (DataSource) new InitialContext().lookup("java:comp/env/" + jndiname);
        } catch (NamingException e) {
            throw new IllegalStateException(jndiname + " is missing in JNDI!", e);
        }
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
