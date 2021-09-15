package vendasJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectonFactory {

    //Construtor declarado como privado. Evitando assim criar instâncias da fábrica.
    private ConnectonFactory() {
        throw new UnsupportedOperationException();
    }

    //obtem conexão com o banco
    public static Connection getConnection() {
//connection sera retornado apos receber os parametros das proximas linhas
        Connection conn = null;

        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "vendasJDBC";
        String user = "root";
        String password = "246890";
        // String urlConnection = "jdbc:mysql://localhost/vendas";

        //Construção da string de conexão
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);


        String urlConnection = sb.toString(); //String urlConnection = "jdbc:mysql://localhost/vendas";


        //Cria conexão usando o DriverManeger, passando os parâmetros de conexão
        try {
            conn = DriverManager.getConnection(urlConnection, user, password);
        } catch (SQLException e) {
            System.out.println("ERRO AO CONECTAR COM  BANCO DE DADOS:");
            throw new RuntimeException(e);
        }

        return conn;
    }
}
