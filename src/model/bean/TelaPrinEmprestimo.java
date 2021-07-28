/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author PC-000
 */
public class TelaPrinEmprestimo {
    private int id;
    private String nome_do_livro;
    private String nome_perfil;
    private String data_emprestimo;
    private String data_devolcao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_do_livro() {
        return nome_do_livro;
    }

    public void setNome_do_livro(String nome_do_livro) {
        this.nome_do_livro = nome_do_livro;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolcao() {
        return data_devolcao;
    }

    public void setData_devolcao(String data_devolcao) {
        this.data_devolcao = data_devolcao;
    }
    
    
}
