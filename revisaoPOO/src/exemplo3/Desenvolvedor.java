package exemplo3;

public class Desenvolvedor extends Funcionario implements UsuarioAutenticavel {
    private String senha;

    private DadosAutenticacao dadosAutenticacao;

    public Desenvolvedor(String n, String s, double sal, String login, String pass) {
        super(n,s,sal);
        dadosAutenticacao = new DadosAutenticacao(login, pass);
    }
    @Override
    public boolean autentica(String login, String senha) {
        if(login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
            return true;
        else return false;
    }
}
