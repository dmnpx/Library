/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     Client.java
 * Auteur:      Damien Papaux
 * Description: 
 */

package business;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    
    // Attributs
    private int noClient;
    private String formuleAppel;
    private String prenom;
    private String nom;
    private LocalDate dateDeNaissance;
    private String adresse;
    private int npa;
    private String localite;
    private String adresseMail;
    private boolean newsletter;
    private static int noClientMax=1000; // numéro de départ
    
    ArrayList<Emprunt> listeEmprunts = new ArrayList();
    
    // Constructeur
    public Client() {
    }

    public Client(String formuleAppel, String prenom, String nom, 
                  LocalDate dateDeNaissance, String adresse, int npa, 
                  String localite, String adresseMail, boolean newsletter ) {
        this.noClient = ++noClientMax;
        this.formuleAppel = formuleAppel;
        this.prenom = prenom;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.npa = npa;
        this.localite = localite;
        this.adresseMail = adresseMail;
        this.newsletter = newsletter;
    }

    public int getNoClient() {
        return noClient;
    }

    public void setNoClient(int noClient) {
        this.noClient = noClient;
    }

    public String getFormuleAppel() {
        return formuleAppel;
    }

    public void setFormuleAppel(String formuleAppel) {
        this.formuleAppel = formuleAppel;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDeNaissance() {
       return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNpa() {
        return npa;
    }

    public void setNpa(int npa) {
        this.npa = npa;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public ArrayList<Emprunt> getListeEmprunts() {
        return listeEmprunts;
    }

    public void setListeEmprunts(ArrayList<Emprunt> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }
    
    public void ajouterEmprunt( Emprunt e ) {
        this.listeEmprunts.add(e);
    }
    
}
