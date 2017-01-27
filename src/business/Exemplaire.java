package business;

/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */

import java.time.LocalDate;


public class Exemplaire {
    private int noExemplaire;
    private Livre livre;
    private static int dernierNoExemplaire=0;

    public Exemplaire() {}
    
    public Exemplaire(Livre livre) {
        this.noExemplaire = ++dernierNoExemplaire;
        this.livre = livre;
    }

    public int getNoExemplaire() {
        return noExemplaire;
    }

    public void setNoExemplaire(int noExemplaire) {
        this.noExemplaire = noExemplaire;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}
