/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */

package business;

/**
 *
 * @author laurence
 */
public class Livre {
    private String titre;
    private String auteur;
    private String editeur;
    private String genre;
    private String evaluation;
    private String illustration;
    
    public Livre() {}

    public Livre(String titre, String auteur, String editeur, String genre, String evaluation, String illustration) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.genre = genre;
        this.evaluation = evaluation;
        this.illustration = illustration;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }
}
