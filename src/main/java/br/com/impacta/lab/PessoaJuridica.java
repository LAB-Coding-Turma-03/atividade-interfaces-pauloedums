package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa{
    
    private String documento;
    private String tipoPessoa;

    public PessoaJuridica(String documento, String tipoPessoa) {
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public String falarDocumento() {
        return "o tipo de pessoa é " + this.getTipo() + " e o nº do documento é " + this.getDocumento();
    }

    public String getTipo() {
        return this.tipoPessoa;
    }

    public String getDocumento() {
        return this.documento;
    }
}
