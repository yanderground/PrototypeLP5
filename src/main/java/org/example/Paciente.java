package org.example;

public class Paciente implements Cloneable{


    private String documento;
    private String nome;
    private Endereco endereco;
    private String convenio;
    private String localNascimento;

    public Paciente(String documento, String nome, Endereco endereco,String convenio, String localNascimento) {
        this.documento = documento;
        this.nome = nome;
        this.endereco = endereco;
        this.convenio = convenio;
        this.localNascimento = localNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }


    @Override
    public Paciente clone() throws CloneNotSupportedException {
        Paciente pacienteClone = (Paciente) super.clone();
        pacienteClone.endereco = (Endereco) pacienteClone.endereco.clone();
        return pacienteClone;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "documento: " + documento +
                ", nome: " + nome + '\'' +
                ", endereco: " + endereco +
                ", convenio: " + convenio +
                ", localNascimento: " + localNascimento + '\'' +
                '}';
    }
}
