/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Jogador;

/**
 *
 * @author marco
 */
public class Goleiro extends Jogador{
    private int altura;
    private int reflexo;

    public Goleiro(int pAltura, int pReflexo, String pNome, String pData, int pCamisa) {
        super(pNome, pData, pCamisa);
        this.altura = pontuacaoAltura(pAltura);
        this.reflexo = pReflexo;
        setHabilidade();
        setFuncao();
    }

    
    //Funções sets
    public void setAltura(int pAltura) {
        this.altura = pontuacaoAltura(pAltura);
    }

    public void setReflexo(int pReflexo) {
        this.reflexo = pReflexo;
    }

    @Override
    public void setHabilidade() {
        this.habilidade = altura * 4 + reflexo * 6;
    }

    
    @Override
    public void setFuncao() {
        this.funcao = "Goleiro";
    }
    

    
    
    //Funções gets
    public int getAltura() {
        return altura;
    }

    public int getReflexo() {
        return reflexo;
    }
    
    
    //Funções de calculos
    private int pontuacaoAltura(int pAltura) {
        if (pAltura > 210) {
            return Math.round(210 * 100 / 210);
        } else if (pAltura <= 210 && pAltura >= 0) {
            return Math.round(pAltura * 100 / 210);
        } else {
            return 0;
        }
    }

    
}
