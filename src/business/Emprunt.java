/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */

package business;

import java.time.LocalDate;

/**
 *
 * @author laurence
 */
public class Emprunt {
    
    private LocalDate dateEmprunt;
    private LocalDate dateRendu;
    private Exemplaire exemplaire;
    
    public Emprunt() {}

    public Emprunt(LocalDate dateEmprunt, LocalDate dateRendu, Exemplaire exemplaire) {
        this.dateEmprunt = dateEmprunt;
        this.dateRendu = dateRendu;
        this.exemplaire = exemplaire;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRendu() {
        return dateRendu;
    }

    public void setDateRendu(LocalDate dateRendu) {
        this.dateRendu = dateRendu;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }    
}
