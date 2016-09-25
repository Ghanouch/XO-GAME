/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo;

import java.awt.Color;
import java.util.logging.Logger;

/**
 *
 * @author l.IsSaM.l
 */
public class Personne {
    
    private Color Col ;
    private int num_jeux;
    private boolean sonTour;
    private String nom ;

    public Color getCol() {
        return Col;
    }

    public int getNum_jeux() {
        return num_jeux;
    }

    public void setCol(Color Col) {
        this.Col = Col;
    }

    public Personne(Color Col, int num_jeux, boolean sonTour, String nom) {
        this.Col = Col;
        this.num_jeux = num_jeux;
        this.sonTour = sonTour;
        this.nom = nom;
    }

    public void setNum_jeux(int num_jeux) {
        this.num_jeux = num_jeux;
    }

    public void setSonTour(boolean sonTour) {
        this.sonTour = sonTour;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isSonTour() {
        return sonTour;
    }

    public String getNom() {
        return nom;
    }
   

    /**C
     * @param args the command line arguments
     */
    
}
