/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Jogador;

/**
 *
 * @author marco
 */
public class Atacante extends Jogador {
    private int velocidade;
    private int tecnica;

    public Atacante(int pVelocidade, int pTecnica, String pNome, String pData, int pCamisa) {
        super(pNome, pData, pCamisa);
        this.velocidade = pVelocidade;
        this.tecnica = pTecnica;
        setHabilidade();
        setFuncao();
    }
    
    //Funções sets
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
    
    @Override
    public void setHabilidade() {
        this.habilidade = velocidade * 4 + tecnica * 6;
    }
    
    @Override
    public void setFuncao() {
        this.funcao = "Atacante";
    }
    
    //Funçoes gets
    public int getVelocidade() {
        return velocidade;
    }

    public int getTecnica() {
        return tecnica;
    }
    
    
}
