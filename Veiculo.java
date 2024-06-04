/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Veiculo {
    private int codigo;
    private String modelo;
    private String cor;
    private int ano;
    private Marca marca;

    public Veiculo(int codigo, String modelo, String cor, int ano, Marca marca) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getInformacoesVeiculo() {
        return "Código: " + codigo + ", Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano + ", Marca: " + marca.getDescricao();
    }
}



