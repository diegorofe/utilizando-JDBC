package vendasJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendasDAO {

    //consulta vendas.Vendas
    public List<Vendas> list() {
        //lista que irá retornar vendas após consulta
        List<Vendas> vendas = new ArrayList<>();

        try (Connection conn = ConnectonFactory.getConnection()) {
            String sql = "SELECT * FROM sobremesa";

            //preparação
            PreparedStatement stm = conn.prepareStatement(sql);

            //executa a consulta e armazena o retorno no objeto rs
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                int quantidade = rs.getInt("quantidade");
                String cliente = rs.getString("cliente");

                vendas.add(new Vendas(
                        id,
                        descricao,
                        quantidade,
                        cliente
                ));
            }

        } catch (SQLException e) {
            System.out.println("Listagem de alunos FALHOU!");
            e.printStackTrace();
        }

        return vendas;
    }

    public void create(Vendas vendas) {
        try (Connection conn = ConnectonFactory.getConnection()) {

            //prepara o SQL para a inserção de dados da venda de sobremesa
            String sql = "INSERT INTO sobremesa(descricao, quantidade, cliente) VALUES(?, ?, ?) ";

            //prepara o statment com os parâmetros recebidos
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Bolo de pote");
            stmt.setInt(2, 5);
            stmt.setString(3, "Theo");

            //Executa a inserção e armazena o numero de linhas afetadas
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Inserção BEM SUCEDIDA!. Foi adicionada " + rowsAffected + " linha");
        } catch (SQLException e) {
            System.out.println("A inserção falhou");
            e.printStackTrace();
        }
    }

}
