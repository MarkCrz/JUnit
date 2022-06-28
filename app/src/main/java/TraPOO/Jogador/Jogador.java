/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Jogador;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public abstract class Jogador {
    private String nome;
    private int idade;
    private int gols;
    private int camisa;
    int habilidade;
    String funcao;
    public abstract void setHabilidade();
    public abstract void setFuncao();
    
    public Jogador(String pNome, String pData, int pCamisa) {
        this.nome = pNome;
        this.idade = setIdade(pData);
        this.gols = 0;
        this.camisa = pCamisa;
        this.habilidade = 0;
        this.funcao = "";
    }
    
    //Funções de set
    public void setCamisa(int pCamisa) {
        this.camisa = pCamisa;
    } 
    
    private int setIdade(String pData) {
        LocalDate hoje = LocalDate.now();
        LocalDate data = LocalDate.parse(pData);
        return Period.between(data, hoje).getYears();
    }
    
    
    
    // Funções de get
    public String getNome() {
        return nome;
    }
    
    public int getGols() {
        return gols;
    }
    
    public int getCamisa() {
        return camisa;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public int getHabilidade () {
        return habilidade;
    }

    public String getFuncao() {
        return funcao;
    }
    
    
    //Funções gerais
    public void somaGol() {
        this.gols = this.gols + 1; 
    }
}
