package view;

/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     MainFrame.java
 * Auteur:      Damien Papaux
 * Description: 
 */

import javax.swing.JDialog;
import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 480);
        
        btnGestionClient.setEnabled(false);
        btnGestionLivre.setEnabled(false);
        btnGestionExemplaire.setEnabled(false);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAjouts = new javax.swing.JPanel();
        btnNouveauClient = new javax.swing.JButton();
        btnNouveauLivre = new javax.swing.JButton();
        btnNouvelEmprunt = new javax.swing.JButton();
        pGestion = new javax.swing.JPanel();
        btnGestionClient = new javax.swing.JButton();
        btnGestionLivre = new javax.swing.JButton();
        btnGestionExemplaire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de la bibliothèque");

        pAjouts.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajouts"));

        btnNouveauClient.setText("Nouveau client");
        btnNouveauClient.setPreferredSize(new java.awt.Dimension(170, 30));
        btnNouveauClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouveauClientActionPerformed(evt);
            }
        });

        btnNouveauLivre.setText("Nouveau livre");
        btnNouveauLivre.setMaximumSize(new java.awt.Dimension(111, 23));
        btnNouveauLivre.setMinimumSize(new java.awt.Dimension(111, 23));
        btnNouveauLivre.setPreferredSize(new java.awt.Dimension(170, 30));
        btnNouveauLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouveauLivreActionPerformed(evt);
            }
        });

        btnNouvelEmprunt.setText("Nouvel emprunt");
        btnNouvelEmprunt.setMaximumSize(new java.awt.Dimension(111, 23));
        btnNouvelEmprunt.setMinimumSize(new java.awt.Dimension(111, 23));
        btnNouvelEmprunt.setPreferredSize(new java.awt.Dimension(170, 30));
        btnNouvelEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouvelEmpruntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAjoutsLayout = new javax.swing.GroupLayout(pAjouts);
        pAjouts.setLayout(pAjoutsLayout);
        pAjoutsLayout.setHorizontalGroup(
            pAjoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAjoutsLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(pAjoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNouvelEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pAjoutsLayout.createSequentialGroup()
                        .addComponent(btnNouveauClient, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNouveauLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        pAjoutsLayout.setVerticalGroup(
            pAjoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAjoutsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAjoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNouveauClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNouveauLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnNouvelEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pGestion.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion"));

        btnGestionClient.setText("Gestion des clients");
        btnGestionClient.setMaximumSize(new java.awt.Dimension(111, 23));
        btnGestionClient.setMinimumSize(new java.awt.Dimension(111, 23));
        btnGestionClient.setPreferredSize(new java.awt.Dimension(170, 30));
        btnGestionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClientActionPerformed(evt);
            }
        });

        btnGestionLivre.setText("Gestion des livres");
        btnGestionLivre.setMaximumSize(new java.awt.Dimension(150, 23));
        btnGestionLivre.setMinimumSize(new java.awt.Dimension(150, 23));
        btnGestionLivre.setPreferredSize(new java.awt.Dimension(170, 30));

        btnGestionExemplaire.setText("Gestion des exemplaires");
        btnGestionExemplaire.setMaximumSize(new java.awt.Dimension(150, 23));
        btnGestionExemplaire.setMinimumSize(new java.awt.Dimension(150, 23));
        btnGestionExemplaire.setPreferredSize(new java.awt.Dimension(170, 30));

        javax.swing.GroupLayout pGestionLayout = new javax.swing.GroupLayout(pGestion);
        pGestion.setLayout(pGestionLayout);
        pGestionLayout.setHorizontalGroup(
            pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGestionLayout.createSequentialGroup()
                        .addComponent(btnGestionExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pGestionLayout.createSequentialGroup()
                        .addComponent(btnGestionClient, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnGestionLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        pGestionLayout.setVerticalGroup(
            pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnGestionExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAjouts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pAjouts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(pGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNouveauClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouveauClientActionPerformed
        // Devrait être un JDialog
        AjoutClientFrame f = new AjoutClientFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnNouveauClientActionPerformed

    private void btnNouveauLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouveauLivreActionPerformed
        AjoutLivreDialog d = new AjoutLivreDialog(this,true);
        d.setVisible(true);
    }//GEN-LAST:event_btnNouveauLivreActionPerformed

    private void btnNouvelEmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouvelEmpruntActionPerformed
        AjoutEmpruntDialog d = new AjoutEmpruntDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_btnNouvelEmpruntActionPerformed

    private void btnGestionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionClient;
    private javax.swing.JButton btnGestionExemplaire;
    private javax.swing.JButton btnGestionLivre;
    private javax.swing.JButton btnNouveauClient;
    private javax.swing.JButton btnNouveauLivre;
    private javax.swing.JButton btnNouvelEmprunt;
    private javax.swing.JPanel pAjouts;
    private javax.swing.JPanel pGestion;
    // End of variables declaration//GEN-END:variables
}
