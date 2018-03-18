import models.JavaEETechnology;
import models.JavaEETechnologyVersions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J2EeHandbookService {
    private static final Logger log = LogManager.getLogger(J2EeHandbookService.class);

    public JavaEETechnology[] getAllTechnologies() {
        List<JavaEETechnology> list = new ArrayList<JavaEETechnology>();
        try {
            final String SQL =
                    "SELECT tech_id, tech_name, j2ee_v1_4, java_5, java_6, java_7, java_8, description\n" +
                            "FROM java_technologies INNER JOIN used_versions\n" +
                            "ON java_technologies.versions = used_versions.used_versions_id";

            ResultSet rs = executeMySqlQuery(SQL);
            while (rs.next()) {
                list.add(fromResultSetToJavaEETechnologyObject(rs));
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return list.toArray(new JavaEETechnology[0]);
    }

    public void addTechnology(JavaEETechnology technology) {
        try {
            final String SQL =
                    "SELECT tech_id, tech_name, j2ee_v1_4, java_5, java_6, java_7, java_8, description\n" +
                            "FROM j2eehandbook.java_technologies jt INNER JOIN j2eehandbook.used_versions uv\n" +
                            "ON jt.versions = uv.used_versions_id";

            executeMySqlQuery(SQL);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public void removeTechnology(JavaEETechnology technology) {
        try {
            final String SQL =
                    "SELECT tech_id, tech_name, j2ee_v1_4, java_5, java_6, java_7, java_8, description\n" +
                            "FROM java_technologies INNER JOIN used_versions\n" +
                            "ON java_technologies.versions = used_versions.used_versions_id";

            executeMySqlQuery(SQL);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public void updateTechnology(JavaEETechnology technology) {
        try {
            final String SQL =
                    "SELECT tech_id, tech_name, j2ee_v1_4, java_5, java_6, java_7, java_8, description\n" +
                            "FROM java_technologies INNER JOIN used_versions\n" +
                            "ON java_technologies.versions = used_versions.used_versions_id";

            executeMySqlQuery(SQL);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private ResultSet executeMySqlQuery(String SQL) throws SQLException {
        Database db = new Database("jdbc/j2eehandbook");
        Statement stmt = db.getConnection().createStatement();
        return stmt.executeQuery(SQL);
    }

    private JavaEETechnology fromResultSetToJavaEETechnologyObject(ResultSet rs) throws SQLException {
        String name = rs.getString("tech_name");
        String v4 = rs.getString("j2ee_v1_4");
        String v5 = rs.getString("java_5");
        String v6 = rs.getString("java_6");
        String v7 = rs.getString("java_7");
        String v8 = rs.getString("java_8");
        String description = rs.getString("description");
        return new JavaEETechnology(name, new JavaEETechnologyVersions(v4, v5, v6, v7, v8), description);
    }
}
