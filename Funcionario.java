/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(int codigo, String nome, String cpf, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularComissao(double totalVendas) {
        return totalVendas * 0.05; 
    }

    public String getInformacoesFuncionario() {
        return "Código: " + codigo + ", Nome: " + nome + ", CPF: " + cpf + ", Salário Base: " + salarioBase;
    }
}


