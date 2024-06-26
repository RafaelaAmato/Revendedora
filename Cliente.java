package modelo;

import java.util.Date;

public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(int codigo, String nome, String cpf, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getInformacoesCliente() {
        return "Código: " + codigo + ", Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco.getDescricao();
    }
    public void comprarVeiculo(Revendedora revendedora, Veiculo veiculo, double valor) {
        int codigoCompra = revendedora.getProximoCodigoCompra();
        Compra compra = new Compra(codigoCompra, new Date(), valor, this, veiculo);
        revendedora.registrarCompra(compra);
    }
}
