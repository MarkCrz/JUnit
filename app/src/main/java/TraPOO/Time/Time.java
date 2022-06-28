/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraPOO.Time;

import TraPOO.Jogador.Jogador;

/**
 *
 * @author marco
 */
public class Time {

    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private Jogador goleiro;
    private Jogador atacante1;
    private Jogador atacante2;
    private Jogador defensor1;
    private Jogador defensor2;

    public Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.goleiro = null;
        this.atacante1 = null;
        this.atacante2 = null;
        this.defensor1 = null;
        this.defensor2 = null;
    }

    //Funções Sets
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setJogador(Jogador pJogador) {
        if (possuiCamisa(pJogador)) {
            System.out.println("Ja possui um jogador com essa camisa no time!");
        } else {
            setarJogador(pJogador);
        }

    }

    //Funções gets
    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public String getJogadores() {
        return "Goleiro: " + getNome(goleiro)
                + "\nAtacantes: " + getNome(atacante1) + " e " + getNome(atacante2)
                + "\nDefensores: " + getNome(defensor1) + " e " + getNome(defensor2);
    }

    public int getPontos() {
        return (vitorias * 3) + empates;
    }

    private String getNome(Jogador pJogador) {
        if (pJogador == null) {
            return "Ninguem";
        } else {
            return pJogador.getNome();
        }
    }

    //Funções gerais
    private boolean possuiCamisa(Jogador pJogador) {
        boolean possuiCamisa = false;

        if (goleiro != null && goleiro.getCamisa() == pJogador.getCamisa()) {
            possuiCamisa = true;
        } else if (atacante1 != null && atacante1.getCamisa() == pJogador.getCamisa()) {
            possuiCamisa = true;
        } else if (atacante2 != null && atacante2.getCamisa() == pJogador.getCamisa()) {
            possuiCamisa = true;
        } else if (defensor1 != null && defensor1.getCamisa() == pJogador.getCamisa()) {
            possuiCamisa = true;
        } else if (defensor2 != null && defensor2.getCamisa() == pJogador.getCamisa()) {
            possuiCamisa = true;
        }

        return possuiCamisa;
    }

    private void setarJogador(Jogador pJogador) {
        if (pJogador.getFuncao() == "Goleiro" && goleiro == null) {
            this.goleiro = pJogador;
        } else if (pJogador.getFuncao() == "Atacante" && atacante1 == null) {
            this.atacante1 = pJogador;
        } else if (pJogador.getFuncao() == "Atacante" && atacante2 == null) {
            this.atacante2 = pJogador;
        } else if (pJogador.getFuncao() == "Defensor" && defensor1 == null) {
            this.defensor1 = pJogador;
        } else if (pJogador.getFuncao() == "Defensor" && defensor2 == null) {
            this.defensor2 = pJogador;
        } else {
            System.out.println("A funcao ja esta preenchida!");
        }
    }

    public int totalHabilidade() {
        int total = 0;

        if (goleiro != null) {
            total = total + goleiro.getHabilidade();
        }
        if (atacante1 != null) {
            total = total + atacante1.getHabilidade();
        }
        if (atacante2 != null) {
            total = total + atacante2.getHabilidade();
        }
        if (defensor1 != null) {
            total = total + defensor1.getHabilidade();
        }
        if (defensor2 != null) {
            total = total + defensor2.getHabilidade();
        }
        return total;
    }
}
