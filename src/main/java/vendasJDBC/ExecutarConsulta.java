package vendasJDBC;

import java.util.List;

public class ExecutarConsulta {

    public static void main(String[] args) {

        VendasDAO vendasDAO = new VendasDAO();

        List<vendasJDBC.Vendas> vendas = vendasDAO.list();

        vendas.stream().forEach(System.out::println);
//---------------------------------------------------

Vendas vendaInsercao = new Vendas(
            "bolo de pote",
        5,
        "Theo"
);

vendasDAO.create(vendaInsercao);

    }
}
