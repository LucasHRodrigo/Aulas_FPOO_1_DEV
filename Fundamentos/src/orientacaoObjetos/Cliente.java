package orientacaoObjetos;

public class Cliente implements AluguelFilme, CadastroCliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
            return "Cliente{" + "nome=" + nome + '}';
        } else {
            return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
    }

    //Calcula o valor da locação do filme 
    //Regra para filmes comuns
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * VALOR_FILME_SIMPLES;
    }

    //Calcula o valor da locação do filme
    //Regra para lançamentos
    public double calcularLocacao(int qtdeDias, boolean lancamento) {
        return qtdeDias * VALOR_FILME_LANCAMENTO;
    }

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() > 7) {
            System.out.println("O nome  '" + nome + "' é válido");
            return true;
        } else {
            System.out.println("O nome  '" + nome + "' é inválido");
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
            System.out.println("O email '" + email + "' é do Google");
            return true;
        } else {
            System.out.println("O email '" + email + "' não é do Google");
            return false;
        }
    }
}
