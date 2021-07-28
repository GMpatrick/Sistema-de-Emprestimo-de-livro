/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC-000
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }

    ModeloTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // getters e setters

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.setColunas(colunas);
    }
    
    // getters e setters
    //metodos
    
    @Override
    public int getColumnCount(){ // conta o numeros de colunas
        return getColunas().length;
    }
    
    @Override
    public int getRowCount(){ // conta o numero de linhas
        return getLinhas().size();
        
    }
    
    @Override
    public String getColumnName(int numCol){ // ele vai pega o nome da coluna
        return getColunas()[numCol];
    }
    

    @Override
    public Object getValueAt(int numLin, int numCol){ // ele vai adicionar as linha da nossa tabela
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];          
    }

    
}
