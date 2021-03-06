package view;

/*
 * Projet:      Bibliotheque - module 120
 * Fichier:     AjoutEmpruntExemplaireDialog.java
 * Auteur:      Damien Papaux
 * Description: 
 */

import business.Bibliotheque;
import business.Client;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AjoutClientFrame extends javax.swing.JFrame {

    /**
     * Creates new form AjoutClientFrame
     */
    public AjoutClientFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        btnAjouter.setEnabled(true);
        btnEffacer.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNoClient = new javax.swing.JLabel();
        lblFormuleAppel = new javax.swing.JLabel();
        txtNoClient = new javax.swing.JTextField();
        cbFormuleAppel = new javax.swing.JComboBox();
        lblPrenom = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        lblNom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        lblDateDeNaissance = new javax.swing.JLabel();
        txtDateDeNaissance = new javax.swing.JTextField();
        lblDateFormat = new javax.swing.JLabel();
        pnlAdresse = new javax.swing.JPanel();
        lblRue = new javax.swing.JLabel();
        lblNpa = new javax.swing.JLabel();
        txtRue = new javax.swing.JTextField();
        txtNpa = new javax.swing.JTextField();
        lblLocalite = new javax.swing.JLabel();
        txtLocalite = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chbNewsletter = new javax.swing.JCheckBox();
        btnAjouter = new javax.swing.JButton();
        btnEffacer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nouveau client");
        setResizable(false);

        lblNoClient.setText("No Client");

        lblFormuleAppel.setText("Formule d'appel *");

        txtNoClient.setEditable(false);
        txtNoClient.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNoClient.setEnabled(false);

        cbFormuleAppel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madame", "Monsieur" }));

        lblPrenom.setText("Prénom *");

        txtPrenom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedPrenom(evt);
            }
        });

        lblNom.setText("Nom *");

        txtNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedNom(evt);
            }
        });

        lblDateDeNaissance.setText("Date de naissance *");

        txtDateDeNaissance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainesDateDeNaissance(evt);
            }
        });

        lblDateFormat.setText("JJ.MM.AAAA");

        pnlAdresse.setBorder(javax.swing.BorderFactory.createTitledBorder("Adresse"));

        lblRue.setText("Rue");

        lblNpa.setText("Npa *");

        txtNpa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedNpa(evt);
            }
        });

        lblLocalite.setText("Localite");

        javax.swing.GroupLayout pnlAdresseLayout = new javax.swing.GroupLayout(pnlAdresse);
        pnlAdresse.setLayout(pnlAdresseLayout);
        pnlAdresseLayout.setHorizontalGroup(
            pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdresseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRue)
                    .addComponent(lblNpa))
                .addGap(18, 18, 18)
                .addGroup(pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRue)
                    .addGroup(pnlAdresseLayout.createSequentialGroup()
                        .addComponent(txtNpa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLocalite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocalite)))
                .addContainerGap())
        );
        pnlAdresseLayout.setVerticalGroup(
            pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdresseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRue)
                    .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlAdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNpa)
                    .addComponent(txtNpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalite)
                    .addComponent(txtLocalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblEmail.setText("Email *");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedEmail(evt);
            }
        });

        chbNewsletter.setText("Désire la newsletter");

        btnAjouter.setMnemonic('A');
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnEffacer.setMnemonic('E');
        btnEffacer.setText("Effacer");
        btnEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerActionPerformed(evt);
            }
        });

        jButton1.setMnemonic('R');
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTest.setText("Test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNoClient)
                                    .addComponent(lblFormuleAppel)
                                    .addComponent(lblPrenom)
                                    .addComponent(lblNom)
                                    .addComponent(lblDateDeNaissance)
                                    .addComponent(lblEmail))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNoClient, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblDateFormat))
                                            .addComponent(txtNom)
                                            .addComponent(txtPrenom))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cbFormuleAppel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail))))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAjouter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEffacer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTest))
                            .addComponent(chbNewsletter))
                        .addContainerGap(246, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoClient)
                    .addComponent(txtNoClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFormuleAppel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormuleAppel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenom))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDateDeNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDateFormat)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDateDeNaissance)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbNewsletter)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnEffacer)
                    .addComponent(jButton1)
                    .addComponent(btnTest))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed

        // On récupère et on teste les données du formulaire 
        // Définition des motifs permettant de valider les champs
        String motifNpa = "[0-9]{4}";
        String motifDateDeNaissance = "[0-9]{2}[.][0-9]{2}[.][0-9]{4}";
        int nbErreurs = 0;

        // Récupération du contenu des champs
        String formuleAppel = (String) cbFormuleAppel.getSelectedItem();
        String prenom = txtPrenom.getText();
        String nom = txtNom.getText();
        String dateDeNaissance = txtDateDeNaissance.getText();
        String rue = txtRue.getText();
        String npa = txtNpa.getText();
        String localite = txtLocalite.getText();
        String email = txtEmail.getText();
        boolean newsletter = chbNewsletter.isSelected();
        
        // On teste le contenu du npa, si il n'est pas vide
        if (!npa.matches(motifNpa)) {
            txtNpa.setBackground(Color.red);
            nbErreurs++;
        }

        // On teste le contenu de la date
        if (!dateDeNaissance.matches(motifDateDeNaissance)) {
            txtDateDeNaissance.setBackground(Color.red);
            nbErreurs++;
        }

        // On teste les champs obligatoires
        if (prenom.isEmpty()) {
            txtPrenom.setBackground(Color.red);
            nbErreurs++;
        }

        if (nom.isEmpty()) {
            txtNom.setBackground(Color.red);
            nbErreurs++;
        }

        if (email.isEmpty()) {
            txtEmail.setBackground(Color.red);
            nbErreurs++;
        }

        // Il y a des erreurs, on affiche un message
        if (nbErreurs != 0) {          
            JOptionPane.showMessageDialog(this, "Veuillez corriger les champs en rouge.");
        } else {                   
            // Pas d'erreurs, on effectue le traitement
            // Formattage de la date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate dateDeNaissanceFmt = LocalDate.parse(dateDeNaissance, formatter);
            
            // Création du client 
            // -- la variable est déclarée en bas dans les attributs
            client = new Client(formuleAppel,
                    prenom,
                    nom,
                    dateDeNaissanceFmt,
                    rue,
                    Integer.parseInt(npa),
                    localite,
                    email,
                    newsletter
            );

            // Ajout du client dans la bibliotheque
            Bibliotheque maBiblio = Bibliotheque.getInstance();
            maBiblio.ajouterClient(client.getNoClient(), client);
        
            // Mise à jour de l'interface
            txtNoClient.setText(String.valueOf(client.getNoClient()));

            JOptionPane.showMessageDialog(this, "Le client a bien été ajouté");
            btnAjouter.setEnabled(false);
            btnEffacer.setEnabled(true);
            
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void focusGainedPrenom(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedPrenom
        txtPrenom.setBackground(Color.white);
    }//GEN-LAST:event_focusGainedPrenom

    private void focusGainedNom(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedNom
        txtNom.setBackground(Color.white);
    }//GEN-LAST:event_focusGainedNom

    private void focusGainedEmail(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedEmail
        txtEmail.setBackground(Color.white);
    }//GEN-LAST:event_focusGainedEmail

    private void focusGainedNpa(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedNpa
        txtNpa.setBackground(Color.white);
    }//GEN-LAST:event_focusGainedNpa

    private void focusGainesDateDeNaissance(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainesDateDeNaissance
        txtDateDeNaissance.setBackground(Color.white);
    }//GEN-LAST:event_focusGainesDateDeNaissance

    private void btnEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerActionPerformed
        // Reset des champs
        txtNoClient.setText("");
        txtPrenom.setText("");
        txtNom.setText("");
        txtDateDeNaissance.setText("");
        txtNpa.setText("");
        txtLocalite.setText("");
        chbNewsletter.setSelected(false);
        cbFormuleAppel.setSelectedIndex(0);
        txtEmail.setText("");
        txtRue.setText("");

        // Activation du bouton
        btnAjouter.setEnabled(true);
    }//GEN-LAST:event_btnEffacerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEffacer;
    private javax.swing.JButton btnTest;
    private javax.swing.JComboBox cbFormuleAppel;
    private javax.swing.JCheckBox chbNewsletter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblDateDeNaissance;
    private javax.swing.JLabel lblDateFormat;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFormuleAppel;
    private javax.swing.JLabel lblLocalite;
    private javax.swing.JLabel lblNoClient;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNpa;
    private javax.swing.JLabel lblPrenom;
    private javax.swing.JLabel lblRue;
    private javax.swing.JPanel pnlAdresse;
    private javax.swing.JTextField txtDateDeNaissance;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocalite;
    private javax.swing.JTextField txtNoClient;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNpa;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtRue;
    // End of variables declaration//GEN-END:variables
    private Client client;
}
