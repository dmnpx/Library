/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     Bibliotheque.java
 * Auteur:      Damien Papaux
 * Description: Classe implémentée sous forme de singleton, afin qu'il n'y ait 
 * qu'une seule bibliothèque dans le programme
 */
package business;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public final class Bibliotheque {
    
    // Référence sur l'instance de la bibliothèque
    private static volatile Bibliotheque instance = null;
    
    // Attribut
    private String nom;
    
    // Listes
    private HashMap<Integer, Exemplaire> listeExemplaires = new HashMap();
    private HashMap<Integer,Client> listeClients = new HashMap();
    
    // Constructeur privé pour le singleton
    private Bibliotheque(String nom) {
        this.nom = nom;
        
        // Ajout de quelques clients et livres
        initialiser();
    }

    // Retourne une référence à la bibliothèque unique
    public static Bibliotheque getInstance(){
        if(instance == null){
            instance = new Bibliotheque("Biblio");
        }
        return instance;
    }
    
    // Getters / Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode permettant d'ajouter un client à la liste
    public void ajouterClient(int noClient, Client client){
        listeClients.put(noClient, client);
    }
    
    // Méthode permettant d'ajouter un exemplaire à la liste
    public void ajouterExemplaire(int noExemplaire, Exemplaire exemplaire){
        listeExemplaires.put(noExemplaire, exemplaire);
    }
    
    // Méthode permettant de rechercher un client dans la liste 
    // par son numéro de client
    public Client rechercherClient(int noClient){
        return listeClients.get(noClient);
    }
    
    // Méthode permettant derechercher un exemplaire dans la liste 
    // par son numéro d'exemplaire
    public Exemplaire rechercherExemplaire(int noExemplaire){
        return listeExemplaires.get(noExemplaire);
    }
    
    // Méthode permettant de rechercher un client dans la liste 
    // par son numéro de client
    public ArrayList<Client> rechercherClients(){
        return new ArrayList();
    }

    public HashMap<Integer, Exemplaire> getListeExemplaires() {
        return listeExemplaires;
    }

    public HashMap<Integer, Client> getListeClients() {
        return listeClients;
    }
    
    private void initialiser() {
        // Formattage de la date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        // Ajout de deux clients
        LocalDate dateDeNaissanceFmt = LocalDate.parse("24.09.1992", formatter);    
        Client c = new Client("Monsieur", "Marc", "Bonjour", dateDeNaissanceFmt,
                              "Monts 45", 1200, "Genève", "m.b@gmail.com", true);
        this.ajouterClient(c.getNoClient(), c);
        
        dateDeNaissanceFmt = LocalDate.parse("10.10.1998", formatter);    
        c = new Client("Madame", "Flavie", "Morales", dateDeNaissanceFmt,
                       "Lac 67", 2300, "La Chaux-de-Fonds", "m.b@gmail.com", true);
        this.ajouterClient(c.getNoClient(), c);
    }
}
