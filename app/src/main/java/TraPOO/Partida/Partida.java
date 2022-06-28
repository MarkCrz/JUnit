/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Partida;

import TraPOO.Time.Time;

/**
 *
 * @author marco
 */
public class Partida {
    private String dataPartida;
    private Time casa;
    private Time visitante;
    private int golsCasa;
    private int golsVisitante;

    public Partida(String dataPartida, Time casa, Time visitante) {
        this.dataPartida = dataPartida;
        this.casa = casa;
        this.visitante = visitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    //Funções sets
    public void setGolsCasa() {
        golsCasa++;
    }

    public void setGolsVisitante() {
        golsVisitante++;
    }
    
    
    
    //Funções gets
    public String getDataPartida() {
        return dataPartida;
    }

    public String getCasa() {
        return casa.getNome();
    }

    public String getVisitante() {
        return visitante.getNome();
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }
    
    //Funções gerais
    public void Simulacao() {
        
    }
    
    
}
