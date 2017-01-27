/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */
package view;

import javax.swing.UIManager;

/**
 *
 * @author laurence
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AjoutClientFrame().setVisible(true);
                new MainFrame().setVisible(true);
            }
        });
    }

}
