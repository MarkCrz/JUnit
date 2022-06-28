/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Jogador;

/**
 *
 * @author marco
 */
public class Defensor extends Jogador {
    private int cobertura;
    private int desarme;

    public Defensor(int pCobertura, int pDesarme, String pNome, String pData, int pCamisa) {
        super(pNome, pData, pCamisa);
        this.cobertura = pCobertura;
        this.desarme = pDesarme;
        setHabilidade();
        setFuncao();
    }

    
    //Funções sets
    public void setCobertura(int pCobertura) {
        this.cobertura = pCobertura;
    }

    public void setDesarme(int pDesarme) {
        this.desarme = pDesarme;
    }
    
    @Override
    public void setHabilidade() {
        this.habilidade = cobertura * 6 + desarme * 4;
    }
    
    @Override
    public void setFuncao() {
        this.funcao = "Defensor";
    }
    

    //Funções gets
    public int getCobertura() {
        return cobertura;
    }

    public int getDesarme() {
        return desarme;
    }
    
    
}
