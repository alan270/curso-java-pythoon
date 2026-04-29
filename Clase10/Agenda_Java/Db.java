package Clase10.Agenda_Java;

import java.sql.*;





public class Db {
    static {
        try { Class.forName("org.postgresql.Driver"); }
        catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver PostgreSQL no encontrado en el classpath.", e);
        }
    }
    private static final String URL  = "jdbc:postgresql://localhost:5432/postgres"; //Protocolo/host/puerto/Basededatos 
    private static final String USER = "postgres";   // cambia si usas otro usuario
    private static final String PASS = "Bimbo321";// <-- pon tu password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void ensureSchema() {
        String sql = """
            CREATE TABLE IF NOT EXISTS contacts_java (
              id SERIAL PRIMARY KEY,
              name  VARCHAR(100) NOT NULL,
              phone VARCHAR(20)  NOT NULL,
              email VARCHAR(100) NOT NULL
            );
        """;
        try (Connection cn = getConnection();
             Statement st = cn.createStatement()) {  // es como el curso de python, la herramienta que te ayuda a ejecutar la consulta
            st.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creando tabla: " + e.getMessage());

        }
    }
}
