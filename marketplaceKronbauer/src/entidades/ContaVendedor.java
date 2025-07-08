package entidades;

import entidades.enumeradas.Tipo;

public class ContaVendedor extends Conta{
    private String loja;

    public ContaVendedor(Integer id, String nome, String email, String senha, String loja) {
        super(id, nome, email, senha);
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    @Override
        public String toString() {
            String linha = "+----------------------+--------------------------+\n";
            return linha +
                    String.format("| %-20s | %-24s |\n", "Tipo de Conta", "Vendedor") +
                    linha +
                    String.format("| %-20s | %-24d |\n", "ID", getId()) +
                    String.format("| %-20s | %-24s |\n", "Nome", getNome()) +
                    String.format("| %-20s | %-24s |\n", "Email", getEmail()) +
                    String.format("| %-20s | %-24s |\n", "Loja", loja) +
                    linha;
        }

}
