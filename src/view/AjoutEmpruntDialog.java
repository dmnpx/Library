package view;

/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */

import business.Bibliotheque;
import business.Client;
import business.Emprunt;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class AjoutEmpruntDialog extends javax.swing.JDialog {

    /**
     * Creates new form AjoutEmprunt
     */
    public AjoutEmpruntDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 480);
        this.setResizable(false);
        btnEmprunter.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNoClient = new javax.swing.JLabel();
        txtNoClient = new javax.swing.JTextField();
        btnRechercher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtClient = new javax.swing.JTextArea();
        lblEmprunts = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEmprunts = new javax.swing.JTextArea();
        btnEmprunter = new javax.swing.JButton();
        btnRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nouvel emprunt");

        lblNoClient.setText("No client");

        txtNoClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedNoClient(evt);
            }
        });

        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        txtClient.setColumns(20);
        txtClient.setRows(5);
        jScrollPane1.setViewportView(txtClient);

        lblEmprunts.setText("Emprunts effectués");

        txtEmprunts.setColumns(20);
        txtEmprunts.setRows(5);
        jScrollPane2.setViewportView(txtEmprunts);

        btnEmprunter.setMnemonic('A');
        btnEmprunter.setText("Ajouter un emprunt");
        btnEmprunter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprunterActionPerformed(evt);
            }
        });

        btnRetour.setMnemonic('R');
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmprunts)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNoClient)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRechercher))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmprunter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRetour)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoClient)
                    .addComponent(txtNoClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRechercher))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmprunts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmprunter)
                    .addComponent(btnRetour))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        // On définit un motif pour un nombre
        String motif="^[0-9]{1,}$";

        // Récupérer le numéro de client saisi
        String noClient = txtNoClient.getText();
        
        if ( ! noClient.matches(motif) ) {
            txtNoClient.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Veuillez saisir un numéro de client correct");
        }
        else {
            // On recherche le client dans la bibliotheque
            Bibliotheque biblio = Bibliotheque.getInstance();
            client = biblio.rechercherClient(Integer.parseInt(noClient));
            
            // On affiche les coordonnées du client
            txtClient.setText(client.getPrenom() + " " + client.getNom() + '\n' + 
                    client.getAdresse() + '\n' +
                    client.getNpa() + " " + client.getLocalite());
            
            // On met à jour les emprunts du client
            txtEmprunts.setText("");
            for ( int i = 0; i < client.getListeEmprunts().size(); i++) {
                Emprunt emprunt = client.getListeEmprunts().get(i);            
                
                txtEmprunts.setText( emprunt.getExemplaire().getLivre().getTitre() +
                                     " " + 
                                     emprunt.getDateEmprunt().toString() +
                                     '\n');
            }
            
            // On active le bouton ajouter un emprunt
            btnEmprunter.setEnabled(true);
        }
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void btnEmprunterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprunterActionPerformed
        AjoutEmpruntExemplaireDialog d = new AjoutEmpruntExemplaireDialog((JFrame)getParent(),true, client);
        d.setVisible(true);
    }//GEN-LAST:event_btnEmprunterActionPerformed

    private void focusGainedNoClient(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedNoClient
        txtNoClient.setBackground(Color.white);
    }//GEN-LAST:event_focusGainedNoClient

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

   // Méthode permettant de rafraichir les emprunts
   public void rafraichirEmprunts( String str ) {
       txtEmprunts.setText(txtEmprunts.getText() + '\n' + str);
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmprunter;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnRetour;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmprunts;
    private javax.swing.JLabel lblNoClient;
    private javax.swing.JTextArea txtClient;
    private javax.swing.JTextArea txtEmprunts;
    private javax.swing.JTextField txtNoClient;
    // End of variables declaration//GEN-END:variables
    private Client client;
}
