public class Usuario {

    private String nome;
    private String sobrenome;
    private String formacao;
    private String idade;
    private String nomeImersao;

    public Usuario(){

    }

    public Usuario(String n, String sb, String formac, String idad, String imer){
        this.nome = n;
        this.sobrenome = sb;
        this.formacao = formac;
        this.idade = idad;
        this.nomeImersao= imer;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getIdade() {
        return idade;
    }
     
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNomeImersao() {
        return nomeImersao;
    }

    public void setNomeImersao(String nomeImersao) {
        this.nomeImersao = nomeImersao;
    }


}
